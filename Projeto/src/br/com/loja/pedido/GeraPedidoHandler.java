package br.com.loja.pedido;

import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	// Construtor com as injeções de dependências: repository, service, etc.

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		// Funções que podem ser executadas
		System.out.println("Salvar no banco");
		System.out.println("Enviar email");
	}

}
