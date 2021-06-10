package com.aorc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/regEntrada")
	public String regEntrada() {
		return "index";
	}
	
	@GetMapping("/regSalida")
	public String regSalida() {
		return "index";
	}
	
	@GetMapping("/altaAuto")
	public String altaAuto() {
		return "index";
	}
	
	@GetMapping("/pagoResidentes")
	public String pagoResidentes() {
		return "index";
	}
	
	@GetMapping("/comienzaMes")
	public String comienzaMes() {
		return "index";
	}
}
