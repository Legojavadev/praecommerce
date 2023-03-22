/*Duiagrama conceptual integran Usuario, Productos, DetalleOrden, Orden*/
package com.curso.ecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity /*Aqui iniciamos dicinedo q sta es una ENTIDAD la tabla usuario*/
@Table(name = "usuarios") /*Es recomendable que las tablas vayan en plural*/
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Esta notacion permite q Id sea autoincrement*/
	private Integer id;
	private String nombre;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	/*Aqui vamos anotar con JPA  a este atributo vamos a decir que esta relacion es de uno a muchos
	 * y que va estar mapeada por el campo usuario*/
	@OneToMany(mappedBy = "usuario")	
	/*creamos un atributo de esta clase y le decimos q nos devuelva una lista de productos*/
	private List<Producto> productos;
	
	@OneToMany(mappedBy = "usuario")
	private List<Orden> ordenes;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(Integer id, String nombre, String username, String email, String direccion, String telefono,
			String tipo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public List<Orden> getOrdenes() {
		return ordenes;
	}


	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}


	//to string lo que hace es retornarme todos los campos de la clase como un solo string
	//por que es importante imprimir por consola ya que tiene todo ese objeto actualmente
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password
				+ "]";
	}
	
	
	
}
