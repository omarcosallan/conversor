package br.com.challenge.conversor.views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.challenge.controller.ControllerMoedas;
import br.com.challenge.conversor.modelo.enums.Conversores;

public class Moeda extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moeda frame = new Moeda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Moeda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Estou pronto para converter suas moedas");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel.setBounds(56, 25, 321, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Insira um valor (Ex.: xx.xx):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(31, 76, 372, 14);
		contentPane.add(lblNewLabel_1);

		txtValor = new JTextField();
		txtValor.setBounds(31, 101, 372, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		JLabel lblSelecione = new JLabel("Selecione como deseja converter:");
		lblSelecione.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSelecione.setBounds(31, 141, 372, 14);
		contentPane.add(lblSelecione);

		JComboBox<Object> conversores = new JComboBox<Object>();
		conversores.setBounds(31, 166, 250, 22);
		contentPane.add(conversores);

		String[] opcoes = Conversores.MOEDA.getOpcoes();
		conversores.setModel(new DefaultComboBoxModel<Object>(opcoes));

		JButton btnConverter = new JButton("Converter");
		btnConverter.setBounds(291, 166, 112, 23);
		contentPane.add(btnConverter);

		JLabel txtResultado = new JLabel("Conversão:");
		txtResultado.setHorizontalAlignment(SwingConstants.LEFT);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtResultado.setBounds(31, 205, 372, 22);
		contentPane.add(txtResultado);

		btnConverter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ControllerMoedas controllerMoedas = new ControllerMoedas();
					String valor = txtValor.getText();
					txtResultado.setText("Conversão: " +
							controllerMoedas.converteMoedas(valor, conversores.getSelectedItem()));
				} catch (NumberFormatException ex) {
					txtResultado.setText("O valor informado é inválido.");
				} catch (IllegalArgumentException ex) {
					txtResultado.setText(ex.getMessage());
				}
			}
		});
	}
}
