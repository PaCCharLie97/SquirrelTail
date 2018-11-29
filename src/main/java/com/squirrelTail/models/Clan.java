package com.squirrelTail.models;

public class Clan {
	
	private int cid;
	private String nombre;
	private String usuarios;
	
	public Clan() {
		
	}

	public Clan(int cid, String nombre, String usuarios) {
		super();
		this.cid = cid;
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}
	
}
