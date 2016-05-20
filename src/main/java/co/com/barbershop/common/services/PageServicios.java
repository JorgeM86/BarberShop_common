package co.com.barbershop.common.services;

import java.util.List;

import co.com.barbershop.common.model.*;
import co.com.barbershop.common.model.ServiciosPageDTO;

public interface PageServicios {
	
	public ServiciosPageDTO getServiciosPageDTO();
	public List<ServiciosDTO> listServicios();

}
