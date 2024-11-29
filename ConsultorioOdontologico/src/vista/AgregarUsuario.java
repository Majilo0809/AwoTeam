package vista;

import controlador.ControladorUsuario;
import modelo.dto.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarUsuario extends JDialog {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3813822755771291L;
	private ControladorUsuario controlador;
    private JTextField identificacionField, nombreField, apellidoField, direccionField, telefonoField, movilField, ciudadField, correoField, fechaNacimientoField, lugarNacimientoField;
    private JComboBox<String> rolComboBox;
    private JButton agregarBtn, cancelarBtn;

    public AgregarUsuario(JFrame parent, ControladorUsuario controlador) {
        super(parent, "Agregar Usuario", true); // La ventana es modal
        this.controlador = controlador;
        setSize(660, 374); // Tamaño de la ventana
        setLocationRelativeTo(parent); // Centra la ventana en la pantalla
        getContentPane().setLayout(null);

        // Etiquetas y campos de texto
        JLabel label = new JLabel("Identificación:");
        label.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label.setBounds(10, 37, 111, 25);
        getContentPane().add(label);
        identificacionField = new JTextField();
        identificacionField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        identificacionField.setBounds(127, 37, 168, 25);
        getContentPane().add(identificacionField);

        JLabel label_1 = new JLabel("Nombre:");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label_1.setBounds(10, 88, 65, 25);
        getContentPane().add(label_1);
        nombreField = new JTextField();
        nombreField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        nombreField.setBounds(127, 88, 168, 25);
        getContentPane().add(nombreField);

        JLabel label_2 = new JLabel("Apellido:");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label_2.setBounds(353, 88, 70, 25);
        getContentPane().add(label_2);
        apellidoField = new JTextField();
        apellidoField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        apellidoField.setBounds(463, 88, 168, 25);
        getContentPane().add(apellidoField);

        JLabel label_3 = new JLabel("Dirección:");
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label_3.setBounds(10, 158, 79, 25);
        getContentPane().add(label_3);
        direccionField = new JTextField();
        direccionField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        direccionField.setBounds(127, 158, 168, 25);
        getContentPane().add(direccionField);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblTelefono.setBounds(10, 123, 79, 25);
        getContentPane().add(lblTelefono);
        telefonoField = new JTextField();
        telefonoField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        telefonoField.setBounds(127, 123, 168, 25);
        getContentPane().add(telefonoField);

        JLabel lblMovil = new JLabel("Movil:");
        lblMovil.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblMovil.setBounds(353, 123, 65, 25);
        getContentPane().add(lblMovil);
        movilField = new JTextField();
        movilField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        movilField.setBounds(463, 123, 168, 25);
        getContentPane().add(movilField);

        JLabel label_6 = new JLabel("Ciudad:");
        label_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label_6.setBounds(353, 158, 70, 25);
        getContentPane().add(label_6);
        ciudadField = new JTextField();
        ciudadField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        ciudadField.setBounds(463, 158, 168, 25);
        getContentPane().add(ciudadField);

        JLabel label_7 = new JLabel("Correo:");
        label_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label_7.setBounds(10, 193, 79, 25);
        getContentPane().add(label_7);
        correoField = new JTextField();
        correoField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        correoField.setBounds(127, 193, 168, 25);
        getContentPane().add(correoField);

        JLabel lblFnacimiento = new JLabel("F.Nacimiento:");
        lblFnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblFnacimiento.setBounds(353, 193, 168, 25);
        getContentPane().add(lblFnacimiento);
        fechaNacimientoField = new JTextField();
        fechaNacimientoField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        fechaNacimientoField.setBounds(463, 193, 168, 25);
        getContentPane().add(fechaNacimientoField);

        JLabel lblLnacimiento = new JLabel("L.Nacimiento:");
        lblLnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblLnacimiento.setBounds(10, 228, 168, 25);
        getContentPane().add(lblLnacimiento);
        lugarNacimientoField = new JTextField();
        lugarNacimientoField.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lugarNacimientoField.setBounds(127, 228, 168, 25);
        getContentPane().add(lugarNacimientoField);

        JLabel label_10 = new JLabel("Rol:");
        label_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
        label_10.setBounds(353, 228, 87, 25);
        getContentPane().add(label_10);
        rolComboBox = new JComboBox<>(new String[]{"Paciente", "Odontologo", "Auxiliar", "Administrador"});
        rolComboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
        rolComboBox.setBounds(463, 228, 168, 25);
        getContentPane().add(rolComboBox);

        // Botones de agregar y cancelar
        agregarBtn = new JButton("Agregar");
        agregarBtn.setFont(new Font("Tahoma", Font.BOLD, 17));
        agregarBtn.setBounds(127, 292, 168, 25);
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(new Font("Tahoma", Font.BOLD, 17));
        cancelarBtn.setBounds(357, 292, 168, 25);
        getContentPane().add(agregarBtn);
        getContentPane().add(cancelarBtn);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 71, 621, 32);
        getContentPane().add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 265, 621, 17);
        getContentPane().add(separator_1);
        
        JLabel lblNewLabel = new JLabel("VENTANA DE CREACION DE USUARIOS");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        lblNewLabel.setBounds(274, 0, 367, 32);
        getContentPane().add(lblNewLabel);

        // Acción del botón de agregar
        agregarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuario();
            }
        });

        // Acción del botón de cancelar
        cancelarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra el diálogo si se cancela
            }
        });
    }

    private void agregarUsuario() {
        // Obtener los datos del formulario
        String identificacion = identificacionField.getText();
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String direccion = direccionField.getText();
        String telefono = telefonoField.getText();
        String movil = movilField.getText();
        String ciudad = ciudadField.getText();
        String correo = correoField.getText();
        String fechaNacimiento = fechaNacimientoField.getText();
        String lugarNacimiento = lugarNacimientoField.getText();
        String rol = (String) rolComboBox.getSelectedItem();

 
        Usuario usuario = new Usuario();
        controlador.agregarUsuario(usuario);

        JOptionPane.showMessageDialog(this, "Usuario agregado correctamente.");
        dispose();  
    }
}
