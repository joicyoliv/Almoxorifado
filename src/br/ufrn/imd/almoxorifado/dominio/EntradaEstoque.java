package br.ufrn.imd.almoxorifado.dominio;

import java.util.Date;
import java.util.List;

/**
 * Classe que representa a entrada no estoque
 * @author joicy
 *
 */
public class EntradaEstoque {

	private String codigo;
	private List<MovimentacaoEntrada> itens;
	private StatusMovimentacao status;
	private String observacao;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private boolean precisaConferenciaEstado;
	private boolean precisaPesagem;
	private boolean precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	
	public EntradaEstoque() {}

	public EntradaEstoque(String codigo, List<MovimentacaoEntrada> itens, StatusMovimentacao status, String observacao,
			Usuario responsavel, Date dataCriacao, Date dataEntrada, List<Documento> anexos,
			boolean precisaConferenciaEstado, boolean precisaPesagem, boolean precisaAnalise, NotaFiscal notaFiscal,
			ChecklistRecebimentoComum checklistRecebimento, ConferenciaPesagem conferenciaPesagem,
			ChecklistTransferencia checklistTransferencia, String justificativa, TipoEntrada tipoEntrada) {
		
		this.codigo = codigo;
		this.itens = itens;
		this.status = status;
		this.observacao = observacao;
		this.responsavel = responsavel;
		this.dataCriacao = dataCriacao;
		this.dataEntrada = dataEntrada;
		this.anexos = anexos;
		this.precisaConferenciaEstado = precisaConferenciaEstado;
		this.precisaPesagem = precisaPesagem;
		this.precisaAnalise = precisaAnalise;
		this.notaFiscal = notaFiscal;
		this.checklistRecebimento = checklistRecebimento;
		this.conferenciaPesagem = conferenciaPesagem;
		this.checklistTransferencia = checklistTransferencia;
		this.justificativa = justificativa;
		this.tipoEntrada = tipoEntrada;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<MovimentacaoEntrada> getItens() {
		return itens;
	}

	public void setItens(List<MovimentacaoEntrada> itens) {
		this.itens = itens;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public boolean isPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}

	public void setPrecisaConferenciaEstado(boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}

	public boolean isPrecisaPesagem() {
		return precisaPesagem;
	}

	public void setPrecisaPesagem(boolean precisaPesagem) {
		this.precisaPesagem = precisaPesagem;
	}

	public boolean isPrecisaAnalise() {
		return precisaAnalise;
	}

	public void setPrecisaAnalise(boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public ChecklistRecebimentoComum getChecklistRecebimento() {
		return checklistRecebimento;
	}

	public void setChecklistRecebimento(ChecklistRecebimentoComum checklistRecebimento) {
		this.checklistRecebimento = checklistRecebimento;
	}

	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}

	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}

	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}

	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	@Override
	public String toString() {
		return "EntradaEstoque [codigo=" + codigo + ", itens=" + itens + ", status=" + status + ", observacao="
				+ observacao + ", responsavel=" + responsavel + ", dataCriacao=" + dataCriacao + ", dataEntrada="
				+ dataEntrada + ", anexos=" + anexos + ", precisaConferenciaEstado=" + precisaConferenciaEstado
				+ ", precisaPesagem=" + precisaPesagem + ", precisaAnalise=" + precisaAnalise + ", notaFiscal="
				+ notaFiscal + ", checklistRecebimento=" + checklistRecebimento + ", conferenciaPesagem="
				+ conferenciaPesagem + ", checklistTransferencia=" + checklistTransferencia + ", justificativa="
				+ justificativa + ", tipoEntrada=" + tipoEntrada + "]";
	}
	
	
	
	
}
