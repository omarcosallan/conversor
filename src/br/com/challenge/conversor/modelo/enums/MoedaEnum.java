package br.com.challenge.conversor.modelo.enums;

import java.util.Locale;

public enum MoedaEnum {

	DOLAR(5.2013, Locale.US, "BRL-USD"),
	EURO(5.5170, Locale.FRANCE, "BRL-EUR"),
	LIBRAS(6.2840, Locale.ENGLISH, "BRL-GBP"),
	IENES(0.0393, Locale.JAPAN, "BRL-JPY"),
	WON_COREANO(0.0041, Locale.KOREAN, "BRL-KRW");

	private double value;
	private Locale currency;
	private String code;

	/**
	 * Inicializa uma constante do tipo MoedaEnum, fornecendo algumas parametros.
	 * 
	 * @param valor       Valor da moeda na cotação atual.
	 * @param currency    Representa a moeda de uma região geográfica.
	 * @param nomeDaMoeda Uma representação String do nome da moeda.
	 */
	MoedaEnum(double value, Locale currency, String code) {
		this.value = value;
		this.currency = currency;
		this.code = code;
	}

	public double getValue() {
		return this.value;
	}

	public Locale getCurrency() {
		return this.currency;
	}
	
	public String getCode() {
		return this.code;
	}
}
