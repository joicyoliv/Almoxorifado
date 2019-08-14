package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;

/**
 * Classe que representa o volume do material
 * @author joicy
 *
 */
public class VolumeMaterial {

	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	private LocalizacaoAlmoxorifado localizacao;
	private LoteMaterial lote;
	private VolumeMaterial volumeOrigem;
	
	public VolumeMaterial() {}

	public VolumeMaterial(String codigo, Material material, BigDecimal qtdInicial, BigDecimal qtdAtual,
			DimensaoUnidade dimensao, LocalizacaoAlmoxorifado localizacao, LoteMaterial lote,
			VolumeMaterial volumeOrigem) {
		
		this.codigo = codigo;
		this.material = material;
		this.qtdInicial = qtdInicial;
		this.qtdAtual = qtdAtual;
		this.dimensao = dimensao;
		this.localizacao = localizacao;
		this.lote = lote;
		this.volumeOrigem = volumeOrigem;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}

	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public DimensaoUnidade getDimensao() {
		return dimensao;
	}

	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}

	public LocalizacaoAlmoxorifado getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoAlmoxorifado localizacao) {
		this.localizacao = localizacao;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public VolumeMaterial getVolumeOrigem() {
		return volumeOrigem;
	}

	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		this.volumeOrigem = volumeOrigem;
	}

	@Override
	public String toString() {
		return "VolumeMaterial [codigo=" + codigo + ", material=" + material + ", qtdInicial=" + qtdInicial
				+ ", qtdAtual=" + qtdAtual + ", dimensao=" + dimensao + ", localizacao=" + localizacao + ", lote="
				+ lote + ", volumeOrigem=" + volumeOrigem + "]";
	}
	
	
}
