package com.example.articulosfabricantes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.articulosfabricantes.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo,Integer>{

}
