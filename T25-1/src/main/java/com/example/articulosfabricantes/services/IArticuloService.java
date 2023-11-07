package com.example.articulosfabricantes.services;

import java.util.List;

import com.example.articulosfabricantes.dto.Articulo;

public interface IArticuloService {
	public List<Articulo> listarArticulos();
	
	//Listar por id
	public Articulo obtenerArticuloPorId(Integer id);

    // Guardar
    public Articulo guardarArticulo(Articulo articulo);

    // Actualizar
    public Articulo actualizarArticulo(Articulo articulo);

    // Eliminar
    public void eliminarArticulo(Integer id);
}
