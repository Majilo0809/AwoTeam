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

public class VistaTratamiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textFNumeroConsecutivo;
	public JTextField textFDiaTratamiento;
	public JTextField textFHoraAtencion;
	public JTextField textFDiagnostivoTratamiento;
	public JTextField textFObservacionesTratamiento;
	public JButton btnCrearTratamiento;
	public JButton btnModificarTratamiento;
	public JButton btnConsultarTratamiento;
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
	public VistaTratamiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCrearTratamiento = new JButton("Crear");
		btnCrearTratamiento.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCrearTratamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearTratamiento.setBounds(40, 334, 120, 45);
		contentPane.add(btnCrearTratamiento);
		
		btnModificarTratamiento = new JButton("Modificar");
		btnModificarTratamiento.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModificarTratamiento.setBounds(185, 334, 120, 45);
		contentPane.add(btnModificarTratamiento);
		
		btnConsultarTratamiento = new JButton("Consultar");
		btnConsultarTratamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultarTratamiento.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConsultarTratamiento.setBounds(328, 334, 120, 45);
		contentPane.add(btnConsultarTratamiento);
		
		JLabel lblNewLabel = new JLabel("Numero Consecutivo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(40, 97, 178, 18);
		contentPane.add(lblNewLabel);
		
		textFNumeroConsecutivo = new JTextField();
		textFNumeroConsecutivo.setBounds(215, 97, 173, 20);
		contentPane.add(textFNumeroConsecutivo);
		textFNumeroConsecutivo.setColumns(10);
		
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
		
		textFDiaTratamiento = new JTextField();
		textFDiaTratamiento.setBounds(215, 137, 173, 20);
		contentPane.add(textFDiaTratamiento);
		textFDiaTratamiento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hora de Atencion:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(40, 175, 143, 13);
		contentPane.add(lblNewLabel_2);
		
		textFHoraAtencion = new JTextField();
		textFHoraAtencion.setBounds(215, 175, 173, 20);
		contentPane.add(textFHoraAtencion);
		textFHoraAtencion.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tratamiento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_3.setBounds(40, 10, 260, 66);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Diagnostico:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(40, 213, 143, 18);
		contentPane.add(lblNewLabel_4);
		
		textFDiagnostivoTratamiento = new JTextField();
		textFDiagnostivoTratamiento.setBounds(215, 213, 173, 20);
		contentPane.add(textFDiagnostivoTratamiento);
		textFDiagnostivoTratamiento.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Observaciones:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(40, 255, 143, 13);
		contentPane.add(lblNewLabel_5);
		
		textFObservacionesTratamiento = new JTextField();
		textFObservacionesTratamiento.setBounds(215, 255, 424, 45);
		contentPane.add(textFObservacionesTratamiento);
		textFObservacionesTratamiento.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(22, 65, 617, 2);
		contentPane.add(separator);
		
		tableConsultarCita = new JTable();
		tableConsultarCita.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"CODIGO", "FECHA", "HORA", "ODONTOLOGO", "CONSULTORIO"
			}
		));
		tableConsultarCita.getColumnModel().getColumn(3).setPreferredWidth(80);
		tableConsultarCita.setCellSelectionEnabled(true);
		tableConsultarCita.setBounds(40, 440, 663, 125);
		contentPane.add(tableConsultarCita);
	}
}
