
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroTrechos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField horasOrigemField;
	private JTextField minutosOrigemField;
	private JTextField horasDestinoField;
	private JTextField minutosDestinoField;
	private JTextField cidadeOrigemField;
	private JTextField aeroportoOrigemField;
	private JLabel lblNewLabel_1;
	private JLabel lblAeroporto_1;
	private JLabel lblCidade_1;
	private JTextField cidadeDestinoField;
	private JTextField aeroportoDestinoField;
	private JComboBox paisOrigemComboBox;
	private JComboBox paisDestinoComboBox;


	/**
	 * Create the frame.
	 */
	public CadastroTrechos() {
		setTitle("Cadastrar Trecho");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 215);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHorario = new JLabel("Horário:");
		lblHorario.setBounds(26, 37, 61, 14);
		contentPane.add(lblHorario);
		
		JLabel lblOrigem = new JLabel("Origem");
		lblOrigem.setBounds(77, 11, 72, 14);
		contentPane.add(lblOrigem);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setBounds(260, 11, 115, 14);
		contentPane.add(lblDestino);
		
		horasOrigemField = new JTextField();
		horasOrigemField.setBounds(87, 34, 29, 20);
		contentPane.add(horasOrigemField);
		horasOrigemField.setColumns(10);
		
		minutosOrigemField = new JTextField();
		minutosOrigemField.setColumns(10);
		minutosOrigemField.setBounds(126, 34, 29, 20);
		contentPane.add(minutosOrigemField);
		
		JLabel lblHorario_1 = new JLabel("Horário:");
		lblHorario_1.setBounds(233, 37, 52, 14);
		contentPane.add(lblHorario_1);
		
		horasDestinoField = new JTextField();
		horasDestinoField.setColumns(10);
		horasDestinoField.setBounds(295, 34, 29, 20);
		contentPane.add(horasDestinoField);
		
		minutosDestinoField = new JTextField();
		minutosDestinoField.setColumns(10);
		minutosDestinoField.setBounds(334, 34, 29, 20);
		contentPane.add(minutosDestinoField);
		
		JLabel lblNewLabel = new JLabel("País: ");
		lblNewLabel.setBounds(26, 62, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAeroporto = new JLabel("Aeroporto:");
		lblAeroporto.setBounds(26, 115, 78, 14);
		contentPane.add(lblAeroporto);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(26, 90, 49, 14);
		contentPane.add(lblCidade);
		
		cidadeOrigemField = new JTextField();
		cidadeOrigemField.setColumns(10);
		cidadeOrigemField.setBounds(77, 87, 119, 20);
		contentPane.add(cidadeOrigemField);
		
		aeroportoOrigemField = new JTextField();
		aeroportoOrigemField.setColumns(10);
		aeroportoOrigemField.setBounds(100, 112, 96, 20);
		contentPane.add(aeroportoOrigemField);
		
		lblNewLabel_1 = new JLabel("País: ");
		lblNewLabel_1.setBounds(233, 59, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		lblAeroporto_1 = new JLabel("Aeroporto:");
		lblAeroporto_1.setBounds(233, 112, 78, 14);
		contentPane.add(lblAeroporto_1);
		
		lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setBounds(233, 87, 49, 14);
		contentPane.add(lblCidade_1);
		
		cidadeDestinoField = new JTextField();
		cidadeDestinoField.setColumns(10);
		cidadeDestinoField.setBounds(284, 87, 124, 20);
		contentPane.add(cidadeDestinoField);
		
		aeroportoDestinoField = new JTextField();
		aeroportoDestinoField.setColumns(10);
		aeroportoDestinoField.setBounds(310, 112, 98, 20);
		contentPane.add(aeroportoDestinoField);
		
		paisOrigemComboBox = new JComboBox();
		paisOrigemComboBox.setModel(new DefaultComboBoxModel(new String[] {"Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"}));
		paisOrigemComboBox.setSelectedIndex(34);
		paisOrigemComboBox.setBounds(77, 58, 119, 22);
		contentPane.add(paisOrigemComboBox);
		
		paisDestinoComboBox = new JComboBox();
		paisDestinoComboBox.setModel(new DefaultComboBoxModel(new String[] {"Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"}));
		paisDestinoComboBox.setSelectedIndex(34);
		paisDestinoComboBox.setBounds(284, 58, 124, 22);
		contentPane.add(paisDestinoComboBox);
		
		JButton cadastrarBotao = new JButton("Cadastrar");
		cadastrarBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Horario horarioOrigem = new Horario(Integer.parseInt(horasOrigemField.getText()), Integer.parseInt(minutosOrigemField.getText()));
				Horario horarioDestino = new Horario(Integer.parseInt(horasDestinoField.getText()), Integer.parseInt(minutosDestinoField.getText()));
				Aeroporto aeroportoOrigem = DadosAeroporto.buscar(aeroportoOrigemField.getText(), paisOrigemComboBox.getSelectedItem()+"", cidadeOrigemField.getText());
				Aeroporto aeroportoDestino = DadosAeroporto.buscar(aeroportoDestinoField.getText(), paisDestinoComboBox.getSelectedItem()+"", cidadeDestinoField.getText());
	
				if(aeroportoOrigem == null) {
					JOptionPane.showMessageDialog(null, "Aeroporto de Origem Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				else if(aeroportoDestino == null) {
					JOptionPane.showMessageDialog(null, "Aeroporto de Destino Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				else {
					Trecho trecho = new Trecho(aeroportoOrigem, aeroportoDestino, horarioOrigem, horarioDestino);
					DadosTrecho.add(trecho);
					JOptionPane.showMessageDialog(null, "Cadastrado", "Trecho Cadastrado com Sucesso", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, trecho.getId(), "O ID do trecho é: ", JOptionPane.INFORMATION_MESSAGE);
					setVisible(false);
					dispose();
				}
			}
		});
		cadastrarBotao.setBounds(207, 145, 105, 23);
		contentPane.add(cadastrarBotao);
		
		JButton cancelarBotao = new JButton("Cancelar");
		cancelarBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		cancelarBotao.setBounds(320, 145, 103, 23);
		contentPane.add(cancelarBotao);
	}
}
