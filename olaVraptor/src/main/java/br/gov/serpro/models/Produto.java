package br.gov.serpro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO", schema = "EXEMPLO")
public class Produto {
	@Id
	@SequenceGenerator(name = "PRODUTO_SEQUENCE", sequenceName = "EXEMPLO.PRODUTO_SEQUENCE")
	@GeneratedValue(generator = "PRODUTO_SEQUENCE")
	@Column(name = "ID", unique = true, nullable = false)
    private Long id;

	@Column(name = "NOME")
	private String nome;
	@Column(name = "DESCRICAO")	
    private String descricao;
	@Column(name = "PRECO")		
    private Double preco;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

    //getter e setters e métodos de negócio que julgar necessário
}
