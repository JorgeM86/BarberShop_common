package co.com.barbershop.common.model;
import java.io.Serializable;
import java.util.ArrayList;

public class ServiciosPageDTO implements Serializable {

	private static final long serialVersionUID = -1025727308907964948L;
	private ArrayList<String> imagePath;
	private ArrayList<String> titulos;
	private ArrayList<String> descripcion;
	
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
