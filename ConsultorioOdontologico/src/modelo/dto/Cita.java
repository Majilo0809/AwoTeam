package modelo.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Cita implements Serializable {
	private int codigoCita;
	private LocalDateTime fechaCita;
	private LocalDateTime horaCita;
	private Odontologo odontologo;
	private int consultorio;
	/**
	 * @return the codigoCita
	 */
	public int getCodigoCita() {
		return codigoCita;
	}
	/**
	 * @param codigoCita the codigoCita to set
	 */
	public void setCodigoCita(int codigoCita) {
		this.codigoCita = codigoCita;
	}
	/**
	 * @return the fechaCita
	 */
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	/**
	 * @param fechaCita the fechaCita to set
	 */
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	/**
	 * @return the horaCita
	 */
	public LocalDateTime getHoraCita() {
		return horaCita;
	}
	/**
	 * @param horaCita the horaCita to set
	 */
	public void setHoraCita(LocalDateTime horaCita) {
		this.horaCita = horaCita;
	}
	/**
	 * @return the odontologo
	 */
	public Odontologo getOdontologo() {
		return odontologo;
	}
	/**
	 * @param odontologo the odontologo to set
	 */
	public void setOdontologo(Odontologo odontologo) {
		this.odontologo = odontologo;
	}
	/**
	 * @return the consultorio
	 */
	public int getConsultorio() {
		return consultorio;
	}
	/**
	 * @param consultorio the consultorio to set
	 */
	public void setConsultorio(int consultorio) {
		this.consultorio = consultorio;
	}
	
	
	
	
}
