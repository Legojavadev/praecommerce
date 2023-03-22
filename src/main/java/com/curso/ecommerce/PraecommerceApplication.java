package com.curso.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*(exclude = DataSourceAutoConfiguration.class) SE excluye de esta manera para ejecutar si base dato*/
@SpringBootApplication
public class PraecommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraecommerceApplication.class, args);
	}

}
