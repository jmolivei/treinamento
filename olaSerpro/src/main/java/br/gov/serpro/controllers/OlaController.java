package br.gov.serpro.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class OlaController {

	@Inject
	Result result;

	public void digaOla() {
		System.out.println("# Ol� Pessoal do Serpro. Esse � um controller do Vraptor !");
		result.include("outraSaudacao", "Bom dia !");
	}

}
