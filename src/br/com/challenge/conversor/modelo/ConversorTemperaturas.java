package br.com.challenge.conversor.modelo;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {

	public void converteFahrenheitACelsius(double f) {
		double temperaturaCelsius = Math.round(((f - 32) * 5 / 9) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, f + " Grau Fahrenheit é igual a " + temperaturaCelsius + " Grau Celsius.");
	}

	public void converteFahrenheitAKelvin(double f) {
		double temperaturaKelvin = Math.round(((f - 32) * 5 / 9 + 273.15) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, f + " Grau Fahrenheit é igual a " + temperaturaKelvin + " Grau Kelvin.");
	}

	public void converteCelsiusAFahrenheit(double f) {
		double temperaturaFahrenheit = Math.round(((f * 9 / 5) + 32) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,
				f + " Grau Celsius é igual a " + temperaturaFahrenheit + " Grau Fahrenheit.");
	}

	public void converteCelsiusAKelvin(double f) {
		double temperaturaKelvin = Math.round((f + 273.15) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, f + " Grau Celsius é igual a " + temperaturaKelvin + " Grau Kelvin.");
	}

	public void converteKelvinACelsius(double f) {
		double temperaturaCelsius = Math.round((f - 273.15) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, f + " Grau Kelvin é igual a " + temperaturaCelsius + " Grau Celsius.");
	}

	public void converteKelvinAFahrenheit(double f) {
		double temperaturaFahrenheit = Math.round(((f - 273.15) * 9 / 5 + 32) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,
				f + " Grau Kelvin é igual a " + temperaturaFahrenheit + " Grau Fahrenheit.");
	}
}
