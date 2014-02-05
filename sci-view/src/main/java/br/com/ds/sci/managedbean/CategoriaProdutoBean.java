package br.com.ds.sci.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ds.sci.entity.CategoriaProduto;
import br.com.sb.sci.dao.DAO;

@Named 
@RequestScoped
public class CategoriaProdutoBean implements Serializable{
	
	private static final long serialVersionUID = 6277254738582734337L;

	@Inject
	DAO<CategoriaProduto> dao;

	private CategoriaProduto catProduto = new CategoriaProduto();
	private List<CategoriaProduto> catProdutos;
	
	public CategoriaProduto getCatProduto() {
		return catProduto;
	}

	public void setCatProduto(CategoriaProduto catProduto) {
		this.catProduto = catProduto;
	}

	public void salvar() {
		dao.adiciona(this.catProduto);
		this.init();
	}
	
	public List<CategoriaProduto> getCatProdutos() {
		if (catProdutos == null) {
			catProdutos = new DAO<CategoriaProduto>(CategoriaProduto.class).listaTodos();
		}
		return catProdutos;
	}
	@PostConstruct
	public void init() {
		this.catProduto = new CategoriaProduto();
	}
}