package com.example.demo.controller;

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

import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	public List<Producto> listar(){
		return productoService.readAll();
	}
	
	@PostMapping("/add")
	public Producto add(@RequestBody Producto prod){
		return productoService.create(prod);
	}
	@GetMapping("/{id}")
	public Producto read(@PathVariable int id){
		return productoService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public void del(@PathVariable int id){
		productoService.delete(id);
	}
	@PutMapping("/update/{id}")
	public Producto del(@RequestBody Producto prod, @PathVariable int id){
		Producto p = productoService.read(id);
		p.setNombre(prod.getNombre());
		p.setPrecio(prod.getPrecio());
		p.setCantidad(prod.getCantidad());
		
		return productoService.update(p);
	}

}
