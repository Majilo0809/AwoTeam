package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.Paciente;

public class PacienteDao {
    private List<Paciente> pacientes;

    public PacienteDao() {
        this.pacientes = new ArrayList<>();
        // Agregar pacientes manualmente
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
    }

    // Método para buscar un paciente por su identificacion
    public Paciente buscarPorIdentificacion(String identificacion) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdentificacion().equals(identificacion)) {
                return paciente;
            }
        }
        return null;
    }

    // Método para crear un nuevo paciente
    public boolean crear(Paciente paciente) {
        if (buscarPorIdentificacion(paciente.getIdentificacion()) != null) {
            return false;
        }
        pacientes.add(paciente);
        return true;
    }

    // Método para modificar un paciente existente
    public boolean modificar(String identificacion, Paciente nuevoPaciente) {
        Paciente pacienteExistente = buscarPorIdentificacion(identificacion);
        if (pacienteExistente == null) {
            return false;
        }
        pacienteExistente.setNombre(nuevoPaciente.getNombre());
        pacienteExistente.setApellido(nuevoPaciente.getApellido());
        pacienteExistente.setDireccion(nuevoPaciente.getDireccion());
        pacienteExistente.setTelefono(nuevoPaciente.getTelefono());
        pacienteExistente.setCelular(nuevoPaciente.getCelular());
        pacienteExistente.setCiudad(nuevoPaciente.getCiudad());
        pacienteExistente.setEmail(nuevoPaciente.getEmail());
        pacienteExistente.setFechaNacimiento(nuevoPaciente.getFechaNacimiento());
        pacienteExistente.setLugarNacimiento(nuevoPaciente.getLugarNacimiento());
        pacienteExistente.setGenero(nuevoPaciente.getGenero());
        return true;
    }

    // Método para eliminar un paciente
    public boolean eliminar(String identificacion) {
        Paciente paciente = buscarPorIdentificacion(identificacion);
        if (paciente == null) {
            return false;
        }
        pacientes.remove(paciente);
        return true;
    }

    // Método para obtener todos los pacientes
    public List<Paciente> obtenerTodos() {
        return pacientes;
    }
}
