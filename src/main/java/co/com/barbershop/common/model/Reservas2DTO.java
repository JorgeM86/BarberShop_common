package co.com.barbershop.common.model;

public class Reservas2DTO {
	
	private int id;
	private String titulo;
	private String descripcion;
	private String imagen;
	
	public Reservas2DTO(String titulo, String descripcion, String imagen) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}
	
	public Reservas2DTO(){
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulos() {
		return titulo;
	}
	public void setTitulos(String titulos) {
		this.titulo = titulos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
	
	
	
	
	

}
