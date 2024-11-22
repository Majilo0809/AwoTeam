package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.CitaDao;
import modelo.dto.Cita;
import vista.VistaCita;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;
public class ControladorCita implements ActionListener {
	private VistaCita vista;
	private CitaDao modelo;
	private Cita cita;
	private int index;	
	
	/**
	 * @param vista
	 * @param modelo
	 * @param cita
	 * @param index
	 */
	public ControladorCita(VistaCita vista) {
		this.vista = vista;
		this.modelo = new CitaDao();
		this.vista.btnBuscar.addActionListener(this);
		this.vista.btnConsultarCita.addActionListener(this);
		this.vista.btnCrearCita.addActionListener(this);
		this.vista.btnEliminarCita.addActionListener(this);
		this.vista.btnModificarCita.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//registrar una nueva cita
		if (e.getSource().equals(vista.btnCrearCita)) {
			cita = new Cita();
			cita.setCodigoCita(Integer.valueOf(vista.textFCodigoCita.getText()));
			cita.setConsultorio(vista.textFConsultorioCita.getText());
			cita.setFechaCita(vista.textFFechaCita.getText());
			cita.setHoraCita(vista.textFHoraCita.getText());
			
			if (modelo.create(cita)) 
				JOptionPane.showMessageDialog(null, "Cita creada exitosamente.");
			else
				JOptionPane.showMessageDialog(null, "No se pudo crear la cita");
			
			
		}
		
		
		
		
		
	}
	
	
	
}
