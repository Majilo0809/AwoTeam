package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.TratamientoDao;
import modelo.dto.Tratamiento;
import vista.VistaTratamiento;

public class ControladorTratamiento implements ActionListener {
	private VistaTratamiento vista;
	private TratamientoDao modelo;
	private Tratamiento tratamiento;
	private int index;
	
	
	
	
	public ControladorTratamiento(Tratamiento tratamiento) {
		this.vista = vista;
		this.modelo = new TratamientoDao ();
		this.vista.btnBuscar.addActionListener(this);
		this.vista.btnConsultarTratamiento.addActionListener(this);
		this.vista.btnCrearTratamiento.addActionListener(this);
		this.vista.btnModificarTratamiento.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
