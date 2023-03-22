package com.curso.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	/*Vamos a Redireccionar hacia la vista q es show.html*/
	//comillas vacias para se mapea a productos
	//si todoe sta bien cuando accedemos a productos nos debe devolver archivo show.html
	@GetMapping("")
	public String show() {
		//que retorne a directorio productos y q tome el archivo show
		return "productos/show";
	}

}
