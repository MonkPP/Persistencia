package edu.ifmt.cobrancaifmt.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.cobrancaifmt.model.StatusTitulo;
import edu.ifmt.cobrancaifmt.model.Titulo;
import edu.ifmt.cobrancaifmt.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@RequestMapping("/novo")
	public ModelAndView novo() {//metodo que reorna uma string com o nome da view
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		return mv;
		
	}
	
	@Autowired //anotação que irá injetar dependencia
	private Titulos titulos;
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		titulos.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Foi salvo com sucesso!");
		return mv;
	}
	
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo(){
		return Arrays.asList(StatusTitulo.values());
	}
	
	@RequestMapping
	public String pesquisar() {
		return "PesquisaTitulos";
	}
	

}
