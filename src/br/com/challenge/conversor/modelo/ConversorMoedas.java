package br.com.challenge.conversor.modelo;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JOptionPane;

/**
 * Conversor de Moedas
 * 
 * @author Marcos Allan
 *
 */
public class ConversorMoedas {

	private Locale localeBrazil;
	private SimpleDateFormat sdf;

	public ConversorMoedas() {
		this.localeBrazil = new Locale("pt", "BR");
		this.sdf = new SimpleDateFormat("dd 'de' MMM, HH:mm z");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	/**
	 * 
	 * @return Retorna a data atual no TimeZone UTC
	 */
	public Date dataAtual() {
		Date data = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.HOUR_OF_DAY, -3);
		return data = calendario.getTime();
	}

	/**
	 * Recebe um valor e uma moeda para qual o valor deve ser convertido
	 * 
	 * @param valor Valor a ser convertido
	 * @param moeda Moeda para a qual o valor será convertido
	 */
	public void converteDeReais(double valor, CotacaoMoedas moeda) {
		double valorConvertido = Math.round((valor / moeda.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,
				"Cotação atual: " + NumberFormat.getCurrencyInstance(localeBrazil).format(valor) + " são "
						+ NumberFormat.getCurrencyInstance(moeda.getCurrency()).format(valorConvertido),
				sdf.format(dataAtual()), JOptionPane.PLAIN_MESSAGE);
	}

	/**
	 * Recebe um valor e uma moeda para qual o valor deve ser convertido
	 * 
	 * @param valor Valor a ser convertido
	 * @param moeda Moeda para a qual o valor será convertido
	 */
	public void converteParaReais(double valor, CotacaoMoedas moeda) {
		double valorConvertido = Math.round((valor * moeda.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,
				"Você tem " + NumberFormat.getCurrencyInstance(localeBrazil).format(valorConvertido));
	}
}