package br.com.challenge.controller;

import br.com.challenge.conversor.modelo.entities.Temperaturas;

/**
 * Responsável por controlar qual método de conversão será invocado.
 * 
 * @author Marcos Allan
 * @version 0.1
 */
public class ControllerTemperatura {

	/**
	 * Exibe as opções de conversão disponíveis e instancia um conversor de
	 * temperaturas que recebe a opção escolhida e o valor para conversão.
	 * 
	 * @param valorParaConversao Valor no qual será convertido, de acordo com a
	 *                           opção escolhida.
	 */
	public String converteTemperaturas(String valorParaConversao, String opcao) {
		Temperaturas conversor = new Temperaturas(Double.parseDouble(valorParaConversao), opcao);
		return conversor.converte();
	}
}
