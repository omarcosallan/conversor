package br.com.challenge.controller;

import br.com.challenge.conversor.modelo.services.ServiceMoeda;

/**
 * Responsável por controlar qual método de conversão será invocado.
 * 
 * @author Marcos Allan
 * @version 0.1
 */
public class ControllerMoedas {

	/**
	 * Exibe as opções de conversão disponíveis e instancia um conversor de moedas
	 * que recebe a opção escolhida e o valor para conversão.
	 * 
	 * @param valorParaConversao Valor no qual será convertido, de acordo com a
	 *                           opção escolhida.
	 */
	public String converteMoedas(String txtValor, Object selectedItem) {
		if (txtValor.equals("")) {
			throw new IllegalArgumentException("É necessário informar um valor.");
		}
		Double valor = Double.parseDouble(txtValor);

		String opcao = selectedItem.toString();

		ServiceMoeda conversor = new ServiceMoeda();
		switch (opcao) {
		case "De Reais a Dólares": {
			return conversor.converteReaisADolar(valor);
		}
		case "De Reais a Euros": {
			return conversor.converteReaisAEuro(valor);
		}
		case "De Reais a Libras": {
			return conversor.converteReaisALibras(valor);
		}
		case "De Reais a Yenes": {
			return conversor.converteReaisAYenes(valor);
		}
		case "De Reais a Won Coreano": {
			return conversor.converteReaisAWonCoreano(valor);
		}
		case "De Dólares a Reais": {
			return conversor.converteDolarAReais(valor);
		}
		case "De Euros a Reais": {
			return conversor.converteEuroAReais(valor);
		}
		case "De Libras a Reais": {
			return conversor.converteLibrasAReais(valor);
		}
		case "De Yenes a Reais": {
			return conversor.converteYenesAReais(valor);
		}
		case "De Won Coreano a Reais": {
			return conversor.converteWonCoreanoAReais(valor);
		}
		default: {
			return "";
		}
		}
	}
}
