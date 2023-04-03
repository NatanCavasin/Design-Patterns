package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoQunastidadeItens extends Desconto {

	public DescontoQunastidadeItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efeturarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean isAplicaDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
