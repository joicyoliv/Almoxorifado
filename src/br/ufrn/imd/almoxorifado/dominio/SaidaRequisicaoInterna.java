package br.ufrn.imd.almoxorifado.dominio;

import java.util.List;

import br.ufrn.imd.almoxorifado.rh.Setor;

/**
 * Classe que representa uma requisicao interna
 * @author joicy
 *
 */
public class SaidaRequisicaoInterna {

	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itensRequisicao;
	private List<HistoricoRequisicao> historicoRequisicao;
	private SaidaEstoque saidaEstoque;
	
	public SaidaRequisicaoInterna() {}

	public SaidaRequisicaoInterna(String codigo, Usuario requisitante, Setor setorRequisitante,
			Usuario responsavelSetor, StatusRequisicao statusRequisicao, List<ItemRequisicao> itensRequisicao,
			List<HistoricoRequisicao> historicoRequisicao, SaidaEstoque saidaEstoque) {
	
		this.codigo = codigo;
		this.requisitante = requisitante;
		this.setorRequisitante = setorRequisitante;
		this.responsavelSetor = responsavelSetor;
		this.statusRequisicao = statusRequisicao;
		this.itensRequisicao = itensRequisicao;
		this.historicoRequisicao = historicoRequisicao;
		this.saidaEstoque = saidaEstoque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}

	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}

	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}

	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}

	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}

	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}

	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}

	public List<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}

	public void setItensRequisicao(List<ItemRequisicao> itensRequisicao) {
		this.itensRequisicao = itensRequisicao;
	}

	public List<HistoricoRequisicao> getHistoricoRequisicao() {
		return historicoRequisicao;
	}

	public void setHistoricoRequisicao(List<HistoricoRequisicao> historicoRequisicao) {
		this.historicoRequisicao = historicoRequisicao;
	}

	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}

	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}

	@Override
	public String toString() {
		return "SaidaRequisicaoInterna [codigo=" + codigo + ", requisitante=" + requisitante + ", setorRequisitante="
				+ setorRequisitante + ", responsavelSetor=" + responsavelSetor + ", statusRequisicao="
				+ statusRequisicao + ", itensRequisicao=" + itensRequisicao + ", historicoRequisicao="
				+ historicoRequisicao + ", saidaEstoque=" + saidaEstoque + "]";
	}
	
	
			
	
	
}
