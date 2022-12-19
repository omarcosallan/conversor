package br.com.challenge.conversor.util;

import javax.swing.JOptionPane;

import br.com.challenge.conversor.modelo.ConversorMoedas;
import br.com.challenge.conversor.modelo.ConversorTemperaturas;
import br.com.challenge.conversor.modelo.CotacaoMoedas;
import br.com.challenge.conversor.modelo.OpcoesDeConversao;

/**
 * Classe utilitária responsável por controlar a conversão (Moedas/Temperatura)
 * 
 * @author Marcos Allan
 *
 */
public class Conversao {

	private ConversorMoedas conversorMoedas;
	private ConversorTemperaturas conversorTemperaturas;
	private String[] opcoesConversaoMoedas = OpcoesDeConversao.MOEDAS.getOpcoes();
	private String[] opcoesConversaoTemperatura = OpcoesDeConversao.TEMPERATURAS.getOpcoes();

	/**
	 * Inicializa um conversor sem a necessidade de parametros
	 */
	public Conversao() {
		this.conversorMoedas = new ConversorMoedas();
		this.conversorTemperaturas = new ConversorTemperaturas();
	}

	/**
	 * Controla a chamada do método de conversão de moedas
	 * 
	 * @param valor Quantidade em dinheiro a ser convertida
	 */
	public void converteMoedas(double valor) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja converter seu dinheiro: ",
				"Menu", JOptionPane.PLAIN_MESSAGE, null, opcoesConversaoMoedas, null).toString();

		if (opcoes.contains("De Reais")) {
			conversorMoedas.converteDeReais(valor, CotacaoMoedas.getCurrency(opcoes));
		} else if (opcoes.contains("a Reais")) {
			conversorMoedas.converteParaReais(valor, CotacaoMoedas.getCurrency(opcoes));
		}
	}

	/**
	 * Controla a chamada do método de conversão de temperaturas
	 * 
	 * @param valor Quantidade em temperatura a ser convertida
	 */
	public void converteTemperaturas(double valor) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha a temperatura para a qual deseja converter: ",
				"Menu", JOptionPane.PLAIN_MESSAGE, null, opcoesConversaoTemperatura, null).toString();

		switch (opcoes) {
		case "De Fahrenheit a Celsius": {
			conversorTemperaturas.converteFahrenheitACelsius(valor);
			break;
		}
		case "De Fahrenheit a Kelvin": {
			conversorTemperaturas.converteFahrenheitAKelvin(valor);
			break;
		}
		case "De Celsius a Fahrenheit": {
			conversorTemperaturas.converteCelsiusAFahrenheit(valor);
			break;
		}
		case "De Celsius a Kelvin": {
			conversorTemperaturas.converteCelsiusAKelvin(valor);
			break;
		}
		case "De Kelvin a Celsius": {
			conversorTemperaturas.converteKelvinACelsius(valor);
			break;
		}
		case "De Kelvin a Fahrenheit": {
			conversorTemperaturas.converteKelvinAFahrenheit(valor);
			break;
		}
		}
	}
}
