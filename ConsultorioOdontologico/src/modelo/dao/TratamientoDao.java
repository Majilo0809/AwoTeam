package modelo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



import modelo.dto.Tratamiento;

public class TratamientoDao {
	private ArrayList<Tratamiento> lista;
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private String archivo;
	
	public TratamientoDao() {
		this.archivo = "tratamiento";
		File file = new File(archivo);
			if (file.isFile()) {				
				try {
					this.entrada = new ObjectInputStream(new FileInputStream(archivo));
					this.lista = (ArrayList<Tratamiento>) entrada.readObject();
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

	public boolean create(Tratamiento tratamiento) {
		lista.add(tratamiento);
		guardar();
		return true;
	}
	
	public Tratamiento read(int numeroConsecutivo) {
		for (Tratamiento tratamiento: lista) {
			if (tratamiento.getNumeroConsecutivo() == numeroConsecutivo) {
				return tratamiento;
			}
		}
		return null;
	}
	
	public Tratamiento update(int index, Tratamiento tratamiento) {
		lista.set(index, tratamiento);
		guardar();		
		return tratamiento;
	}
	
	public boolean delete(Tratamiento tratamiento) {
		lista.remove(tratamiento);
		guardar();
		return true;
	}
	
	public ArrayList<Tratamiento> readAll(){
		return lista;
	}
	
	public int buscarIndex(Tratamiento tratamiento) {
		return lista.indexOf(tratamiento);
	}
	
}
