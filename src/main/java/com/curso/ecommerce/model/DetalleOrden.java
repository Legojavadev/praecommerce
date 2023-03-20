package com.curso.ecommerce.model;

public class DetalleOrden {
	//atributos
	private Integer id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
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
	
	////to string lo que hace es retornarme todos los campos de la clase como un solo string
	//por que es importante imprimir por consola ya que tiene todo ese objeto actualmente
	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	

}
