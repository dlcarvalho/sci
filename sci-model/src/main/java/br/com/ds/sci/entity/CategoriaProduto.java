package br.com.ds.sci.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="categorias_produto")
public class CategoriaProduto implements Serializable{

	private static final long serialVersionUID = -7543849223690064658L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="categoria_produto_id", unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String descricao;

	@OneToMany(mappedBy="categoriaProduto")
	private List<Produto> produtos;

	public int getid() {
		return this.id;
	}

	public void setid(int categoriaProdutoId) {
		this.id = categoriaProdutoId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}