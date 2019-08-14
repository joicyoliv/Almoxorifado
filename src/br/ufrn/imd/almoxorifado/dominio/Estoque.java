package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;
import java.util.List;

/**
 * Classe que representa o estoque
 * @author joicy
 *
 */
public class Estoque {

	private BigDecimal qtdAtual;
	private Almoxorifado almoxorifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private List<MovimentacaoEstoque> historicoMovimentacoes;
	
	public Estoque() {}

	public Estoque(BigDecimal qtdAtual, Almoxorifado almoxorifado, LoteMaterial lote, Material material,
			BigDecimal qtdMaxima, List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.qtdAtual = qtdAtual;
		this.almoxorifado = almoxorifado;
		this.lote = lote;
		this.material = material;
		this.qtdMaxima = qtdMaxima;
		this.historicoMovimentacoes = historicoMovimentacoes;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public Almoxorifado getAlmoxorifado() {
		return almoxorifado;
	}

	public void setAlmoxorifado(Almoxorifado almoxorifado) {
		this.almoxorifado = almoxorifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public List<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}

	public void setHistoricoMovimentacoes(List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}

	@Override
	public String toString() {
		return "Estoque [qtdAtual=" + qtdAtual + ", almoxorifado=" + almoxorifado + ", lote=" + lote + ", material="
				+ material + ", qtdMaxima=" + qtdMaxima + ", historicoMovimentacoes=" + historicoMovimentacoes + "]";
	}
	
	
	
}
