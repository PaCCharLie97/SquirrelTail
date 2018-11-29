package com.squirrelTail.models;

public class Bar {
	
	private int bid;
	private String nombre;
	private String direccion;
	private int telefono;
	private double latitud;
	private double longitud;
	private String descripcion;
	private String cerveza;
	
	public Bar() {
		
	}

	public Bar(int bid, String nombre, String direccion, int telefono, double latitud, double longitud, String descripcion, String cerveza) {
		super();
		this.bid = bid;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.latitud = latitud;
		this.longitud = longitud;
		this.descripcion = descripcion;
		this.cerveza = cerveza;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCerveza() {
		return cerveza;
	}

	public void setCerveza(String cerveza) {
		this.cerveza = cerveza;
	}
	
}
