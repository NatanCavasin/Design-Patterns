package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		return new DescontoQunastidadeItens(new DescontoValor(new SemDesconto())).calcular(orcamento);

	}

}
