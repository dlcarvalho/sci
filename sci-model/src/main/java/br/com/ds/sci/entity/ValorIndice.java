package br.com.ds.sci.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="valores_x_indice")
public class ValorIndice implements Serializable {

	private static final long serialVersionUID = -3598984914245209172L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="valor_x_indice_id", unique=true, nullable=false)
	private int id;

	@Column(name="data_valor", length=45)
	private String dataValor;

	private double valor;

    @ManyToOne
	@JoinColumn(name="indice_id")
	private Indice indice;

	public int getid() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getDataValor() {
		return this.dataValor;
	}

	public void setDataValor(String dataValor) {
		this.dataValor = dataValor;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Indice getIndice() {
		return this.indice;
	}

	public void setIndice(Indice indice) {
		this.indice = indice;
	}
	
}