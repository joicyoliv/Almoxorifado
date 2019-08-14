package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.almoxorifado.rh.PessoaJuridica;

/**
 * Classe que representa a movimentacao no estoque
 * @author joicy
 *
 */
public class MovimentacaoEntrada {
	
	private Usuario responsavel;
	private PessoaJuridica pjOrigem;
	private Almoxorifado almoxorifadoOrigem;
	private PessoaJuridica pjDestino;
	private Almoxorifado almoxorifadoDestino;
	private BigDecimal qtdMovimentada;
	private LoteMaterial itemLote;
	private Material itemMaterial;
	private Date dataMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
	
	public MovimentacaoEntrada() {}

	public MovimentacaoEntrada(Usuario responsavel, PessoaJuridica pjOrigem, Almoxorifado almoxorifadoOrigem,
			PessoaJuridica pjDestino, Almoxorifado almoxorifadoDestino, BigDecimal qtdMovimentada,
			LoteMaterial itemLote, Material itemMaterial, Date dataMovimentacao, TipoMovimentacao tipoMovimentacao) {
	
		this.responsavel = responsavel;
		this.pjOrigem = pjOrigem;
		this.almoxorifadoOrigem = almoxorifadoOrigem;
		this.pjDestino = pjDestino;
		this.almoxorifadoDestino = almoxorifadoDestino;
		this.qtdMovimentada = qtdMovimentada;
		this.itemLote = itemLote;
		this.itemMaterial = itemMaterial;
		this.dataMovimentacao = dataMovimentacao;
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public PessoaJuridica getPjOrigem() {
		return pjOrigem;
	}

	public void setPjOrigem(PessoaJuridica pjOrigem) {
		this.pjOrigem = pjOrigem;
	}

	public Almoxorifado getAlmoxorifadoOrigem() {
		return almoxorifadoOrigem;
	}

	public void setAlmoxorifadoOrigem(Almoxorifado almoxorifadoOrigem) {
		this.almoxorifadoOrigem = almoxorifadoOrigem;
	}

	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}

	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}

	public Almoxorifado getAlmoxorifadoDestino() {
		return almoxorifadoDestino;
	}

	public void setAlmoxorifadoDestino(Almoxorifado almoxorifadoDestino) {
		this.almoxorifadoDestino = almoxorifadoDestino;
	}

	public BigDecimal getQtdMovimentada() {
		return qtdMovimentada;
	}

	public void setQtdMovimentada(BigDecimal qtdMovimentada) {
		this.qtdMovimentada = qtdMovimentada;
	}

	public LoteMaterial getItemLote() {
		return itemLote;
	}

	public void setItemLote(LoteMaterial itemLote) {
		this.itemLote = itemLote;
	}

	public Material getItemMaterial() {
		return itemMaterial;
	}

	public void setItemMaterial(Material itemMaterial) {
		this.itemMaterial = itemMaterial;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	@Override
	public String toString() {
		return "MovimentacaoEntrada [responsavel=" + responsavel + ", pjOrigem=" + pjOrigem + ", almoxorifadoOrigem="
				+ almoxorifadoOrigem + ", pjDestino=" + pjDestino + ", almoxorifadoDestino=" + almoxorifadoDestino
				+ ", qtdMovimentada=" + qtdMovimentada + ", itemLote=" + itemLote + ", itemMaterial=" + itemMaterial
				+ ", dataMovimentacao=" + dataMovimentacao + ", tipoMovimentacao=" + tipoMovimentacao + "]";
	}
	
	
	
	
}
