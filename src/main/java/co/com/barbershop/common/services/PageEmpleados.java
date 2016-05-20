package co.com.barbershop.common.services;

import java.util.List;

import co.com.barbershop.common.model.*;
import co.com.barbershop.common.model.EmpleadosPageDTO;

public interface PageEmpleados {
	
	public EmpleadosPageDTO getEmpleadosPageDTO();
	public List<EmpleadoDTO> listEmpleados();

}
