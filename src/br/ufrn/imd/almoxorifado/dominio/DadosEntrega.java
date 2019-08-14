package br.ufrn.imd.almoxorifado.dominio;

import br.ufrn.imd.almoxorifado.rh.Contato;
import br.ufrn.imd.almoxorifado.rh.Endereco;

/**
 * Classe que reperesenta os dados de entrega
 * @author joicy
 *
 */
public class DadosEntrega {
	
	private Endereco endereco;
	private String local;
	private Contato contato;
	
	public DadosEntrega() {}
	
	public DadosEntrega(Endereco endereco, String local, Contato contato) {
		this.endereco = endereco;
		this.local = local;
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "DadosEntrega [endereco=" + endereco + ", local=" + local + ", contato=" + contato + "]";
	}
	
	
	
	
	

}
