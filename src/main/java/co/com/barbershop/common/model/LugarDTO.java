package co.com.barbershop.common.model;

public class LugarDTO {
	
	private int id;
	private String nombre;
	private String direccion;
	private Long alt;
	private Long lon;
	private String telefono;
	private String descripcion;
	private String horario;
	private String correo;
	private String imagenLugar;
	
	public LugarDTO(String nombre, String direccion, Long alt, Long lon, String telefono, String descripcion,
			String horario, String correo, String imagenLugar) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.alt = alt;
		this.lon = lon;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.horario = horario;
		this.correo = correo;
		this.imagenLugar = imagenLugar;
	}
	
	
	public String getImagenLugar() {
		return imagenLugar;
	}
	public void setImagenLugar(String imagenLugar) {
		this.imagenLugar = imagenLugar;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getAlt() {
		return alt;
	}
	public void setAlt(Long alt) {
		this.alt = alt;
	}
	public Long getLon() {
		return lon;
	}
	public void setLon(Long lon) {
		this.lon = lon;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}

