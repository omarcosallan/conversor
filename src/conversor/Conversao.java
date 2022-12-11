package conversor;

import javax.swing.JOptionPane;

public class Conversao {

	private static ConversorMoedas conversor = new ConversorMoedas();

	public static void converteMoedas(double valor) {
		String opcoes = null;

		try {
			opcoes = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja converter seu dinheiro: ",
					"Menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
							"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
							"De Yenes a Reais", "De Won Coreano a Reais" },
					null).toString();
			switch (opcoes) {
			case "De Reais a Dólares": {
				conversor.converteReaisADolar(valor);
				break;
			}
			case "De Reais a Euros": {
				conversor.converteReaisAEuro(valor);
				break;
			}
			case "De Reais a Libras": {
				conversor.converteReaisALibras(valor);
				break;
			}
			case "De Reais a Yenes": {
				conversor.converteReaisAYenes(valor);
				break;
			}
			case "De Reais a Won Coreano": {
				conversor.converteReaisAWonCoreano(valor);
				break;
			}
			case "De Dólares a Reais": {
				conversor.converteDolarAReais(valor);
				break;
			}
			case "De Euros a Reais": {
				conversor.converteEuroAReais(valor);
				break;
			}
			case "De Libras a Reais": {
				conversor.converteLibrasAReais(valor);
				break;
			}
			case "De Yenes a Reais": {
				conversor.converteYenesAReais(valor);
				break;
			}
			case "De Won Coreano a Reais": {
				conversor.converteWonCoreanoAReais(valor);
				break;
			}
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Você deve selecionar um dos tipos de conversão.");
			e.printStackTrace();
		}
	}
}
