package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDeDesconto;
import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));

		CalculadoraDeDesconto calculadoraDesconto = new CalculadoraDeDesconto();
		System.out.println(calculadoraDesconto.calcular(orcamento));
		System.out.println(calculadoraDesconto.calcular(orcamento2));
	}

}
