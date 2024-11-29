package modelo.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita implements Serializable {
	private int codigoCita;
	private String diaCita;
	private int horaCita;
	private Odontologo odontologo;
	private String consultorio;
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
	 * @return the diaCita
	 */
	public String getDiaCita() {
		return diaCita;
	}
	/**
	 * @param diaCita the diaCita to set
	 */
	public void setDiaCita(String diaCita) {
		this.diaCita = diaCita;
	}
	/**
	 * @return the horaCita
	 */
	public int getHoraCita() {
		return horaCita;
	}
	/**
	 * @param horaCita the horaCita to set
	 */
	public void setHoraCita(int horaCita) {
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
	public String getConsultorio() {
		return consultorio;
	}
	/**
	 * @param consultorio the consultorio to set
	 */
	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}
	
	
		
}
