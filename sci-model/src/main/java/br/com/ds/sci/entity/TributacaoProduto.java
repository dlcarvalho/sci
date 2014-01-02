package br.com.ds.sci.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tributos_x_produto")
public class TributacaoProduto implements Serializable {

	private static final long serialVersionUID = -2931944541861737976L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tributo_x_produto_id", unique = true, nullable = false)
	private int id;

	@ManyToOne
	@JoinColumn(name = "produto_id", nullable = false)
	private Produto produto;

	@ManyToOne
	@JoinColumn(name = "tributo_id", nullable = false)
	private Tributo tributo;

	private double valor;
	
	@Column(name="tipo_valor")
	private String tipoValor;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_ini_vigencia")
	private Calendar dataIniVigencia;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_fim_vigencia")
	private Calendar datafimVigencia;
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoValor() {
		return tipoValor;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	public Calendar getDataIniVigencia() {
		return dataIniVigencia;
	}

	public void setDataIniVigencia(Calendar dataIniVigencia) {
		this.dataIniVigencia = dataIniVigencia;
	}

	public Calendar getDatafimVigencia() {
		return datafimVigencia;
	}

	public void setDatafimVigencia(Calendar datafimVigencia) {
		this.datafimVigencia = datafimVigencia;
	}

	
	public int getTributoXProdutoId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Tributo getTributo() {
		return this.tributo;
	}

	public void setTributo(Tributo tributo) {
		this.tributo = tributo;
	}

}