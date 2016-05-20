package co.com.barbershop.common.DAO;

import java.util.List;

import co.com.barbershop.common.model.LugarDTO;

public interface LugarDAO {
	
	public LugarDTO findLugarById(int lugarId);
	public LugarDTO findLugarByDireccion(String lugarDireccion);
	public List<LugarDTO> List_Lugar();
}
