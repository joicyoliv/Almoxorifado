package br.ufrn.imd.almoxorifado.dominio;

/**
 * Classe que representa uma unidade de medida
 * @author joicy
 *
 */
public class UnidadeMedida {
	
	private String nome;
	private String abreviacao;
	
	public UnidadeMedida() {}

	public UnidadeMedida(String nome, String abreviacao) {
		this.nome = nome;
		this.abreviacao = abreviacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	@Override
	public String toString() {
		return "UnidadeMedida [nome=" + nome + ", abreviacao=" + abreviacao + "]";
	}
	
	

}
