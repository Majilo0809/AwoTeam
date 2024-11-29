package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.dto.Odontologo;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaCita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textFCodigoCita;
	public JTextField textFHoraCita;
	public JTextField textFOdontologoCita;
	public JTextField textFConsultorioCita;
	public JButton btnCrearCita;
	public JButton btnModificarCita;
	public JButton btnEliminarCita;	
	public JButton btnConsultarCita;
	public JButton btnBuscar;
	private JTable tableConsultarCita;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCita frame = new VistaCita();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaCita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCrearCita = new JButton("Agendar");
		btnCrearCita.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCrearCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearCita.setBounds(55, 334, 120, 45);
		contentPane.add(btnCrearCita);
		
		btnModificarCita = new JButton("Modificar");
		btnModificarCita.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModificarCita.setBounds(201, 334, 120, 45);
		contentPane.add(btnModificarCita);
		
		btnEliminarCita = new JButton("Eliminar");
		btnEliminarCita.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEliminarCita.setBounds(499, 334, 120, 45);
		contentPane.add(btnEliminarCita);
		
		btnConsultarCita = new JButton("Consultar");
		btnConsultarCita.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConsultarCita.setBounds(344, 334, 120, 45);
		contentPane.add(btnConsultarCita);
		
		JLabel lblNewLabel = new JLabel("Ingrese Codigo de Cita: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(40, 97, 178, 18);
		contentPane.add(lblNewLabel);
		
		textFCodigoCita = new JTextField();
		textFCodigoCita.setBounds(215, 97, 173, 20);
		contentPane.add(textFCodigoCita);
		textFCodigoCita.setColumns(10);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBackground(new Color(204, 255, 204));
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBuscar.setBounds(408, 90, 130, 30);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("Dia:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(40, 137, 143, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora Cita:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(40, 175, 143, 13);
		contentPane.add(lblNewLabel_2);
		
		textFHoraCita = new JTextField();
		textFHoraCita.setBounds(215, 175, 173, 20);
		contentPane.add(textFHoraCita);
		textFHoraCita.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CITAS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_3.setBounds(40, 10, 129, 66);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Odontologo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(40, 213, 143, 18);
		contentPane.add(lblNewLabel_4);
		
		textFOdontologoCita = new JTextField();
		textFOdontologoCita.setBounds(215, 213, 173, 20);
		contentPane.add(textFOdontologoCita);
		textFOdontologoCita.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Consultorio:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(40, 255, 143, 13);
		contentPane.add(lblNewLabel_5);
		
		textFConsultorioCita = new JTextField();
		textFConsultorioCita.setBounds(215, 255, 173, 20);
		contentPane.add(textFConsultorioCita);
		textFConsultorioCita.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(22, 65, 617, 2);
		contentPane.add(separator);
		
		tableConsultarCita = new JTable();
		tableConsultarCita.setModel(new DefaultTableModel(
			new Object[][] {
				{textFOdontologoCita, null, null, null, ""},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"CODIGO", "FECHA", "HORA", "ODONTOLOGO", "CONSULTORIO"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		tableConsultarCita.getColumnModel().getColumn(3).setPreferredWidth(80);
		tableConsultarCita.setCellSelectionEnabled(true);
		tableConsultarCita.setBounds(40, 440, 663, 125);
		contentPane.add(tableConsultarCita);
		
		JComboBox comboBoxDiaCita = new JComboBox();
		comboBoxDiaCita.setModel(new DefaultComboBoxModel(new String[] {"", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"}));
		comboBoxDiaCita.setBounds(215, 137, 173, 20);
		contentPane.add(comboBoxDiaCita);
	}
}
