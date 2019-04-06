package com.vaibhav.sec.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {

	@GetMapping("/cuenta")
	@PreAuthorize("hasRole('USER')")
	public String forUser() {

		System.out.println("INGRESA A la Consulta.");

		return "{\"data\":\"Bienvenido a consultar cuentas...\"}";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String forAdmin() {

		return "welcome admin";
	}
	

	@GetMapping("/test")
	public String forIngreso() {

		return "{\"data\":\"listo\"}";
	}
	
	

}
