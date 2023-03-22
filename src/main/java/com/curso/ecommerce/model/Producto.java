package com.curso.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Hacemos una anotacion para que el campo sea auto increment*/
	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Double precio;
	private int cantidad;
	
	/*anotamos a este campo con JPA que tiene relacion de muchos a uno*/
	
	/*creamos un nuevo campo o atributo de tipo Usuario y a este campo vamos a relacionarlo con la clase usuario*/
	@ManyToOne /*ya sabe q esta mapeado en Tabla usuario de OneToMany uno a muchos*/
	private Usuario usuario;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con todos los attributos
	
	public Producto(Integer id, String nombre, String descripcion, String imagen, Double precio, int cantidad,
			Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
		this.usuario = usuario;
	}
	
	
	//gether and setther
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	//to string lo que hace es retornarme todos los campos de la clase como un solo string
	//por que es importante imprimir por consola ya que tiene todo ese objeto actualmente

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
