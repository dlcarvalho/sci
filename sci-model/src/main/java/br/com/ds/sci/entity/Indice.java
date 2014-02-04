package br.com.ds.sci.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="indices")
public class Indice implements Serializable {

	private static final long serialVersionUID = -8117573080432197688L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="indice_id", unique=true, nullable=false)
	private int id;

	@Column(length=45)
	private String descricao;

	@OneToMany(mappedBy="indice")
	private List<IndexadorProduto> indexadorProduto;

	@OneToMany(mappedBy="indice")
	private List<ValorIndice> valorIndice;

	public int getid() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<IndexadorProduto> getIndicesXProdutos() {
		return this.indexadorProduto;
	}

	public void setIndicesXProdutos(List<IndexadorProduto> indicesXProdutos) {
		this.indexadorProduto = indicesXProdutos;
	}
	
	public List<ValorIndice> getValoresXIndices() {
		return this.valorIndice;
	}

	public void setValoresXIndices(List<ValorIndice> valorIndice) {
		this.valorIndice = valorIndice;
	}
	
}