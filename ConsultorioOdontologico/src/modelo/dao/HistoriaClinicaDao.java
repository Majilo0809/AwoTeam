package modelo.dao;

import modelo.dto.HistoriaClinica;
import java.util.ArrayList;
import java.util.List;

public class HistoriaClinicaDao{

    private List<HistoriaClinica> historiasClinicas;


    public HistoriaClinicaDao() {
        this.historiasClinicas = new ArrayList<>();
    }


    public void agregarHistoriaClinica(HistoriaClinica historia) {
        historiasClinicas.add(historia);
        System.out.println("Historia clínica agregada con exito.");
    }

    public List<HistoriaClinica> obtenerHistoriasClinicas() {
        return historiasClinicas;
    }

    public HistoriaClinica buscarHistoriaPorConsecutivo(int consecutivo) {
        for (HistoriaClinica historia : historiasClinicas) {
            if (historia.getNumeroConsecutivo() == consecutivo) {
                return historia;
            }
        }
        return null;
    }

    public boolean actualizarHistoriaClinica(HistoriaClinica historiaActualizada) {
        for (int i = 0; i < historiasClinicas.size(); i++) {
            if (historiasClinicas.get(i).getNumeroConsecutivo() == historiaActualizada.getNumeroConsecutivo()) {
                historiasClinicas.set(i, historiaActualizada);
                System.out.println("Historia clínica actualizada con exito.");
                return true;
            }
        }
        return false; 
    }

    public boolean eliminarHistoriaClinica(int consecutivo) {
        for (int i = 0; i < historiasClinicas.size(); i++) {
            if (historiasClinicas.get(i).getNumeroConsecutivo() == consecutivo) {
                historiasClinicas.remove(i);
                System.out.println("Historia clínica eliminada con exito.");
                return true;
            }
        }
        return false;
    }
}
