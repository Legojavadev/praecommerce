package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Producto;



/*tenemos q hacer extends de JpaRepository decimos a q tabla va heredarse va para clase producto*/
/*aque tabla va usarse ee Repository los metodos crud que vamos ausar tipo dato por ID de cada clase*/
/*para q esta interfaz podemos inyectar en service el framework va entender q s 1 artefact*/
/*inyectaremos donde queremos usar*/
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
