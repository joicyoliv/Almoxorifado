package br.ufrn.imd.almoxorifado.dominio;

/**
 * Enum que representa o status da requisicao
 * @author joicy
 *
 */
public enum StatusRequisicao {
	
	CADASTRADA,
	EM_ANALISE,
	REPROVADA_CHEFE_SETOR,
	ENVIADA,
	ATENDIDA,
	ATENDIDA_PARCIALMENTE,
	NEGADA;
}
