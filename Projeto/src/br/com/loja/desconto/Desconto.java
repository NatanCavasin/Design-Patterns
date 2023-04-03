package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (this.isAplicaDesconto(orcamento)) {
			return this.efeturarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}

	protected abstract BigDecimal efeturarCalculo(Orcamento orcamento);

	public abstract boolean isAplicaDesconto(Orcamento orcamento);

}
