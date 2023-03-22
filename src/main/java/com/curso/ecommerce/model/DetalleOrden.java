package com.curso.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "detalles")
public class DetalleOrden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//atributos
	private Integer id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	/*creamos una notacion orden y mapeamos de uno a uno*/
	@OneToOne
	private Orden orden;
	
	/*creamos un atributo producto y mapeamos uno a uno no es necesario anotar en producto solo en esta clase*/
	/*por que ya hay una visibilidad en producto*/
	@ManyToOne
	private Producto producto;
	
	
	//co0nstructor vacio
	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con todos los atributos
	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		
	}
	
	//getter and setter

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

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	////to string lo que hace es retornarme todos los campos de la clase como un solo string
	//por que es importante imprimir por consola ya que tiene todo ese objeto actualmente
	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	

}
