package br.com.challenge.conversor.modelo;

import javax.swing.JOptionPane;

/**
 * Conversor de Temperaturas
 * 
 * @author Marcos Allan
 *
 */
public class ConversorTemperaturas {

	/**
	 * Recebe um valor em Fahrenheit e converte para Celsius
	 * 
	 * @param f Graus Fahrenheit para conversão
	 */
	public void converteFahrenheitACelsius(double f) {
		double temperaturaCelsius = Math.round(((f - 32) * 5 / 9) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, f + " Grau Fahrenheit é igual a " + temperaturaCelsius + " Grau Celsius.");
	}

	/**
	 * Recebe um valor em Fahrenheit e converte para Kelvin
	 * 
	 * @param f Graus Fahrenheit para conversão
	 */
	public void converteFahrenheitAKelvin(double f) {
		double temperaturaKelvin = Math.round(((f - 32) * 5 / 9 + 273.15) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, f + " Grau Fahrenheit é igual a " + temperaturaKelvin + " Grau Kelvin.");
	}

	/**
	 * Recebe um valor em Celsius e converte para Fahrenheit
	 * 
	 * @param c Graus Celsius para conversão
	 */
	public void converteCelsiusAFahrenheit(double c) {
		double temperaturaFahrenheit = Math.round(((c * 9 / 5) + 32) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,
				c + " Grau Celsius é igual a " + temperaturaFahrenheit + " Grau Fahrenheit.");
	}

	/**
	 * Recebe um valor em Celsius e converte para Kelvin
	 * 
	 * @param c Graus Celsius para conversão
	 */
	public void converteCelsiusAKelvin(double c) {
		double temperaturaKelvin = Math.round((c + 273.15) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, c + " Grau Celsius é igual a " + temperaturaKelvin + " Grau Kelvin.");
	}

	/**
	 * Recebe um valor em Kelvin e converte para Celsius
	 * 
	 * @param k Graus Kelvin para conversão
	 */
	public void converteKelvinACelsius(double k) {
		double temperaturaCelsius = Math.round((k - 273.15) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, k + " Grau Kelvin é igual a " + temperaturaCelsius + " Grau Celsius.");
	}

	/**
	 * Recebe um valor em Kelvin e converte para Fahrenheit
	 * 
	 * @param k Graus Kelvin para conversão
	 */
	public void converteKelvinAFahrenheit(double k) {
		double temperaturaFahrenheit = Math.round(((k - 273.15) * 9 / 5 + 32) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,
				k + " Grau Kelvin é igual a " + temperaturaFahrenheit + " Grau Fahrenheit.");
	}
}
