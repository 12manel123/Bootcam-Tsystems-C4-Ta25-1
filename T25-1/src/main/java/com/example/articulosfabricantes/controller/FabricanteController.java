package com.example.articulosfabricantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.articulosfabricantes.dto.Fabricante;
import com.example.articulosfabricantes.services.FabricanteServiceImpl;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
	@Autowired
    private FabricanteServiceImpl FabricanteServiceImpl;

    @GetMapping("/all")
    public List<Fabricante> getFabricante() {
        return FabricanteServiceImpl.listarFabricantes();
    }

    @GetMapping("/{id}")
	public Fabricante FabricanteXID(@PathVariable(name="id") Integer id) {
    	Fabricante Fabricante_xid= new Fabricante();
		Fabricante_xid=FabricanteServiceImpl.obtenerFabricantePorId(id);
		System.out.println("Fabricante XID: "+Fabricante_xid);
		return Fabricante_xid;
	}
    @PostMapping("/add")
	public Fabricante salvarFabricante(@RequestBody Fabricante Fabricante) {
		return FabricanteServiceImpl.guardarFabricante(Fabricante);
	}

    @PutMapping("/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")Integer id,@RequestBody Fabricante Fabricante) {
    	Fabricante Fabricante_seleccionado= new Fabricante();
		Fabricante Fabricante_actualizado= new Fabricante();
		
		Fabricante_seleccionado= FabricanteServiceImpl.obtenerFabricantePorId(id);
		Fabricante_seleccionado.setNombre(Fabricante.getNombre());
		
		Fabricante_actualizado = FabricanteServiceImpl.actualizarFabricante(Fabricante_seleccionado);
		
		System.out.println("El Fabricante actualizado es: "+ Fabricante_actualizado);
		
		return Fabricante_actualizado;
    }

    @DeleteMapping("/{id}")
    public void eliminarFabricante(@PathVariable int id) {
    	FabricanteServiceImpl.eliminarFabricante(id);
		System.out.println("Fabricante eliminado");

    }
}
