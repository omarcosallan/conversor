package br.com.challenge.conversor.modelo.entities;

/**
 * Responsável por realizar a conversão entre moedas de diferentes tipos.
 * 
 * @author Marcos Allan
 * @version 0.1
 */
public class Moeda {

	private double bid;

	public Moeda(double bid) {
		this.bid = bid;
	}
	
	public double getBid() {
		return this.bid;
	}
}