package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.ufrn.imd.almoxorifado.rh.Endereco;

/**
 * Classe que representa um  checklist de transferencia
 * @author joicy
 *
 */
public class ChecklistTransferencia {
	
	private Material material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String observacoes;
	private List<Documento> anexoFotos;
	private boolean aprovado; 
	
	public ChecklistTransferencia() {}

	public ChecklistTransferencia(Material material, BigDecimal qtd, Endereco local, Date dataConferencia,
			String observacoes, List<Documento> anexoFotos, boolean aprovado) {
		
		this.material = material;
		this.qtd = qtd;
		this.local = local;
		this.dataConferencia = dataConferencia;
		this.observacoes = observacoes;
		this.anexoFotos = anexoFotos;
		this.aprovado = aprovado;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public Endereco getLocal() {
		return local;
	}

	public void setLocal(Endereco local) {
		this.local = local;
	}

	public Date getDataConferencia() {
		return dataConferencia;
	}

	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
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
		return "ChecklistTransferencia [material=" + material + ", qtd=" + qtd + ", local=" + local
				+ ", dataConferencia=" + dataConferencia + ", observacoes=" + observacoes + ", anexoFotos=" + anexoFotos
				+ ", aprovado=" + aprovado + "]";
	}
	
	
	
	

}
