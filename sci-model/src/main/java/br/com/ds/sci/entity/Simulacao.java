package br.com.ds.sci.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Simulacoes")
public class Simulacao implements Serializable {

	private static final long serialVersionUID = -2032902240937679038L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="simulacao_id", unique=true, nullable=false)
	private int id;

	private int ano;

	private double capital;

	private int mes;

	@Column(name="rentab_mon")
	private double rentabMon;

	@Column(name="rentab_pct")
	private double rentabPct;

    @ManyToOne
	@JoinColumn(name="aplicacao_id")
	private Aplicacao aplicacoe;

	public int getSimulacaoId() {
		return this.id;
	}

	public void setSimulacaoId(int id) {
		this.id = id;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getCapital() {
		return this.capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getRentabMon() {
		return this.rentabMon;
	}

	public void setRentabMon(double rentabMon) {
		this.rentabMon = rentabMon;
	}

	public double getRentabPct() {
		return this.rentabPct;
	}

	public void setRentabPct(double rentabPct) {
		this.rentabPct = rentabPct;
	}

	public Aplicacao getAplicacoe() {
		return this.aplicacoe;
	}

	public void setAplicacoe(Aplicacao aplicacoe) {
		this.aplicacoe = aplicacoe;
	}
	
}