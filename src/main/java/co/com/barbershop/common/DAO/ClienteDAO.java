package co.com.barbershop.common.DAO;

import java.util.List;

import co.com.barbershop.common.model.ClienteDTO;

public interface ClienteDAO {
	
	public ClienteDTO findClienteById(int id);
	public ClienteDTO findClienteByCedula(String cedula);
	public List<ClienteDTO> Lista_Clientes();

}
