package com.web.app.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Datos {
	@NotNull
	private float a;
	@NotNull
	private float b;
	@NotEmpty
	private String operacion;
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
}
