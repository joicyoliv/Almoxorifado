package br.ufrn.imd.almoxorifado.dominio;

import br.ufrn.imd.almoxifado.controlequalidade.SolicitacaoAnalise;
import br.ufrn.imd.almoxorifado.coq.MetodoEspecificoAnalise;
import br.ufrn.imd.almoxorifado.producao.*;
import br.ufrn.imd.almoxorifado.rh.*;

/**
 * Classe main para instanciar os objetos
 * @author joicy
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Almoxorifado almoxorifado = new Almoxorifado();
		ChecklistRecebimentoComum checklistRecebimentoComum = new ChecklistRecebimentoComum();
		ChecklistTransferencia checklistTransferencia = new ChecklistTransferencia();
		ClassificacaoMaterial classificacaoMaterial = new ClassificacaoMaterial();
		ConferenciaPesagem conferenciaPesagem = new ConferenciaPesagem();
		DadosEntrega dadosEntrega = new DadosEntrega();
		DadosFrete dadosFrete = new DadosFrete();
		DadosPagamento dadosPagamento = new DadosPagamento();
		DimensaoUnidade dimensaoUnidade = new DimensaoUnidade();
		Documento documento = new Documento();
		EntradaEstoque entradaEstoque = new EntradaEstoque();
		Estoque estoque = new Estoque();
		GrupoMaterial grupoMaterial = new GrupoMaterial();
		GuiaRemessa guiaRemessa = new GuiaRemessa();
		HistoricoRequisicao historicoRequisicao = new HistoricoRequisicao();
		ItemRequisicao itemRequisicao = new ItemRequisicao();
		LocalizacaoAlmoxorifado localizacaoAlmoxorifado = new LocalizacaoAlmoxorifado();
		LoteMaterial loteMaterial = new LoteMaterial();
		Material material = new Material();
		MaterialAnalisavel materialAnalisavel = new MaterialAnalisavel();
		MovimentacaoEntrada movimentacaoEntrada = new MovimentacaoEntrada();
		MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
		MovimentacaoSaida movimentacaoSaida = new MovimentacaoSaida();
		NaturezaOperacao naturezaOperacao = new NaturezaOperacao();
		NotaFiscal notaFiscal = new NotaFiscal();
		PesagemVolume pesagemVolume = new PesagemVolume();
		ReservaMaterial reservaMaterial = new ReservaMaterial();
		SaidaEstoque saidaEstoque = new SaidaEstoque();
		SaidaRequisicaoInterna saidaRequisicaoInterna = new SaidaRequisicaoInterna();
		UnidadeMedida unidadeMedida = new UnidadeMedida();
		Usuario usuario = new Usuario();
		VolumeMaterial VolumeMaterial = new VolumeMaterial();
		SolicitacaoAnalise solicitacaoAnalise = new SolicitacaoAnalise();
		MetodoEspecificoAnalise metodoEspecificoAnalise = new MetodoEspecificoAnalise();
		DenominacaoComumBrasileira denominacaoComumBrasileira = new DenominacaoComumBrasileira();
		OrdemProducao ordemProducao = new OrdemProducao();
		Setor setor = new Setor();
		Contato contato = new Contato();
		Endereco endereco = new Endereco();
		Funcionario funcionario = new Funcionario();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
	}

}
