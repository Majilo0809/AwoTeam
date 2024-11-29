package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.CitaDao;
import modelo.dto.Cita;
import modelo.dto.Odontologo;
import vista.VistaCita;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;
public class ControladorCita implements ActionListener {
	private VistaCita vista;
	private CitaDao modelo;
	private Cita cita;
	private int index;
	private Odontologo odontologo;	
	
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
			odontologo = new Odontologo();
			cita.setCodigoCita(Integer.valueOf(vista.textFCodigoCita.getText()));
			cita.setConsultorio(vista.textFConsultorioCita.getText());
			//cita.setFechaCita(vista.textFFechaCita.getText());
			//cita.setHoraCita(vista.textFHoraCita.getText());
			
			if (modelo.create(cita)) 
				JOptionPane.showMessageDialog(null, "Cita creada exitosamente.");
			else
				JOptionPane.showMessageDialog(null, "No se pudo crear la cita");
		}
		
		//Buscar una cita; si existe muestra, sino muestra un mensaje
		if (e.getSource().equals(vista.btnBuscar)) {
			cita = modelo.read(Integer.valueOf(vista.textFCodigoCita.getText()));
			if (cita == null) 
				JOptionPane.showMessageDialog(null, "No Existe, primero registrela.");
			else {
				index = modelo.buscarIndex(cita);
				vista.textFHoraCita.setText(String.valueOf(cita.getHoraCita()));
				vista.textFOdontologoCita.setText(odontologo.getNombreCompleto());
				vista.textFConsultorioCita.setText(cita.getConsultorio());
			}			
		}
		
		//Borrar una cita
		if (e.getSource().equals(vista.btnEliminarCita)) {
			int repuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de Borrar?", "Confirmar", JOptionPane.YES_NO_OPTION);
			if (repuesta == JOptionPane.YES_OPTION) {
				boolean borrado = modelo.delete(cita);
				if (borrado)
					JOptionPane.showMessageDialog(null, "La cita fue borrada");
				else 
					JOptionPane.showMessageDialog(null, "No fue posible borrar el estudiante");
			}			
		}
		
		//Modificar las citas
		if (e.getSource().equals(vista.btnModificarCita)) {
			int respuesta = JOptionPane.showConfirmDialog(vista, "¿Seguro de Modificar?", "Confirmar", JOptionPane.YES_NO_OPTION);
			if (respuesta == JOptionPane.YES_OPTION) {
				modelo.update(index, cita);
				JOptionPane.showMessageDialog(null, "Los Datos de la cita fueron actualizados.");
				
			}
		}		
		
		
		
	}
}
