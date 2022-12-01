package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;
@Service
public class ProductoService implements Operaciones<Producto>{

	@Autowired
	private ProductoRepository repository;
	@Override
	public Producto create(Producto t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public Producto update(Producto t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
