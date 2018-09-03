package com.devon.programacao.persistencia;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControleHistorico {

	private JFrame frame;
	private JTextField txtData;
	private JTextField txtNumeroAnimal;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtTemperatura;
	
	private Historico historico;
	private final Path path = Paths.get("historico.dat");
	private JTextArea txtHistorico;
	private Date dataAtual = new Date();
	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleHistorico window = new ControleHistorico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControleHistorico() {
		initialize();
		historico = TrabalhoArquivosPersistencia.carregarHistorico(path);
		if(historico.getDataRegistro() != null) {
			txtHistorico.append(historico.gerarRelatorioAnimais());
			txtData.setText(historico.getDataFormatada(historico.getDataRegistro()));
		} else {
			txtData.setText(dateFormat.format(dataAtual));
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				TrabalhoArquivosPersistencia.salvarHistorico(historico, path);
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblData = new JLabel("Data:");
		GridBagConstraints gbc_lblData = new GridBagConstraints();
		gbc_lblData.insets = new Insets(0, 0, 5, 5);
		gbc_lblData.anchor = GridBagConstraints.EAST;
		gbc_lblData.gridx = 0;
		gbc_lblData.gridy = 0;
		frame.getContentPane().add(lblData, gbc_lblData);
		
		txtData = new JTextField();
		GridBagConstraints gbc_txtData = new GridBagConstraints();
		gbc_txtData.insets = new Insets(0, 0, 5, 0);
		gbc_txtData.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtData.gridx = 1;
		gbc_txtData.gridy = 0;
		frame.getContentPane().add(txtData, gbc_txtData);
		txtData.setColumns(10);
		
		JLabel lblNmeroDoAnimal = new JLabel("N\u00FAmero do animal:");
		GridBagConstraints gbc_lblNmeroDoAnimal = new GridBagConstraints();
		gbc_lblNmeroDoAnimal.anchor = GridBagConstraints.EAST;
		gbc_lblNmeroDoAnimal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDoAnimal.gridx = 0;
		gbc_lblNmeroDoAnimal.gridy = 1;
		frame.getContentPane().add(lblNmeroDoAnimal, gbc_lblNmeroDoAnimal);
		
		txtNumeroAnimal = new JTextField();
		GridBagConstraints gbc_txtNumeroAnimal = new GridBagConstraints();
		gbc_txtNumeroAnimal.insets = new Insets(0, 0, 5, 0);
		gbc_txtNumeroAnimal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumeroAnimal.gridx = 1;
		gbc_txtNumeroAnimal.gridy = 1;
		frame.getContentPane().add(txtNumeroAnimal, gbc_txtNumeroAnimal);
		txtNumeroAnimal.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso:");
		GridBagConstraints gbc_lblPeso = new GridBagConstraints();
		gbc_lblPeso.anchor = GridBagConstraints.EAST;
		gbc_lblPeso.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeso.gridx = 0;
		gbc_lblPeso.gridy = 2;
		frame.getContentPane().add(lblPeso, gbc_lblPeso);
		
		txtPeso = new JTextField();
		GridBagConstraints gbc_txtPeso = new GridBagConstraints();
		gbc_txtPeso.insets = new Insets(0, 0, 5, 0);
		gbc_txtPeso.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPeso.gridx = 1;
		gbc_txtPeso.gridy = 2;
		frame.getContentPane().add(txtPeso, gbc_txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		GridBagConstraints gbc_lblAltura = new GridBagConstraints();
		gbc_lblAltura.anchor = GridBagConstraints.EAST;
		gbc_lblAltura.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltura.gridx = 0;
		gbc_lblAltura.gridy = 3;
		frame.getContentPane().add(lblAltura, gbc_lblAltura);
		
		txtAltura = new JTextField();
		GridBagConstraints gbc_txtAltura = new GridBagConstraints();
		gbc_txtAltura.insets = new Insets(0, 0, 5, 0);
		gbc_txtAltura.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAltura.gridx = 1;
		gbc_txtAltura.gridy = 3;
		frame.getContentPane().add(txtAltura, gbc_txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblTemperatura = new JLabel("Temperatura:");
		GridBagConstraints gbc_lblTemperatura = new GridBagConstraints();
		gbc_lblTemperatura.anchor = GridBagConstraints.EAST;
		gbc_lblTemperatura.insets = new Insets(0, 0, 5, 5);
		gbc_lblTemperatura.gridx = 0;
		gbc_lblTemperatura.gridy = 4;
		frame.getContentPane().add(lblTemperatura, gbc_lblTemperatura);
		
		txtTemperatura = new JTextField();
		GridBagConstraints gbc_txtTemperatura = new GridBagConstraints();
		gbc_txtTemperatura.insets = new Insets(0, 0, 5, 0);
		gbc_txtTemperatura.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTemperatura.gridx = 1;
		gbc_txtTemperatura.gridy = 4;
		frame.getContentPane().add(txtTemperatura, gbc_txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Animal animal = new Animal();
				animal.setNumeroIdentificacao(Integer.parseInt(txtNumeroAnimal.getText()));
				animal.setKilos(Double.parseDouble(txtPeso.getText()));
				animal.setAltura(Short.parseShort(txtAltura.getText()));
				animal.setTemperatura(Double.parseDouble(txtTemperatura.getText()));
				historico.adicionarAnimal(animal);
				txtHistorico.append(animal.gerarHistorico());
			}
		});
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGravar.gridx = 1;
		gbc_btnGravar.gridy = 5;
		frame.getContentPane().add(btnGravar, gbc_btnGravar);
		
		txtHistorico = new JTextArea();
		GridBagConstraints gbc_txtHistorico = new GridBagConstraints();
		gbc_txtHistorico.gridwidth = 2;
		gbc_txtHistorico.fill = GridBagConstraints.BOTH;
		gbc_txtHistorico.gridx = 0;
		gbc_txtHistorico.gridy = 6;
		frame.getContentPane().add(txtHistorico, gbc_txtHistorico);
	}

}
