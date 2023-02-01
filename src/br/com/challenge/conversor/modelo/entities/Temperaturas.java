package br.com.challenge.conversor.modelo.entities;

/**
 * Responsável por realizar a conversão entre temperaturas de diferentes tipos.
 * 
 * @author Marcos Allan
 * @version 0.1
 */
public class Temperaturas {

	private String opcaoDeConversao;
	private double valorParaConversao;
	private double valorConvertido;

	/**
	 * Construtor para inicializar um conversor de moedas a partir de uma String
	 * contendo a opção escolhida de conversão e o valor para o qual ocorrerá a
	 * conversão.
	 */
	public Temperaturas(double valorParaConversao, String opcaoDeConversao) {
		this.valorParaConversao = valorParaConversao;
		this.opcaoDeConversao = opcaoDeConversao;
	}

	/**
	 * Chama o método apropriado para realizar a conversão, baseado na escolha
	 * contida na String this.opcaoDeConversao da instância da classe.
	 */
	public String converte() {
		if (this.opcaoDeConversao.contains("a Celsius")) {
			return converteParaCelsius();
		} else if (this.opcaoDeConversao.contains("a Fahrenheit")) {
			return converteParaFahrenheit();
		} else if (this.opcaoDeConversao.contains("a Kelvin")) {
			return converteParaKelvin();
		}
		return "";
	}

	private String converteParaCelsius() {
		if (this.opcaoDeConversao.contains("De Fahrenheit")) {
			return String.valueOf(valorConvertido = Math.round(((this.valorParaConversao - 32) * 5 / 9) * 100.0) / 100.0);
		} else if (this.opcaoDeConversao.contains("De Kelvin")) {
			return String.valueOf(valorConvertido = Math.round((this.valorParaConversao - 273.15) * 100.0) / 100.0);
		}
		return "";
	}

	private String converteParaFahrenheit() {
		if (this.opcaoDeConversao.contains("De Celsius")) {
			return String.valueOf(valorConvertido = Math.round(((this.valorParaConversao * 9 / 5) + 32) * 100.0) / 100.0);
		} else if (this.opcaoDeConversao.contains("De Kelvin")) {
			return String.valueOf(valorConvertido = Math.round(((this.valorParaConversao - 273.15) * 9 / 5 + 32) * 100.0) / 100.0);
		}
		return "";
	}

	private String converteParaKelvin() {
		if (this.opcaoDeConversao.contains("De Celsius")) {
			return String.valueOf(valorConvertido = Math.round((this.valorParaConversao + 273.15) * 100.0) / 100.0);
		} else if (this.opcaoDeConversao.contains("De Fahrenheit")) {
			return String.valueOf(valorConvertido = Math.round(((this.valorParaConversao - 32) * 5 / 9 + 273.15) * 100.0) / 100.0);
		}
		return "";
	}

	@Override
	public String toString() {
		String to = this.opcaoDeConversao.substring(3, this.opcaoDeConversao.indexOf(" a "));
		String from = this.opcaoDeConversao.substring(this.opcaoDeConversao.indexOf(" a ") + 3);
		return this.valorParaConversao + " graus " + to + " equivalem a " + this.valorConvertido + " graus " + from;
	}
}
