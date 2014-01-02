package br.com.ds.sci.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="produtos")
public class Produto implements Serializable{

	private static final long serialVersionUID = -3337180145094995696L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="produto_id", unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String descricao;

	@Column(name="remuneracao_basica")
	private double remuneracaoBasica;

	/*@OneToMany(mappedBy="produto")
	private List<Aplicacao> aplicacoes;

	@OneToMany(mappedBy="produto")
	private List<IndicesXProduto> indicesXProdutos;*/

    @ManyToOne
	@JoinColumn(name="categoria_produto_id", nullable=false)
	private CategoriaProduto categoriaProduto;

	@OneToMany(mappedBy="produto")
	private List<TributacaoProduto> produtoTributavel;

	public int getId() {
		return this.id;
	}

	public void setId(int produtoId) {
		this.id = produtoId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getRemuneracaoBasica() {
		return this.remuneracaoBasica;
	}

	public void setRemuneracaoBasica(double remuneracaoBasica) {
		this.remuneracaoBasica = remuneracaoBasica;
	}

	/*public List<Aplicacao> getAplicacoes() {
		return this.aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	
	public List<IndicesXProduto> getIndicesXProdutos() {
		return this.indicesXProdutos;
	}

	public void setIndicesXProdutos(List<IndicesXProduto> indicesXProdutos) {
		this.indicesXProdutos = indicesXProdutos;
	}
	*/
	public CategoriaProduto getCategoriasProduto() {
		return this.categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	
	public List<TributacaoProduto> getTributosXProdutos() {
		return this.produtoTributavel;
	}

	public void setTributosXProdutos(List<TributacaoProduto> tributosXProdutos) {
		this.produtoTributavel = tributosXProdutos;
	}
	
}