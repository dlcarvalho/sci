package br.com.ds.sci.managedbean;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ds.sci.entity.Produto;
import br.com.sb.sci.dao.DAO;

@Named
@RequestScoped
public class ProdutoBean {

	@Inject
	DAO<Produto> dao;

	private Produto produto = new Produto();
	private Long idProduto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

}
