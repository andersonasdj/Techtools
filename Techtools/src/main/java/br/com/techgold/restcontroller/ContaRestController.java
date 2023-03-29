package br.com.techgold.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techgold.dto.ContaDto;
import br.com.techgold.model.Conta;
import br.com.techgold.repository.ContaRepository;

@RestController
@RequestMapping("contarest")
public class ContaRestController {
	
	@Autowired
	ContaRepository repository;

	@GetMapping
	public List<Conta> listaContas() {
		return repository.findAll();
	}
	
	@PostMapping("/add")
	public String adicionaConta(@RequestBody ContaDto dados) {
		
		Conta conta = new Conta(dados);
		repository.save(conta);
		System.out.println(dados.nome());
		System.out.println(dados.email());
		
		return "Conta adicionada com sucesso";
	}
}
