package br.ufrn.imd.almoxorifado.dominio;

/**
 * Classe que representa os dados de pagamento
 * @author joicy
 *
 */
public class DadosPagamento {
	
	private String banco;
	private String agenda;
	private String conta;
	private String codigoIdentificacaoDV;
	
	public DadosPagamento() {}
	
	public DadosPagamento(String banco, String agenda, String conta, String codigoIdentificacaoDV) {
		this.banco = banco;
		this.agenda = agenda;
		this.conta = conta;
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCodigoIdentificacaoDV() {
		return codigoIdentificacaoDV;
	}

	public void setCodigoIdentificacaoDV(String codigoIdentificacaoDV) {
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}

	@Override
	public String toString() {
		return "DadosPagamento [banco=" + banco + ", agenda=" + agenda + ", conta=" + conta + ", codigoIdentificacaoDV="
				+ codigoIdentificacaoDV + "]";
	}
	
	
		
	
}
