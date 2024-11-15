package modelo.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Tratamiento implements Serializable {
	private int numeroConsecutivo;
	private LocalDateTime fechaAtencion;
	private LocalDateTime horaAtencion;
	private String diagnostivo;
	private String observaciones;
	/**
	 * @return the numeroConsecutivo
	 */
	public int getNumeroConsecutivo() {
		return numeroConsecutivo;
	}
	/**
	 * @param numeroConsecutivo the numeroConsecutivo to set
	 */
	public void setNumeroConsecutivo(int numeroConsecutivo) {
		this.numeroConsecutivo = numeroConsecutivo;
	}
	/**
	 * @return the fechaAtencion
	 */
	public LocalDateTime getFechaAtencion() {
		return fechaAtencion;
	}
	/**
	 * @param fechaAtencion the fechaAtencion to set
	 */
	public void setFechaAtencion(LocalDateTime fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}
	/**
	 * @return the horaAtencion
	 */
	public LocalDateTime getHoraAtencion() {
		return horaAtencion;
	}
	/**
	 * @param horaAtencion the horaAtencion to set
	 */
	public void setHoraAtencion(LocalDateTime horaAtencion) {
		this.horaAtencion = horaAtencion;
	}
	/**
	 * @return the diagnostivo
	 */
	public String getDiagnostivo() {
		return diagnostivo;
	}
	/**
	 * @param diagnostivo the diagnostivo to set
	 */
	public void setDiagnostivo(String diagnostivo) {
		this.diagnostivo = diagnostivo;
	}
	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}
	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
