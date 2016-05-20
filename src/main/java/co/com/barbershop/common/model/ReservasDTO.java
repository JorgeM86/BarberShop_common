package co.com.barbershop.common.model;
import java.sql.Date;
public class ReservasDTO {
	
	private int id;
	private int idLugar;
	private int idCliente;
	private Date fecha_inicial;
	private Date fecha_final;
	
	public ReservasDTO(int idLugar, int idCliente, Date fecha_inicial, Date fecha_final) {
		this.idLugar = idLugar;
		this.idCliente = idCliente;
		this.fecha_inicial = fecha_inicial;
		this.fecha_final = fecha_final;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdLugar() {
		return idLugar;
	}
	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha_inicial() {
		return fecha_inicial;
	}
	public void setFecha_inicial(Date fecha_inicial) {
		this.fecha_inicial = fecha_inicial;
	}
	public Date getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}
	
	

}
