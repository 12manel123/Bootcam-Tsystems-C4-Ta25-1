package com.example.articulosfabricantes.services;

import java.util.List;

import com.example.articulosfabricantes.dto.Fabricante;

public interface IFabricanteService {
	//Listar todos
		public List<Fabricante> listarFabricantes();
		
		//Listar por id
		public Fabricante obtenerFabricantePorId(Integer id);

	    // Guardar
	    public Fabricante guardarFabricante(Fabricante fabricante);

	    // Actualizar
	    public Fabricante actualizarFabricante(Fabricante fabricante);

	    // Eliminar
	    public void eliminarFabricante(Integer id);
}
