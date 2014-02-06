package br.com.ds.sci.managedbean;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import br.com.ds.sci.entity.TributacaoProduto;
import br.com.ds.sci.entity.Tributo;

@Named
@ViewScoped
public class TributacaoProdutoBean {

	private TributacaoProduto TributacaoProduto = new TributacaoProduto();
	private List<TributacaoProduto> TributacoesProduto;

	public TributacaoProduto getTributacaoProduto() {
		return TributacaoProduto;
	}

	public void setTributacaoProduto(TributacaoProduto TributacaoProduto) {
		this.TributacaoProduto = TributacaoProduto;
	}

	public List<TributacaoProduto> getProdutosTributaveis() {

		TributacaoProduto p = new TributacaoProduto();
		p.setTributo(new Tributo());
		TributacoesProduto.add(p);

		return TributacoesProduto;
	}

	public void onEdit(RowEditEvent event) {

		TributacaoProduto TributacaoProduto = (TributacaoProduto) event
				.getObject();
		System.out.println("blé" + TributacaoProduto.getValor());

	}

	public void onCancel(RowEditEvent event) {

		TributacaoProduto TributacaoProduto = (TributacaoProduto) event
				.getObject();
		System.out.println("blé" + TributacaoProduto.getValor());

	}

	public void atualizaListaTributacaoProduto(TributacaoProduto pt) {
		TributacoesProduto.add(pt);

		TributacaoProduto p = new TributacaoProduto();
		p.setValor(55555);
		TributacoesProduto.add(p);

	}
}
