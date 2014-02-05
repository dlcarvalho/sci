package br.com.ds.sci.managedbean;

import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import br.com.ds.sci.entity.TributacaoProduto;
import br.com.ds.sci.entity.Tributo;

@Named
@ViewScoped
public class TributacaoProdutoBean {

	private TributacaoProduto tributacaoProduto = new TributacaoProduto();
	private List<TributacaoProduto> trinbutacoesProduto;

	public TributacaoProduto getTributacaoProduto() {
		return tributacaoProduto;
	}

	public void setTributacaoProduto(TributacaoProduto TributacaoProduto) {
		this.tributacaoProduto = TributacaoProduto;
	}

	public List<TributacaoProduto> getProdutosTributaveis(){

		
		TributacaoProduto p = new TributacaoProduto();
		p.setTributo(new Tributo());
		trinbutacoesProduto.add(p);
		
		return trinbutacoesProduto;
	}
	
	public void onEdit(RowEditEvent event) {
		
		TributacaoProduto TributacaoProduto = (TributacaoProduto) event.getObject();
        System.out.println("blé"+TributacaoProduto.getValor()); 
        
    } 
	
	public void onCancel(RowEditEvent event) {
		
		TributacaoProduto TributacaoProduto = (TributacaoProduto) event.getObject();
        System.out.println("blé"+TributacaoProduto.getValor()); 
        
    }
	
	public void atualizaListaTributacaoProduto(TributacaoProduto pt){
		trinbutacoesProduto.add(pt);
		
		TributacaoProduto p = new TributacaoProduto();
		p.setValor(55555);
		trinbutacoesProduto.add(p);
		
	}
}
