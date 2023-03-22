package com.curso.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.ProductoRepository;

/*hacemos q esta clase implemente de interfaz ProductoService clic en para agregar methods*/
/*Esta anotacion Nos permitira inyectar en controlador esta clase para llamar directamente a los methods CRUD*/
@Service
public class ProductoServiceImpl implements ProductoService {
	
	/*Aqui declaramos un objeto de tipo ProductoRepository*/
	/*@autowired nos sirve para decir q stamos inyectando a esta clase un objeto*/
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// findById nos devuelve un optional tipo producto
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// voy a invocar a producto repository save cuando al objeto enviamos id como null este lo va crear
		//si enviamos un objeto con id que ya existe en DB va actualizar
		productoRepository.save(producto);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
		
	}

}
