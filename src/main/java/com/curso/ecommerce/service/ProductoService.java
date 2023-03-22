package com.curso.ecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.model.Producto;

public interface ProductoService {
	/*creamos los servicios para llamar a ProductoRepository*/
	/*En esta interfaz definimos todos los metodos CRUD para tabla producto*/
	/*este metodo va recibir un objeto de tipo producto*/
	
	public Producto save(Producto producto);
	/*Optionsl nos va permitir validar si el objeto existe en db o no*/
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);/*metodo q nos va permitir actualizar*/
	public void delete(Integer id);/*Metodo q nos permite eliminar*/
}
