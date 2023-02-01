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
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		this.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Seja bem-vindo ao meu conversor");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel.setBounds(87, 63, 260, 32);
		contentPane.add(lblNewLabel);

		JLabel lblSelecione = new JLabel("Selecione como deseja converter:");
		lblSelecione.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSelecione.setBounds(30, 128, 372, 14);
		contentPane.add(lblSelecione);

		JComboBox<Object> conversores = new JComboBox<Object>();
		conversores.setBounds(30, 153, 250, 22);
		contentPane.add(conversores);

		String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura" };
		conversores.setModel(new DefaultComboBoxModel<Object>(opcoes));

		JButton btnConverter = new JButton("Converter");
		btnConverter.setBounds(290, 153, 112, 23);
		contentPane.add(btnConverter);

		btnConverter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String opcao = conversores.getSelectedItem().toString();
				if (opcao.equals("Conversor de Moeda")) {
					Moeda frame = new Moeda();
					frame.setVisible(true);
					dispose();
				} else {
					Temperatura frame = new Temperatura();
					frame.setVisible(true);
					dispose();
				}
			}
		});
	}

}
