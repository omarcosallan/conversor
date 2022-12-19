package br.com.challenge.conversor.app;

import javax.swing.JOptionPane;

import br.com.challenge.conversor.util.Conversao;

public class App {

	public static void main(String[] args) {

		boolean continuar;
		String[] conversores = new String[] { "Conversor de Moeda", "Conversor de Temperatura" };

		do {
			String tipoDoConversor;
			String valor;

			try {
				tipoDoConversor = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu",
						JOptionPane.PLAIN_MESSAGE, null, conversores, null).toString();
				valor = JOptionPane.showInputDialog(null, "Valores decimais devem utilizar ponto: 00.00",
						"Informe um valor", JOptionPane.PLAIN_MESSAGE).toString();
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso.");
				e.printStackTrace();
				break;
			}

			if (checaValorDigitado(valor)) {

				Conversao conversor = new Conversao();

				switch (tipoDoConversor) {
				case "Conversor de Moeda": {
					try {
						conversor.converteMoedas(Double.parseDouble(valor));
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Você deve selecionar um dos tipos de conversão.");
						e.printStackTrace();
					}
					break;
				}
				case "Conversor de Temperatura": {
					try {
						conversor.converteTemperaturas(Double.parseDouble(valor));
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Você deve selecionar um dos tipos de conversão.");
						e.printStackTrace();
					}
					break;
				}
				}

				int continuarOpcaoSelecionada = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
						"Selecione uma das opções", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if (continuarOpcaoSelecionada != 0) {
					continuar = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso.");
				} else {
					continuar = true;
				}
			} else {
				JOptionPane.showMessageDialog(null, "O valor informado é inválido. Tente novamente!");
				continuar = true;
			}
		} while (continuar);
	}
	
	/**
	 * 
	 * @param valor Valor a ser testado
	 * @return Retorna true se for número, caso contrário retorna false
	 */
	public static boolean checaValorDigitado(String valor) {
		try {
			double x = Double.parseDouble(valor);
			if (x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}


