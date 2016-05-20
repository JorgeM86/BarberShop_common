package co.com.barbershop.common.model;

public class EmpleadoDTO {
	
	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String alias;
	private String descripcion;
	private int edad;
	private String telefono;	
	private String correo;	
	private String fotoEmpleado;
	private int lugar_id;
	
	public EmpleadoDTO(String cedula, String nombre, String apellido,String alias,
			String descripcion,int edad,String telefono, String correo, String fotoEmpleado) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.alias = alias;
		this.edad=edad;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.correo = correo;
		this.fotoEmpleado=fotoEmpleado;
	}
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFotoEmpleado() {
		return fotoEmpleado;
	}
	public void setFotoEmpleado(String fotoEmpleado) {
		this.fotoEmpleado = fotoEmpleado;
	}
	public int getLugar_id() {
		return lugar_id;
	}
	public void setLugar_id(int lugar_id) {
		this.lugar_id = lugar_id;
	}
	
	
	

	
	
	
	
}
