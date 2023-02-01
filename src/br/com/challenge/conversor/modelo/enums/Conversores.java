package br.com.challenge.conversor.modelo.enums;

public enum Conversores {

	MOEDA(new String[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
			"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Yenes a Reais",
			"De Won Coreano a Reais" }),
	TEMPERATURA(new String[] { "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Celsius a Fahrenheit",
			"De Celsius a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" });

	private String[] opcoes;

	Conversores(String[] descricao) {
		this.opcoes = descricao;
	}

	public String[] getOpcoes() {
		return this.opcoes;
	}
}
