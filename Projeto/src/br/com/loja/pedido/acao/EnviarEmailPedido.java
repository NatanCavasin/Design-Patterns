package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoPosGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com os dados do pedido");
	}
}
