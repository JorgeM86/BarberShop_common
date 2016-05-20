package co.com.barbershop.common.DAO;

import java.util.List;

import co.com.barbershop.common.model.EmpleadoDTO;

public interface EmpleadoDAO {
	
	public EmpleadoDTO findEmpleadoById(int id);
	public EmpleadoDTO findEmpleadoByCedula(String cedula);
	public List<EmpleadoDTO> Lista_Empleados();

}
