package br.com.challenge.conversor.modelo;

import java.util.Locale;

/**
 * Constantes para armazenar e retornar cotação das moedas, formatação da moeda e o seu nome
 * 
 * @author Marcos Allan
 *
 */
public enum CotacaoMoedas {
	
	// Cotação de Fechamento do dia 17/12/2022
	DOLAR(5.3085, Locale.US, "Dólar"),
	EURO(5.6241, Locale.FRANCE, "Euro"),
	LIBRAS(6.4467, Locale.ENGLISH, "Libras"),
	IENES(0.0388, Locale.JAPAN, "Yenes"),
	WON_COREANO(0.0041, Locale.KOREA, "Won Coreano");
	
	private double valor;
	private String nomeDaMoeda;
	private Locale currency;
	
	CotacaoMoedas(double valor, Locale currency, String nomeDaMoeda) {
		this.valor = valor;
		this.currency = currency;
		this.nomeDaMoeda = nomeDaMoeda;
	}
	
	/**
	 * 
	 * @return Retorna o valor da cotação atual
	 */
	public double getValor() {
		return this.valor;
	}
	
	/**
	 * 
	 * @return Retorna a moeda padrão desta localidade para formatação
	 */
	public Locale getCurrency() {
		return this.currency;
	}
	
	public String getNomeDaMoeda() {
		return this.nomeDaMoeda;
	}
	
	public static CotacaoMoedas getCurrency(String s) {
		for (CotacaoMoedas m : CotacaoMoedas.values()) {
			if (s.contains(m.getNomeDaMoeda())) {
				return m;
			}
		}
		return null;
	}
}
