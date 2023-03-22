package com.curso.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/*le decimos controller para q spring boot le reconozca como tal*/
@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	/*vamos a mapear la home hacia esta url que es localhost y luego administrador y home */
	/*aqui ponemos metodo public String home*/
	/*hacemos una anotacion*/
	@GetMapping("")
	public String home() {
		/*redireccoonado o retorna por defecto el framework busca template en automatico el archivo y las vistas*/
		return "administrador/home";
	}

}
