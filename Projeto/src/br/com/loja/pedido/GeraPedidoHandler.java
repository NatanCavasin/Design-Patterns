package br.com.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.acao.AcaoPosGerarPedido;

public class GeraPedidoHandler {

	// Construtor com as injeções de dependências: repository, service, etc.
	private List<AcaoPosGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoPosGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}

	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}

}
