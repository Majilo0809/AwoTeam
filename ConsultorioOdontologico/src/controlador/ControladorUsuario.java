package controlador;

import modelo.dao.UsuarioDao;
import modelo.dto.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ControladorUsuario {

    private UsuarioDao usuarioDao;

    public ControladorUsuario () {
        usuarioDao= new UsuarioDao(); 
    }

    // buscar un usuario por rol e id
    public Usuario buscarUsuarioPorRolYIdentificacion(String rol, String identificacion) {
        return usuarioDao.buscarUsuarioPorRolYIdentificacion(rol, identificacion);
    }

    // agregar un nuevo socito
    public void agregarUsuario(Usuario usuario) {
        usuarioDao.agregarUsuario(usuario);
    }

    //buscar todos los usuarios de un rol específico
    public List<Usuario> buscarUsuariosPorRol(String rol) {
        return usuarioDao.buscarUsuariosPorRol(rol);
    }

    // Método para listar todos los usuarios, sin importar su rol
    public List<Usuario> listarTodosUsuarios() {
        List<Usuario> todosUsuarios = new ArrayList<>();
        todosUsuarios.addAll(usuarioDao.buscarUsuariosPorRol("Paciente"));
        todosUsuarios.addAll(usuarioDao.buscarUsuariosPorRol("Odontologo"));
        todosUsuarios.addAll(usuarioDao.buscarUsuariosPorRol("Auxiliar"));
        todosUsuarios.addAll(usuarioDao.buscarUsuariosPorRol("Administrador"));
        return todosUsuarios;
    }

   /* //eliminar un usuario por cedula
    public void eliminarUsuario(String identificacion) {
        usuarioDao.eliminarUsuario(identificacion);
    }

    //actualizar los datos de un usuario ya- existente
    public void actualizarUsuario(Usuario usuario) {
        usuarioDao.actualizarUsuario(usuario);
    }
	*/
	
    //verificar si un usuario ya existe mi perrito
    public boolean existeUsuario(String rol, String identificacion) {
        Usuario usuario = buscarUsuarioPorRolYIdentificacion(rol, identificacion);
        return usuario != null;
    }
}

