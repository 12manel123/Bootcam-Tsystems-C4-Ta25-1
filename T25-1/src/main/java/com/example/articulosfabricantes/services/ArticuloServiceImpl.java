package com.example.articulosfabricantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.articulosfabricantes.dao.IArticuloDAO;
import com.example.articulosfabricantes.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{
	@Autowired
    private IArticuloDAO iArticuloDAO;

    @Override
    public List<Articulo> listarArticulos() {
        return iArticuloDAO.findAll();
    }

    @Override
    public Articulo obtenerArticuloPorId(Integer id) {
    	return iArticuloDAO.findById(id).get();
    }

    @Override
    public Articulo guardarArticulo(Articulo Articulo) {
        return iArticuloDAO.save(Articulo);
    };


    @Override
    public Articulo actualizarArticulo(Articulo Articulo) {
    	return iArticuloDAO.save(Articulo);
    }

    @Override
    public void eliminarArticulo(Integer id) {
    	iArticuloDAO.deleteById(id);
    }
}
