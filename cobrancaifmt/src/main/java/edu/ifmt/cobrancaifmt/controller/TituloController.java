package edu.ifmt.cobrancaifmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt.model.Titulo;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	
	@RequestMapping("/novo")
	public String novo() {//metodo que reorna uma string com o nome da view
		return "CadastroTitulo";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void salvar(Titulo titulo) {
		
	}
}
