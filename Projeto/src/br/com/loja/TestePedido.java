package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;

public class TestePedido {

	public static void main(String[] args) {
		String cliente = "McLovin";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = 25;

		GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/* dependencias */);
		handler.executa(dados);

	}

}
