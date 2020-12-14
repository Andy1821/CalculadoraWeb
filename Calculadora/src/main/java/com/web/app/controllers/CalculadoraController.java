package com.web.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.app.models.Datos;
import com.web.app.services.CalculadoraService;
import com.web.app.services.ICalculadoraService;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraController {
	@Qualifier
	private ICalculadoraService service = new CalculadoraService();
	
	@GetMapping(path={"", "/"})
	public String datos(Model model) {
		model.addAttribute("titulo", "Datos de la operación");
		model.addAttribute("error", null);
		model.addAttribute("datos", new Datos());
		return "datos";
	}
	
	@PostMapping(path={"", "/"})
	public String operacion(@Valid Datos datos, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Datos de la operación");
			model.addAttribute("error", "Ingrese los datos correctos.");
			return "datos";
		}
		float nResultado = service.operacion(datos);
		String resultado = 
				String.valueOf(datos.getA())
				.concat(" ")
				.concat(datos.getOperacion())
				.concat(" ")
				.concat(String.valueOf(datos.getB()))
				.concat(" = ")
				.concat(String.valueOf(nResultado));
		model.addAttribute("titulo", "Resultado");
		model.addAttribute("resultado", resultado);
		return "resultado";
	}
}
