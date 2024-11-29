package modelo.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Tratamiento implements Serializable {
	private int numeroConsecutivo;
	private String diaAtencion;
	private int horaAtencion;
	private String diagnostivo;
	private String observaciones;
	public int getNumeroConsecutivo() {
		return numeroConsecutivo;
	}
	public void setNumeroConsecutivo(int numeroConsecutivo) {
		this.numeroConsecutivo = numeroConsecutivo;
	}
	public String getDiaAtencion() {
		return diaAtencion;
	}
	public void setDiaAtencion(String diaAtencion) {
		this.diaAtencion = diaAtencion;
	}
	public int getHoraAtencion() {
		return horaAtencion;
	}
	public void setHoraAtencion(int horaAtencion) {
		this.horaAtencion = horaAtencion;
	}
	public String getDiagnostivo() {
		return diagnostivo;
	}
	public void setDiagnostivo(String diagnostivo) {
		this.diagnostivo = diagnostivo;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	
}
