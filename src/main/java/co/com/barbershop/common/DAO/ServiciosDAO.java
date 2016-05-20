package co.com.barbershop.common.DAO;

import java.util.List;

import co.com.barbershop.common.model.ServiciosDTO;

public interface ServiciosDAO {
	
	public ServiciosDTO findServiciosById(int id);
	public List<ServiciosDTO> Lista_Servicios();

}
