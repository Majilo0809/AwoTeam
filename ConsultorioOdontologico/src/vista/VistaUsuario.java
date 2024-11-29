package vista;

import controlador.ControladorUsuario;
import modelo.dto.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class VistaUsuario extends JFrame {
    private static final long serialVersionUID = 1L;

    private ControladorUsuario controlador;
    private JComboBox<String> rolComboBox;
    private JTextField identificacionField;
    private JTextArea resultadoArea;
    private JButton crearUsuarioBtn; 

    public VistaUsuario () {
        controlador = new ControladorUsuario ();
        configurarInterfaz();
    }

    private void configurarInterfaz() {
        setTitle("Actores/Usuarios");
        setSize(601, 511);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


        JLabel rolLabel = new JLabel("Seleccione el Rol:");
        rolLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        rolLabel.setBounds(20, 30, 127, 30);
        getContentPane().add(rolLabel);

        rolComboBox = new JComboBox<>(new String[]{"Paciente", "Odontologo", "Auxiliar", "Administrador"});
        rolComboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rolComboBox.setBounds(150, 30, 200, 30);
        getContentPane().add(rolComboBox);
       
        JLabel identificacionLabel = new JLabel("Identificacion:");
        identificacionLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        identificacionLabel.setBounds(20, 70, 120, 30);
        getContentPane().add(identificacionLabel);

        identificacionField = new JTextField();
        identificacionField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        identificacionField.setBounds(150, 70, 200, 30);
        getContentPane().add(identificacionField);


        JButton buscarBtn = new JButton("Buscar");
        buscarBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
        buscarBtn.setBounds(405, 30, 100, 30);
        getContentPane().add(buscarBtn);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(20, 120, 540, 300);
        resultadoArea.setEditable(false);
        getContentPane().add(resultadoArea);

        buscarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }
        });

        crearUsuarioBtn = new JButton("Crear Usuario");
        crearUsuarioBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
        crearUsuarioBtn.setBounds(405, 430, 155, 30);
        getContentPane().add(crearUsuarioBtn);


        crearUsuarioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirAgregarUsuarioDialog();
            }
        });
    }


    private void abrirAgregarUsuarioDialog() {
        AgregarUsuario agregarUsuarioDialog = new AgregarUsuario (this, controlador);
        agregarUsuarioDialog.setVisible(true); // Mostrar el diálogo modal
    }

    private void buscarUsuario() {
        String identificacion = identificacionField.getText();
        String rol = (String) rolComboBox.getSelectedItem();
        Usuario usuario = controlador.buscarUsuarioPorRolYIdentificacion(rol, identificacion);

        if (usuario != null) {
            resultadoArea.setText(
                "Nombres: " + usuario.getNombres() + "\n" +
                "Apellidos: " + usuario.getApellidos() + "\n" +
                "Dirección: " + usuario.getDireccionResidencia() + "\n" +
                "Teléfono Fijo: " + usuario.getTelefonoFijo() + "\n" +
                "Móvil: " + usuario.getMovil() + "\n" +
                "Ciudad: " + usuario.getCiudadResidencia() + "\n" +
                "Correo: " + usuario.getCorreoElectronico() + "\n" +
                "Fecha de Nacimiento: " + usuario.getFechaNacimiento() + "\n" +
                "Género: " + usuario.getGenero() + "\n" +
                "Lugar de Nacimiento: " + usuario.getLugarNacimiento() + "\n" +
                "Rol: " + usuario.getRol()
            );
        } else {
            resultadoArea.setText("Usuario no encontrado.");
        }
    }

    public static void main(String[] args) {
        VistaUsuario vista = new VistaUsuario();
        vista.setVisible(true);
    }
}
