package br.gov.serpro.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.gov.serpro.daos.ProdutoDao;
import br.gov.serpro.models.Produto;

@Controller
public class ProdutosController {
    @Inject
    private ProdutoDao dao;
    
    @Inject
    private Result result;

    public List<Produto> lista() {
    	return dao.listaTodos();
    }	
    
    public void novo() {
    	
    }
    
    public void adiciona(Produto produto) 
    {
    	dao.adiciona(produto);
    	result.redirectTo(ProdutosController.class).lista();
    }
}
