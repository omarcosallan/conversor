package conversor;

public enum Moedas {
	
//	Cotação do dia 11/12/2022
	DOLAR(5.2409),
	EURO(5.5218),
	LIBRAS(6.4264),
	IENES(0.03838),
	WON_COREANO(0.0040);
	
	private double valor;
	
	Moedas(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
}
