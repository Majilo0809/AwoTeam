package modelo.dao;

import modelo.dto.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao{

    private static List<Usuario> pacientes = new ArrayList<>();
    private static List<Usuario> odontologos = new ArrayList<>();
    private static List<Usuario> auxiliares = new ArrayList<>();
    private static List<Usuario> administradores = new ArrayList<>();

    public UsuarioDao() {
        if (pacientes.isEmpty()) {
            pacientes.add(new Usuario());
            odontologos.add(new Usuario());
            auxiliares.add(new Usuario());
            administradores.add(new Usuario());
        }
    }


    public List<Usuario> buscarUsuariosPorRol(String rol) {
        List<Usuario> resultado = new ArrayList<>();
        switch (rol) {
            case "Paciente":
                resultado.addAll(pacientes);
                break;
            case "Odontologo":
                resultado.addAll(odontologos);
                break;
            case "Auxiliar":
                resultado.addAll(auxiliares);
                break;
            case "Administrador":
                resultado.addAll(administradores);
                break;
        }
        return resultado;
    }

    // Buscar el usuario pai
    public Usuario buscarUsuarioPorRolYIdentificacion(String rol, String identificacion) {
        for (Usuario usuario : buscarUsuariosPorRol(rol)) {
            if (usuario.getIdentificacion().equals(identificacion)) {
                return usuario;
            }
        }
        return null;  // Si no se encuentra yuca null
    }

    // Agrega parceritos
    public void agregarUsuario(Usuario usuario) {
        switch (usuario.getRol()) {
            case "Paciente":
                pacientes.add(usuario);
                break;
            case "Odontologo":
                odontologos.add(usuario);
                break;
            case "Auxiliar":
                auxiliares.add(usuario);
                break;
            case "Administrador":
                administradores.add(usuario);
                break;
        }
    }
}
