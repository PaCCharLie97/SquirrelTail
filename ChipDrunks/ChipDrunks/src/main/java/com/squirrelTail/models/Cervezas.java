package com.squirrelTail.models;

public class Cervezas {
	
	private int zid;
	private String nombre;
	private double alcohol;
	private String descripcion;
	
	public Cervezas() {
		
	}

	public Cervezas(int zid, String nombre, double alcohol, String descripcion) {
		super();
		this.zid = zid;
		this.nombre = nombre;
		this.alcohol = alcohol;
		this.descripcion = descripcion;
	}

	public int getZid() {
		return zid;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
