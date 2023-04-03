package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoValor extends Desconto {

	public DescontoValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efeturarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean isAplicaDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
