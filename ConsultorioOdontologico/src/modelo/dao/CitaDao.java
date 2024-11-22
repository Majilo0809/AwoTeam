package modelo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.dto.Cita;

public class CitaDao {
	private ArrayList<Cita> lista;
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private String archivo;
	
	public CitaDao() {
		this.archivo = "cita";
		File file = new File(archivo);
			if (file.isFile()) {				
				try {
					this.entrada = new ObjectInputStream(new FileInputStream(archivo));
					this.lista = (ArrayList<Cita>) entrada.readObject();
					this.entrada.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					guardar();
				}	
			} else {
				lista = new ArrayList<>();
			}
	}
	
	//Guarda en la capa de persistencia la lista
	private void guardar() {
		try {
			this.salida = new ObjectOutputStream(new FileOutputStream(archivo));
			this.salida.writeObject(lista);
			this.salida.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean create(Cita cita) {
		lista.add(cita);
		guardar();
		return true;
	}
	
	public Cita read(int codigo) {
		for (Cita cita : lista) {
			if (cita.getCodigoCita() == codigo) {
				return cita;
			}
		}
		return null;
	}
	
	public Cita update(int index, Cita cita) {
		lista.set(index, cita);
		guardar();		
		return cita;
	}
	
	public boolean delete(Cita cita) {
		lista.remove(cita);
		guardar();
		return true;
	}
	
	public ArrayList<Cita> readAll(){
		return lista;
	}
	
	public int buscarIndex(Cita cita) {
		return lista.indexOf(cita);
	}
	
}

	
	
