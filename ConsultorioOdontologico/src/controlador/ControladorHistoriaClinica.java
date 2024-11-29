package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dto.Paciente;
import modelo.dao.PacienteDao;
import vista.VistaHistoriaClinica;

public class ControladorHistoriaClinica implements ActionListener {
    private VistaHistoriaClinica vista;
    private PacienteDao modelo;
    
    public ControladorHistoriaClinica(VistaHistoriaClinica vista) {
        this.vista = vista;
        this.modelo = new PacienteDao();

        // Registrar los botones al controlador
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnCrear.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnBuscar) {
            buscarPaciente();
        } else if (e.getSource() == vista.btnCrear) {
            crearPaciente();
        } else if (e.getSource() == vista.btnModificar) {
            modificarPaciente();
        } else if (e.getSource() == vista.btnEliminar) {
            eliminarPaciente();
        }
    }

    private void buscarPaciente() {
        String identificacion = vista.textFIdentificacion.getText();
        if (identificacion.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Por favor, ingrese una identificación.");
            return;
        }

        Paciente paciente = modelo.buscarPorIdentificacion(identificacion);
        if (paciente != null) {
            llenarCampos(paciente);
        } else {
            JOptionPane.showMessageDialog(vista, "No se encontró ningún paciente con esa identificación.");
        }
    }

    private void llenarCampos(Paciente paciente) {
        vista.textFNombre.setText(paciente.getNombre());
        vista.textFApellido.setText(paciente.getApellido());
        vista.textFDireccion.setText(paciente.getDireccion());
        vista.textFTelefono.setText(paciente.getTelefono());
        vista.textFCelular.setText(paciente.getCelular());
        vista.textFCiudad.setText(paciente.getCiudad());
        vista.textFEmail.setText(paciente.getEmail());
        vista.textFFechaNacimiento.setText(paciente.getFechaNacimiento());
        vista.textFLugarNacimiento.setText(paciente.getLugarNacimiento());
        vista.textFGenero.setText(paciente.getGenero());
    }

    private void crearPaciente() {
        Paciente paciente = obtenerDatosFormulario();
        if (modelo.crear(paciente)) {
            JOptionPane.showMessageDialog(vista, "Paciente creado exitosamente.");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo crear el paciente.");
        }
    }

    private void modificarPaciente() {
        String identificacion = vista.textFIdentificacion.getText();
        if (identificacion.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Por favor, busque primero al paciente para modificar.");
            return;
        }

        Paciente paciente = obtenerDatosFormulario();
        if (modelo.modificar(identificacion, paciente)) {
            JOptionPane.showMessageDialog(vista, "Paciente modificado exitosamente.");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo modificar el paciente.");
        }
    }

    private void eliminarPaciente() {
        String identificacion = vista.textFIdentificacion.getText();
        if (identificacion.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Por favor, busque primero al paciente para eliminar.");
            return;
        }

        if (modelo.eliminar(identificacion)) {
            JOptionPane.showMessageDialog(vista, "Paciente eliminado exitosamente.");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo eliminar el paciente.");
        }
    }

    private Paciente obtenerDatosFormulario() {
        Paciente paciente = new Paciente();
        paciente.setIdentificacion(vista.textFIdentificacion.getText());
        paciente.setNombre(vista.textFNombre.getText());
        paciente.setApellido(vista.textFApellido.getText());
        paciente.setDireccion(vista.textFDireccion.getText());
        paciente.setTelefono(vista.textFTelefono.getText());
        paciente.setCelular(vista.textFCelular.getText());
        paciente.setCiudad(vista.textFCiudad.getText());
        paciente.setEmail(vista.textFEmail.getText());
        paciente.setFechaNacimiento(vista.textFFechaNacimiento.getText());
        paciente.setLugarNacimiento(vista.textFLugarNacimiento.getText());
        paciente.setGenero(vista.textFGenero.getText());
        return paciente;
    }

    private void limpiarCampos() {
        vista.textFIdentificacion.setText("");
        vista.textFNombre.setText("");
        vista.textFApellido.setText("");
        vista.textFDireccion.setText("");
        vista.textFTelefono.setText("");
        vista.textFCelular.setText("");
        vista.textFCiudad.setText("");
        vista.textFEmail.setText("");
        vista.textFFechaNacimiento.setText("");
        vista.textFLugarNacimiento.setText("");
        vista.textFGenero.setText("");
    }
}
