package br.com.techgold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContaController {
	
	@GetMapping("/listar")
	public String buscaConta() {
		return "templates/conta.html";
	}

}
