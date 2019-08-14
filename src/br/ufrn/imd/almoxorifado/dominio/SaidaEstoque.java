package br.ufrn.imd.almoxorifado.dominio;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.almoxorifado.rh.PessoaJuridica;

/**
 * Classe que representa a saida do estoque
 * @author joicy
 *
 */
public class SaidaEstoque {
	
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoSaida> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa; 
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	
	
	public SaidaEstoque() {}


	public SaidaEstoque(Usuario responsavel, Date dataEnvio, Date dataCriacao, List<MovimentacaoSaida> itens,
			StatusMovimentacao status, String observacoes, PessoaJuridica transportadora, List<Documento> anexos,
			GuiaRemessa guiaRemessa, PessoaJuridica pjDestinatario, String justificativa) {
		
		this.responsavel = responsavel;
		this.dataEnvio = dataEnvio;
		this.dataCriacao = dataCriacao;
		this.itens = itens;
		this.status = status;
		this.observacoes = observacoes;
		this.transportadora = transportadora;
		this.anexos = anexos;
		this.guiaRemessa = guiaRemessa;
		this.pjDestinatario = pjDestinatario;
		this.justificativa = justificativa;
	}


	public Usuario getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}


	public Date getDataEnvio() {
		return dataEnvio;
	}


	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public List<MovimentacaoSaida> getItens() {
		return itens;
	}


	public void setItens(List<MovimentacaoSaida> itens) {
		this.itens = itens;
	}


	public StatusMovimentacao getStatus() {
		return status;
	}


	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}


	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public PessoaJuridica getTransportadora() {
		return transportadora;
	}


	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}


	public List<Documento> getAnexos() {
		return anexos;
	}


	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}


	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}


	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}


	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}


	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}


	public String getJustificativa() {
		return justificativa;
	}


	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}


	@Override
	public String toString() {
		return "SaidaEstoque [responsavel=" + responsavel + ", dataEnvio=" + dataEnvio + ", dataCriacao=" + dataCriacao
				+ ", itens=" + itens + ", status=" + status + ", observacoes=" + observacoes + ", transportadora="
				+ transportadora + ", anexos=" + anexos + ", guiaRemessa=" + guiaRemessa + ", pjDestinatario="
				+ pjDestinatario + ", justificativa=" + justificativa + "]";
	}
	
	
	
	

}
