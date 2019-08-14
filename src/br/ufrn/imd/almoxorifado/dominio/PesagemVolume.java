package br.ufrn.imd.almoxorifado.dominio;

/**
 * Classe que representa a pesagem de volume
 * @author joicy
 *
 */
public class PesagemVolume {
	
	private double peso;
	
	public PesagemVolume() {}

	public PesagemVolume(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "PesagemVolume [peso=" + peso + "]";
	}
	
	
	
}
