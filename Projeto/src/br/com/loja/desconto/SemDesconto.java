package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	protected BigDecimal efeturarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean isAplicaDesconto(Orcamento orcamento) {
		return true;
	}
}
