package conversor;

import javax.swing.JOptionPane;

public class ConversorMoedas {
	
	public void converteReaisADolar(double valor) {
		double moedaDolar = Math.round((valor / Moedas.DOLAR.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " dólares.");
	}
	
	public void converteReaisAEuro(double valor) {
		double moedaEuro = Math.round((valor / Moedas.EURO.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem € " + moedaEuro + " euros.");
	}
	
	public void converteReaisALibras(double valor) {
		double moedaLibras = Math.round((valor / Moedas.LIBRAS.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem £ " + moedaLibras + " libras.");
	}
	
	public void converteReaisAYenes(double valor) {
		double moedaYenes = Math.round((valor / Moedas.IENES.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem ¥ " + moedaYenes + " yenes.");
	}
	
	public void converteReaisAWonCoreano(double valor) {
		double moedaWon = Math.round((valor / Moedas.WON_COREANO.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem 	₩ " + moedaWon + " wons.");
	}
	
	public void converteDolarAReais(double valor) {
		double moedaDolar = Math.round((valor * Moedas.DOLAR.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaDolar + " reais.");
	}
	
	public void converteEuroAReais(double valor) {
		double moedaEuro = Math.round((valor * Moedas.EURO.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaEuro + " reais.");
	}
	
	public void converteLibrasAReais(double valor) {
		double moedaLibras = Math.round((valor * Moedas.LIBRAS.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaLibras + " reais.");
	}
	
	public void converteYenesAReais(double valor) {
		double moedaYenes = Math.round((valor * Moedas.IENES.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaYenes + " reais.");
	}
	
	public void converteWonCoreanoAReais(double valor) {
		double moedaWon = Math.round((valor * Moedas.WON_COREANO.getValor()) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaWon + " reais.");
	}
}
