package com.tesji.estoico;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno {

	private int numeroCuenta;
	private String nombre;
	private String apellidos;
	private String carrera;

	public Alumno() {
		
	}
	
	public Alumno(int numeroCuenta, String nombre, String apellidos, String carrera) {
		this.numeroCuenta = numeroCuenta;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carrera = carrera;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
