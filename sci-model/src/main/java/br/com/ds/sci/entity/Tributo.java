package br.com.ds.sci.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tributos")
public class Tributo implements Serializable{

	private static final long serialVersionUID = 231941350591177619L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tributo_id", unique = true, nullable = false)
	private int id;

	@Column(length = 255)
	private String descricao;

	@OneToMany(mappedBy = "tributo")
	private List<TributacaoProduto> produtoTributavel;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<TributacaoProduto> getTributosXProdutos() {
		return this.produtoTributavel;
	}

	public void setTributosXProdutos(List<TributacaoProduto> tributosXProdutos) {
		this.produtoTributavel = tributosXProdutos;
	}

}
