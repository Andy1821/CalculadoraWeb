package com.web.app.services;

import com.web.app.models.Datos;

public interface ICalculadoraService {
	float operacion(float a, float b, String operacion);
	float operacion(Datos datos);
	float suma(float a, float b);
	float resta(float a, float b);
	float producto(float a, float b);
	float division(float a, float b);
}
