package co.com.barbershop.common.services;

import java.util.List;

import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;
import co.com.barbershop.common.model.ReservasPageDTO;

public interface PageReservas {
	
	public ReservasPageDTO getReservasPageDTO();
	public List<ReservasDTO> listReservas();
	public List<Reservas2DTO> listReservas2();

}
