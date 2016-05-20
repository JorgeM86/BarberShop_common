package co.com.barbershop.common.DAO;

import java.util.List;

import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;

public interface ReservasDAO {
	
	public ReservasDTO findReservaById(int id_reserva);
	public List<ReservasDTO> Lista_Reservas();
	public List<Reservas2DTO> Lista_Reservas2();
	
	//CRUD
	public void insert_Reserva();
	public void delete_Reserva();
	public void update_Reserva();
	

}
