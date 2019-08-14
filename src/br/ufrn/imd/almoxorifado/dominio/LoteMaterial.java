package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.almoxorifado.producao.OrdemProducao;
import br.ufrn.imd.almoxorifado.rh.PessoaJuridica;

/**
 * Classe que representa um lote de material
 * @author joicy
 *
 */
public class LoteMaterial {
	
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private int volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;
	
	public LoteMaterial() {}
	
	public LoteMaterial(Material material, Date dataValidade, Date dataFabricacao, EstadoLote estado,
			String numeroLoteFabricante, String numeroLoteInterno, int volumes, OrdemProducao ordemProducao,
			PessoaJuridica fabricante, PessoaJuridica fornecedor, int qtdCaixaEmbarque, BigDecimal pesoBrutoTotal,
			BigDecimal pesoLiquidoTotal, BigDecimal tara, double valorUnitario) {
		
		this.material = material;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.estado = estado;
		this.numeroLoteFabricante = numeroLoteFabricante;
		this.numeroLoteInterno = numeroLoteInterno;
		this.volumes = volumes;
		this.ordemProducao = ordemProducao;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
		this.pesoBrutoTotal = pesoBrutoTotal;
		this.pesoLiquidoTotal = pesoLiquidoTotal;
		this.tara = tara;
		this.valorUnitario = valorUnitario;
	}



	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public EstadoLote getEstado() {
		return estado;
	}

	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}

	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}

	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}

	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}

	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}

	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}

	public PessoaJuridica getFabricante() {
		return fabricante;
	}

	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}

	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}

	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}

	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}

	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}

	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}

	public BigDecimal getTara() {
		return tara;
	}

	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		return "LoteMaterial [material=" + material + ", dataValidade=" + dataValidade + ", dataFabricacao="
				+ dataFabricacao + ", estado=" + estado + ", numeroLoteFabricante=" + numeroLoteFabricante
				+ ", numeroLoteInterno=" + numeroLoteInterno + ", volumes=" + volumes + ", ordemProducao="
				+ ordemProducao + ", fabricante=" + fabricante + ", fornecedor=" + fornecedor + ", qtdCaixaEmbarque="
				+ qtdCaixaEmbarque + ", pesoBrutoTotal=" + pesoBrutoTotal + ", pesoLiquidoTotal=" + pesoLiquidoTotal
				+ ", tara=" + tara + ", valorUnitario=" + valorUnitario + "]";
	}
	
	
	


}
