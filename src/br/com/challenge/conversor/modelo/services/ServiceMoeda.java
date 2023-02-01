package br.com.challenge.conversor.modelo.services;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.challenge.conversor.modelo.enums.MoedaEnum;

public class ServiceMoeda {

	public String converteReaisADolar(double valor) {
		return converte(valor, MoedaEnum.DOLAR, false);
	}

	public String converteReaisAEuro(double valor) {
		return converte(valor, MoedaEnum.EURO, false);
	}

	public String converteReaisALibras(double valor) {
		return converte(valor, MoedaEnum.LIBRAS, false);
	}

	public String converteReaisAYenes(double valor) {
		return converte(valor, MoedaEnum.IENES, false);
	}

	public String converteReaisAWonCoreano(double valor) {
		return converte(valor, MoedaEnum.WON_COREANO, false);
	}

	public String converteDolarAReais(double valor) {
		return converte(valor, MoedaEnum.DOLAR, true);
	}

	public String converteEuroAReais(double valor) {
		return converte(valor, MoedaEnum.EURO, true);
	}

	public String converteLibrasAReais(double valor) {
		return converte(valor, MoedaEnum.LIBRAS, true);
	}

	public String converteYenesAReais(double valor) {
		return converte(valor, MoedaEnum.IENES, true);
	}

	public String converteWonCoreanoAReais(double valor) {
		return converte(valor, MoedaEnum.WON_COREANO, true);
	}

	private static String converte(Double valor, MoedaEnum moeda, boolean toBrl) {
		double valorDaMoeda = new ServiceValorMoeda().valorMoeda(moeda.getCode()).getBid();
		double conversao;
		Locale locale;
		if (toBrl) {
			locale = new Locale("pt", "BR");
			conversao = valor / valorDaMoeda;
		} else {
			locale = moeda.getCurrency();
			conversao = valor * valorDaMoeda;
		}
		conversao = Math.round(conversao * 100.0) / 100.0;
		return NumberFormat.getCurrencyInstance(locale).format(conversao);
	}
}
