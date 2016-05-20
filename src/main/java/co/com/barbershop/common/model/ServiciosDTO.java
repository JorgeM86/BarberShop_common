package co.com.barbershop.common.model;

public class ServiciosDTO {
	
	private int id;
	private String nombre;
	private String descripcion;
	private String foto;
	private int precio;
	
	public ServiciosDTO(String nombre, String descripcion, String foto, int precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto = foto;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
