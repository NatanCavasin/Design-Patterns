package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outro; // auto relacionamento, a classe com ela mesma

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImporto = BigDecimal.ZERO;
		if (outro != null) {
			valorDoOutroImporto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorDoOutroImporto);
	}
}
