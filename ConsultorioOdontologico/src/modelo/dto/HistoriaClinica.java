package modelo.dto;

import java.io.Serializable;

public class HistoriaClinica implements Serializable {

    private int numeroConsecutivo;
    private String odontologo;
    private String auxiliarOdontologia;
    private String paciente;
    private String fecha;
    private String apertura;
    private String antecedentes;
    private String evaluacionOdontologica;
    private String observaciones;
    private String ocupacionPaciente;
    private String acompanante;
    private String telefonoAcompanante;
    private String direccionAcompanante;

    public int getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    public void setNumeroConsecutivo(int numeroConsecutivo) {
        this.numeroConsecutivo = numeroConsecutivo;
    }

    public String getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(String odontologo) {
        this.odontologo = odontologo;
    }

    public String getAuxiliarOdontologia() {
        return auxiliarOdontologia;
    }

    public void setAuxiliarOdontologia(String auxiliarOdontologia) {
        this.auxiliarOdontologia = auxiliarOdontologia;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getEvaluacionOdontologica() {
        return evaluacionOdontologica;
    }

    public void setEvaluacionOdontologica(String evaluacionOdontologica) {
        this.evaluacionOdontologica = evaluacionOdontologica;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getOcupacionPaciente() {
        return ocupacionPaciente;
    }

    public void setOcupacionPaciente(String ocupacionPaciente) {
        this.ocupacionPaciente = ocupacionPaciente;
    }

    public String getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(String acompanante) {
        this.acompanante = acompanante;
    }

    public String getTelefonoAcompanante() {
        return telefonoAcompanante;
    }

    public void setTelefonoAcompanante(String telefonoAcompanante) {
        this.telefonoAcompanante = telefonoAcompanante;
    }

    public String getDireccionAcompanante() {
        return direccionAcompanante;
    }

    public void setDireccionAcompanante(String direccionAcompanante) {
        this.direccionAcompanante = direccionAcompanante;
    }
    }

