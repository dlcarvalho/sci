package br.com.ds.sci.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="aplicacoes")
public class Aplicacao implements Serializable {

	private static final long serialVersionUID = -8587936504307898135L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="aplicacao_id", unique=true, nullable=false)
	private int id;

    @Temporal( TemporalType.DATE)
	@Column(name="data_aplicacao")
	private Date dataAplicacao;

	@Column(name="periodo_aplic")
	private int periodoAplic;

	@Column(name="valor_aplicacao")
	private double valorAplicacao;

    @ManyToOne
	@JoinColumn(name="carteira_id")
	private Carteira carteira;

    @ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;

	@OneToMany(mappedBy="aplicacoe")
	private List<Simulacao> simulacoes;

	public int getid() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public Date getDataAplicacao() {
		return this.dataAplicacao;
	}

	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public int getPeriodoAplic() {
		return this.periodoAplic;
	}

	public void setPeriodoAplic(int periodoAplic) {
		this.periodoAplic = periodoAplic;
	}

	public double getValorAplicacao() {
		return this.valorAplicacao;
	}

	public void setValorAplicacao(double valorAplicacao) {
		this.valorAplicacao = valorAplicacao;
	}

	public Carteira getCarteira() {
		return this.carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}
	
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public List<Simulacao> getSimulacoes() {
		return this.simulacoes;
	}

	public void setSimulacoes(List<Simulacao> simulacoes) {
		this.simulacoes = simulacoes;
	}
	
}