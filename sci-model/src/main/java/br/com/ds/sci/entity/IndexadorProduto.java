package br.com.ds.sci.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="indices_x_produto")
public class IndexadorProduto implements Serializable {

	private static final long serialVersionUID = -1275850779024445023L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="indice_x_produto_id", unique=true, nullable=false)
	private int id;

	@Column(name="prc_aplicacao")
	private int prcAplicacao;

    @ManyToOne
	@JoinColumn(name="indice_id", nullable=false)
	private Indice indice;

    @ManyToOne
	@JoinColumn(name="produto_id", nullable=false)
	private Produto produto;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrcAplicacao() {
		return this.prcAplicacao;
	}

	public void setPrcAplicacao(int prcAplicacao) {
		this.prcAplicacao = prcAplicacao;
	}

	public Indice getIndice() {
		return this.indice;
	}

	public void setIndice(Indice indice) {
		this.indice = indice;
	}
	
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}