package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
