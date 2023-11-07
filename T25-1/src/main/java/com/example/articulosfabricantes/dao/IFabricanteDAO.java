package com.example.articulosfabricantes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.articulosfabricantes.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante,Integer>{

}
