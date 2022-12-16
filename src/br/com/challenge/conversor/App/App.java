package br.com.challenge.conversor.app;

import javax.swing.JOptionPane;

import br.com.challenge.conversor.util.Conversao;

public class App {

	public static void main(String[] args) {

		boolean continuar;

		do {
			String tipoDoConversor;
			String valor;
			try {
				tipoDoConversor = JOptionPane
						.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, null)
						.toString();
				valor = JOptionPane.showInputDialog("Informe um valor:").toString();
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso.");
				e.printStackTrace();
				break;
			}

			if (checaValorDigitado(valor)) {
				switch (tipoDoConversor) {
				case "Conversor de Moeda": {
					try {
						Conversao.converteMoedas(Double.parseDouble(valor));
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Você deve selecionar um dos tipos de conversão.");
						e.printStackTrace();
					}
					break;
				}
				case "Conversor de Temperatura": {
					try {						
						Conversao.converteTemperaturas(Double.parseDouble(valor));
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Você deve selecionar um dos tipos de conversão.");
						e.printStackTrace();
					}
					break;
				}
				}
				int continuarOpcaoSelecionada = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (continuarOpcaoSelecionada == 0) {
					continuar = true;
				} else {
					continuar = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "O valor informado é inválido. Tente novamente!");
				continuar = true;
			}
		} while (continuar);
	}

	public static boolean checaValorDigitado(String valor) {
		try {
			double x = Double.parseDouble(valor);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
