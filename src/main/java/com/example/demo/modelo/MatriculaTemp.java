package com.example.demo.modelo;

public class MatriculaTemp {
	private String cedula;
	private String nombre;
	private String apellido;
	private String codigo;
	@Override
	public String toString() {
		return "MatriculaTemp [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", codigo="
				+ codigo + "]";
	}
	public MatriculaTemp(String cedula, String nombre, String apellido, String codigo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
