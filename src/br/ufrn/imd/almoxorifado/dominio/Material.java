package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;

/**
 * Classe que representa um material
 * @author joicy
 *
 */
public class Material {
	
	private int codigo;
	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	
	public Material() {}

	public Material(int codigo, String nome, String especificacao, GrupoMaterial grupoMaterial, int estoqueMinimo,
			int pontoPedido, UnidadeMedida unidadeEstoque, UnidadeMedida unidadeEntrada,
			BigDecimal fatorConversaoEntrada, UnidadeMedida unidadeSaida, BigDecimal fatorConversaoSaida,
			String dadosAdicionais, ClassificacaoMaterial classificacao, int catmat, String condicaoArmazenagem,
			StatusMaterial status) {
		this.codigo = codigo;
		this.nome = nome;
		this.especificacao = especificacao;
		this.grupoMaterial = grupoMaterial;
		this.estoqueMinimo = estoqueMinimo;
		this.pontoPedido = pontoPedido;
		this.unidadeEstoque = unidadeEstoque;
		this.unidadeEntrada = unidadeEntrada;
		this.fatorConversaoEntrada = fatorConversaoEntrada;
		this.unidadeSaida = unidadeSaida;
		this.fatorConversaoSaida = fatorConversaoSaida;
		this.dadosAdicionais = dadosAdicionais;
		this.classificacao = classificacao;
		this.catmat = catmat;
		this.condicaoArmazenagem = condicaoArmazenagem;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}

	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getPontoPedido() {
		return pontoPedido;
	}

	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}

	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}

	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}

	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}

	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}

	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}

	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}

	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}

	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}

	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}

	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}

	public int getCatmat() {
		return catmat;
	}

	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}

	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}

	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}

	public StatusMaterial getStatus() {
		return status;
	}

	public void setStatus(StatusMaterial status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Material [codigo=" + codigo + ", nome=" + nome + ", especificacao=" + especificacao + ", grupoMaterial="
				+ grupoMaterial + ", estoqueMinimo=" + estoqueMinimo + ", pontoPedido=" + pontoPedido
				+ ", unidadeEstoque=" + unidadeEstoque + ", unidadeEntrada=" + unidadeEntrada
				+ ", fatorConversaoEntrada=" + fatorConversaoEntrada + ", unidadeSaida=" + unidadeSaida
				+ ", fatorConversaoSaida=" + fatorConversaoSaida + ", dadosAdicionais=" + dadosAdicionais
				+ ", classificacao=" + classificacao + ", catmat=" + catmat + ", condicaoArmazenagem="
				+ condicaoArmazenagem + ", status=" + status + "]";
	}
	
	
	
	

}
