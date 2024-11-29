package vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class VistaHistoriaClinica extends JFrame {

    public JTextField textFIdentificacion;
    public JTextField textFNombre;
    public JTextField textFApellido;
    public JTextField textFDireccion;
    public JTextField textFTelefono;
    public JTextField textFCelular;
    public JTextField textFCiudad;
    public JTextField textFEmail;
    public JTextField textFFechaNacimiento;
    public JTextField textFLugarNacimiento;
    public JTextField textFGenero;
    public JButton btnBuscar;
    public JButton btnCrear;
    public JButton btnModificar;
    public JButton btnEliminar;
    private JSeparator separator_1;
    private JTable table;

    public VistaHistoriaClinica() {

        setTitle("Historia Clínica");
        setSize(707, 613);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

  
        JLabel label = new JLabel("Identificación:");
        label.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label.setBounds(10, 46, 112, 30);
        panel.add(label);
        textFIdentificacion = new JTextField();
        textFIdentificacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFIdentificacion.setBounds(114, 46, 218, 30);
        panel.add(textFIdentificacion);

        JLabel label_1 = new JLabel("Nombre:");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_1.setBounds(10, 107, 68, 30);
        panel.add(label_1);
        textFNombre = new JTextField();
        textFNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFNombre.setBounds(114, 107, 218, 30);
        panel.add(textFNombre);

        JLabel label_2 = new JLabel("Apellido:");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_2.setBounds(375, 107, 81, 30);
        panel.add(label_2);
        textFApellido = new JTextField();
        textFApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFApellido.setBounds(483, 107, 195, 30);
        panel.add(textFApellido);

        JLabel label_3 = new JLabel("Dirección:");
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_3.setBounds(375, 227, 81, 30);
        panel.add(label_3);
        textFDireccion = new JTextField();
        textFDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFDireccion.setBounds(483, 227, 195, 30);
        panel.add(textFDireccion);

        JLabel label_4 = new JLabel("Teléfono:");
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_4.setBounds(375, 147, 81, 30);
        panel.add(label_4);
        textFTelefono = new JTextField();
        textFTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFTelefono.setBounds(483, 147, 195, 30);
        panel.add(textFTelefono);

        JLabel label_5 = new JLabel("Celular:");
        label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_5.setBounds(10, 147, 195, 30);
        panel.add(label_5);
        textFCelular = new JTextField();
        textFCelular.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFCelular.setBounds(114, 147, 218, 30);
        panel.add(textFCelular);

        JLabel label_6 = new JLabel("Ciudad:");
        label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_6.setBounds(375, 185, 81, 30);
        panel.add(label_6);
        textFCiudad = new JTextField();
        textFCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFCiudad.setBounds(483, 187, 195, 30);
        panel.add(textFCiudad);

        JLabel label_7 = new JLabel("Email:");
        label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_7.setBounds(10, 185, 68, 30);
        panel.add(label_7);
        textFEmail = new JTextField();
        textFEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFEmail.setBounds(114, 185, 218, 30);
        panel.add(textFEmail);

        JLabel lblFnacimiento = new JLabel("F.Nacimiento:");
        lblFnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFnacimiento.setBounds(375, 267, 98, 30);
        panel.add(lblFnacimiento);
        textFFechaNacimiento = new JTextField();
        textFFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFFechaNacimiento.setBounds(483, 267, 195, 30);
        panel.add(textFFechaNacimiento);

        JLabel lblLnacimiento = new JLabel("L.Nacimiento:");
        lblLnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblLnacimiento.setBounds(10, 267, 195, 30);
        panel.add(lblLnacimiento);
        textFLugarNacimiento = new JTextField();
        textFLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFLugarNacimiento.setBounds(114, 267, 218, 30);
        panel.add(textFLugarNacimiento);

        JLabel label_10 = new JLabel("Género:");
        label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label_10.setBounds(10, 227, 73, 30);
        panel.add(label_10);
        textFGenero = new JTextField();
        textFGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textFGenero.setBounds(114, 227, 218, 30);
        panel.add(textFGenero);

        // Crear botones y agregarlos al panel
        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnBuscar.setBounds(483, 46, 195, 30);
        panel.add(btnBuscar);

        btnCrear = new JButton("Crear");
        btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnCrear.setBounds(461, 307, 195, 30);
        panel.add(btnCrear);

        btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnModificar.setBounds(51, 307, 195, 30);
        panel.add(btnModificar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnEliminar.setBounds(256, 307, 195, 30);
        panel.add(btnEliminar);
        
        JLabel lblNewLabel = new JLabel("Historia Clinica");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(10, 10, 195, 26);
        panel.add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 86, 668, 26);
        panel.add(separator);
        
        separator_1 = new JSeparator();
        separator_1.setBounds(10, 347, 668, 8);
        panel.add(separator_1);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Nombre", "Apellido", "Celular", "Telefono", "Email", "Ciudad", "Genero", "Direccion", "L.Nacimiento", "F.Nacimiento"},
        		{null, null, null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
        	}
        ));
        table.getColumnModel().getColumn(0).setMinWidth(16);
        table.setBounds(10, 364, 668, 32);
        panel.add(table);
    }
}
