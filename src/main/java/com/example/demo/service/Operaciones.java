package com.example.demo.service;

import java.util.List;

public interface Operaciones<T> {
	T create(T t);
	T update(T t);
	void delete(int id);
	T read(int id);
	List<T> readAll();

}
