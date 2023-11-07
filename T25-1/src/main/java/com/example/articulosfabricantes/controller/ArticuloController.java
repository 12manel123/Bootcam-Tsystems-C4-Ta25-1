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

import com.example.articulosfabricantes.dto.Articulo;
import com.example.articulosfabricantes.services.ArticuloServiceImpl;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	@Autowired
	private ArticuloServiceImpl articuloServiceImpl;

    @GetMapping("/all")
    public List<Articulo> getArticulo() {
        return articuloServiceImpl.listarArticulos();
    }

    @GetMapping("/{id}")
	public Articulo articuloXID(@PathVariable(name="id") Integer id) {
    	Articulo articulo_xid= new Articulo();
    	articulo_xid=articuloServiceImpl.obtenerArticuloPorId(id);
		System.out.println("Articulo XID: "+articulo_xid);
		return articulo_xid;
	}
    @PostMapping("/add")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}

    @PutMapping("/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id")Integer id,@RequestBody Articulo articulo) {
    	Articulo articulo_seleccionado= new Articulo();
		
    	articulo_seleccionado= articuloServiceImpl.obtenerArticuloPorId(id);
		
    	articulo_seleccionado.setNombre(articulo.getNombre());
    	articulo_seleccionado.setPrecio(articulo.getPrecio());
    	articulo_seleccionado.setNombre(articulo.getNombre());
    	articulo_seleccionado.setFabricante(articulo.getFabricante());

    	articulo_seleccionado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_seleccionado);
		
		return articulo_seleccionado;
    }

    @DeleteMapping("/{id}")
    public void eliminarArticulo(@PathVariable int id) {
    	articuloServiceImpl.eliminarArticulo(id);
		System.out.println("Articulo eliminado");

    }
}
