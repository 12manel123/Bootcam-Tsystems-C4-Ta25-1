package com.example.articulosfabricantes.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fabricantes")
public class Fabricante {
	@Id
	@Column(name = "codigo")
	private int id;
	private String nombre;
	
	public Fabricante() {
	}
	
	public Fabricante(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	@OneToMany(mappedBy = "fabricante")
	private List<Articulo> articulo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy="Articulo")
	public List<Articulo> getArticulo(){
		return articulo;
	}
	
	
	
}
