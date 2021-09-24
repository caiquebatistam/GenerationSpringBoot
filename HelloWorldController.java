package br.org.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades") 
public class HelloWorldController {

	@GetMapping
	public String mostrarHello()
	{
		return "Mentalidades que usei para realizar essa atividade:"
				+ "Mentalidade de Crescimento e Persistência."
				+"Habilidades: Proatividade e atenção aos detalhes. ";
		// http://localhost:8080/mentalidades
		
		
	}

}
