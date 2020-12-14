package com.web.app.services;

import com.web.app.models.Datos;

public class CalculadoraService implements ICalculadoraService {

	@Override
	public float operacion(float a, float b, String operacion) {
		switch(operacion) {
		case "+":
			return suma(a, b);
		case "-":
			return resta(a, b);
		case "/":
			return division(a, b);
		case "x":
			return producto(a, b);
		}
		return 0;
	}
	
	public float operacion(Datos datos) {
		switch(datos.getOperacion()) {
		case "+":
			return suma(datos.getA(), datos.getB());
		case "-":
			return resta(datos.getA(), datos.getB());
		case "/":
			return division(datos.getA(), datos.getB());
		case "x":
			return producto(datos.getA(), datos.getB());
		}
		return 0;
	}

	@Override
	public float suma(float a, float b) {
		return a+b;
	}

	@Override
	public float resta(float a, float b) {
		return a-b;
	}

	@Override
	public float producto(float a, float b) {
		return a*b;
	}

	@Override
	public float division(float a, float b) {
		return a/b;
	}

}
