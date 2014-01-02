package br.com.ds.sci.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="carteiras")
public class Carteira implements Serializable {

	private static final long serialVersionUID = 4196263776121562948L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="carteira_id", unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String descricao;

	@Column(name="vlr_disponivel")
	private double vlrDisponivel;

	@OneToMany(mappedBy="carteira")
	private List<Aplicacao> aplicacoes;

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

	public double getVlrDisponivel() {
		return this.vlrDisponivel;
	}

	public void setVlrDisponivel(double vlrDisponivel) {
		this.vlrDisponivel = vlrDisponivel;
	}

	public List<Aplicacao> getAplicacoes() {
		return this.aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	
}