package br.gov.serpro.daos;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.gov.serpro.models.Produto;

@RequestScoped
public class ProdutoDao {


    @Inject
    private EntityManager manager;

    public void adiciona(Produto produto) {
        manager.persist(produto);
    }

	
    @SuppressWarnings("unchecked")
	public List<Produto> listaTodos() {
    	List<Produto> produtos = manager.createQuery("select e from Produto e").getResultList();
    	return produtos;
    }
    
}
