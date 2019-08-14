package br.ufrn.imd.almoxorifado.dominio;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.almoxorifado.rh.Funcionario;

/**
 * Classe que representa uma checklist de recebimento comun
 * @author joicy
 *
 */
public class ChecklistRecebimentoComum {

	private Date dataChegada;
	private LoteMaterial lote;
	private boolean materialConfereNF;
	private boolean etiquetadoIdentificacao;
	private boolean embalagemIntegrada;
	private boolean embalagemSuja;
	private boolean embalagemUmida;
	private boolean embalagemDeformada;
	private boolean embalagemVazada;
	private boolean embalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observacao;
	private Funcionario conferente;
	private List<Documento> anexoFotos;
	private boolean aprovado;
	
	public ChecklistRecebimentoComum() {}

	public ChecklistRecebimentoComum(Date dataChegada, LoteMaterial lote, boolean materialConfereNF,
			boolean etiquetadoIdentificacao, boolean embalagemIntegrada, boolean embalagemSuja, boolean embalagemUmida,
			boolean embalagemDeformada, boolean embalagemVazada, boolean embalagemLacreViolado, String placa,
			float temperatura, int numeroConhecimento, String motorista, String observacao, Funcionario conferente,
			List<Documento> anexoFotos, boolean aprovado) {
		
		this.dataChegada = dataChegada;
		this.lote = lote;
		this.materialConfereNF = materialConfereNF;
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
		this.embalagemIntegrada = embalagemIntegrada;
		this.embalagemSuja = embalagemSuja;
		this.embalagemUmida = embalagemUmida;
		this.embalagemDeformada = embalagemDeformada;
		this.embalagemVazada = embalagemVazada;
		this.embalagemLacreViolado = embalagemLacreViolado;
		this.placa = placa;
		this.temperatura = temperatura;
		this.numeroConhecimento = numeroConhecimento;
		this.motorista = motorista;
		this.observacao = observacao;
		this.conferente = conferente;
		this.anexoFotos = anexoFotos;
		this.aprovado = aprovado;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public boolean isMaterialConfereNF() {
		return materialConfereNF;
	}

	public void setMaterialConfereNF(boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}

	public boolean isEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}

	public void setEtiquetadoIdentificacao(boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}

	public boolean isEmbalagemIntegrada() {
		return embalagemIntegrada;
	}

	public void setEmbalagemIntegrada(boolean embalagemIntegrada) {
		this.embalagemIntegrada = embalagemIntegrada;
	}

	public boolean isEmbalagemSuja() {
		return embalagemSuja;
	}

	public void setEmbalagemSuja(boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}

	public boolean isEmbalagemUmida() {
		return embalagemUmida;
	}

	public void setEmbalagemUmida(boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}

	public boolean isEmbalagemDeformada() {
		return embalagemDeformada;
	}

	public void setEmbalagemDeformada(boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}

	public boolean isEmbalagemVazada() {
		return embalagemVazada;
	}

	public void setEmbalagemVazada(boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}

	public boolean isEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}

	public void setEmbalagemLacreViolado(boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}

	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Funcionario getConferente() {
		return conferente;
	}

	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}

	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}

	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	@Override
	public String toString() {
		return "ChecklistRecebimentoComum [dataChegada=" + dataChegada + ", lote=" + lote + ", materialConfereNF="
				+ materialConfereNF + ", etiquetadoIdentificacao=" + etiquetadoIdentificacao + ", embalagemIntegrada="
				+ embalagemIntegrada + ", embalagemSuja=" + embalagemSuja + ", embalagemUmida=" + embalagemUmida
				+ ", embalagemDeformada=" + embalagemDeformada + ", embalagemVazada=" + embalagemVazada
				+ ", embalagemLacreViolado=" + embalagemLacreViolado + ", placa=" + placa + ", temperatura="
				+ temperatura + ", numeroConhecimento=" + numeroConhecimento + ", motorista=" + motorista
				+ ", observacao=" + observacao + ", conferente=" + conferente + ", anexoFotos=" + anexoFotos
				+ ", aprovado=" + aprovado + "]";
	}
	
	
	
	
}
