package br.gov.serpro.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class OlaController {

	@Inject
	Result result;

	public void digaOla() {
		System.out.println("# Olá Pessoal do Serpro. Esse é um controller do Vraptor !");
		result.include("outraSaudacao", "Bom dia !");
	}

}
