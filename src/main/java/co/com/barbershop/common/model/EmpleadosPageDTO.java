package co.com.barbershop.common.model;

import java.io.Serializable;
import java.util.ArrayList;

public class EmpleadosPageDTO implements Serializable {
	
	private static final long serialVersionUID = -6623406708050387675L;
	private ArrayList<String> imagePath;
	private ArrayList<String> ListImagePath;
	private ArrayList<String> titulos;
	private ArrayList<String> descripcion;
	
	public ArrayList<String> getListImagePath() {
		return ListImagePath;
	}

	public void setListImagePath(ArrayList<String> listImagePath) {
		ListImagePath = listImagePath;
	}

	public ArrayList<String> getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(ArrayList<String> imagePath) {
		this.imagePath = imagePath;
	}
	
	public ArrayList<String> getTitulos() {
		return titulos;
	}
	
	public void setTitulos(ArrayList<String> titulos) {
		this.titulos = titulos;
	}
	
	public ArrayList<String> getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(ArrayList<String> descripcion) {
		this.descripcion = descripcion;
	}

}
