package br.com.challenge.conversor.util;

import javax.swing.JOptionPane;

import br.com.challenge.conversor.modelo.ConversorMoedas;
import br.com.challenge.conversor.modelo.ConversorTemperaturas;

/**
 * Classe utilitária responsável por controlar a conversão (Moedas/Temperatura)
 * 
 * @author Marcos Allan
 *
 */
public class Conversao {

	private static ConversorMoedas conversorMoedas = new ConversorMoedas();
	private static ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();

	/**
	 * Converte moedas de acordo com a opção selecionada pelo usuário
	 * 
	 * @param valor Quantidade em dinheiro a ser convertida
	 */
	public static void converteMoedas(double valor) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja converter seu dinheiro: ",
				"Menu", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
						"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
						"De Yenes a Reais", "De Won Coreano a Reais" },
				null).toString();
		
		switch (opcoes) {
		case "De Reais a Dólares": {
			conversorMoedas.converteReaisADolar(valor);
			break;
		}
		case "De Reais a Euros": {
			conversorMoedas.converteReaisAEuro(valor);
			break;
		}
		case "De Reais a Libras": {
			conversorMoedas.converteReaisALibras(valor);
			break;
		}
		case "De Reais a Yenes": {
			conversorMoedas.converteReaisAYenes(valor);
			break;
		}
		case "De Reais a Won Coreano": {
			conversorMoedas.converteReaisAWonCoreano(valor);
			break;
		}
		case "De Dólares a Reais": {
			conversorMoedas.converteDolarAReais(valor);
			break;
		}
		case "De Euros a Reais": {
			conversorMoedas.converteEuroAReais(valor);
			break;
		}
		case "De Libras a Reais": {
			conversorMoedas.converteLibrasAReais(valor);
			break;
		}
		case "De Yenes a Reais": {
			conversorMoedas.converteYenesAReais(valor);
			break;
		}
		case "De Won Coreano a Reais": {
			conversorMoedas.converteWonCoreanoAReais(valor);
			break;
		}
		}
	}

	/**
	 * Converte temperaturas de acordo com a opção selecionada pelo usuário
	 * 
	 * @param valor Temperatura a ser convertida
	 */
	public static void converteTemperaturas(double valor) {
		String opcoes = JOptionPane
				.showInputDialog(null, "Escolha a temperatura para a qual deseja converter: ", "Menu",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Celsius a Fahrenheit",
								"De Celsius a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" },
						null)
				.toString();
		
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
