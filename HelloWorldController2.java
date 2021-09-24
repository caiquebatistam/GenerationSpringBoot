package br.org.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/objetivos")
public class HelloWorldController2 {

	
	

	@GetMapping
	public String mostrarHello() 
	{
		return "Meus objetivos de aprendizagem para essa semana: Aprender Spring, banco de dados, fortalecer habilidade"
				+ "de atenção aos detalhes. ";
	}
	
	
}
