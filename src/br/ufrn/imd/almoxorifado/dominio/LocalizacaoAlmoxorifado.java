package br.ufrn.imd.almoxorifado.dominio;

/**
 * Classe que representa a localizacao do almoxorifado
 * @author joicy
 *
 */
public class LocalizacaoAlmoxorifado {
	
	private String localizacao;
	
	public LocalizacaoAlmoxorifado() {}

	public LocalizacaoAlmoxorifado(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	@Override
	public String toString() {
		return "LocalizacaoAlmoxorifado [localizacao=" + localizacao + "]";
	}
	
	

}
