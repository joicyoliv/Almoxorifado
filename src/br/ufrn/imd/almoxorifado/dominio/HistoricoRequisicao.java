package br.ufrn.imd.almoxorifado.dominio;

import java.util.Date;

/**
 * Classe que representa um historico de requisicao
 * @author joicy
 *
 */
public class HistoricoRequisicao {

	private Date dataRegistro;
	private StatusRequisicao status;
	private Usuario usuario;
	private String observacoes;
	
	public HistoricoRequisicao() {}

	public HistoricoRequisicao(Date dataRegistro, StatusRequisicao status, Usuario usuario, String observacoes) {
		
		this.dataRegistro = dataRegistro;
		this.status = status;
		this.usuario = usuario;
		this.observacoes = observacoes;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public StatusRequisicao getStatus() {
		return status;
	}

	public void setStatus(StatusRequisicao status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "HistoricoRequisicao [dataRegistro=" + dataRegistro + ", status=" + status + ", usuario=" + usuario
				+ ", observacoes=" + observacoes + "]";
	}
	
	
}
