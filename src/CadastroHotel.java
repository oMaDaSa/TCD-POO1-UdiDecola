import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeOficialField;
	private JTextField cnpjField;
	private JTextField estadoField;
	private JTextField cidadeField;
	private JTextField ruaField;
	private JTextField numeroField;
	private JTextField cepField;
	private JTextField bairroField;
	private JTextField singleField;
	private JTextField doubleField;
	private JTextField tripleField;
	private JTextField luxoField;
	private JTextField nomeDivulgacaoField;
	private JTextField descontosingleField;
	private JTextField descontodoubleField;
	private JTextField descontotripleField;
	private JTextField descontoluxoField;
	private JTextField cpfField;
	private JTextField valorsingleField;
	private JTextField valordoubleField;
	private JTextField valortripleField;
	private JTextField valorluxoField;

	/**
	 * Create the frame.
	 */
	public CadastroHotel() {
		setTitle("Cadastrar Hotel");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeOficialLabel = new JLabel("Nome:");
		nomeOficialLabel.setBounds(10, 11, 48, 14);
		contentPane.add(nomeOficialLabel);
		
		nomeOficialField = new JTextField();
		nomeOficialField.setBounds(60, 8, 148, 20);
		contentPane.add(nomeOficialField);
		nomeOficialField.setColumns(10);
		
		JLabel cnpjLabel = new JLabel("CNPJ: ");
		cnpjLabel.setBounds(10, 42, 56, 14);
		contentPane.add(cnpjLabel);
		
		cnpjField = new JTextField();
		cnpjField.setColumns(10);
		cnpjField.setBounds(60, 36, 148, 20);
		contentPane.add(cnpjField);
		
		JLabel lblNmeroDeEstrelas = new JLabel("Número de estrelas: ");
		lblNmeroDeEstrelas.setBounds(10, 108, 132, 14);
		contentPane.add(lblNmeroDeEstrelas);
		
		JComboBox estrelaBox = new JComboBox();
		estrelaBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		estrelaBox.setBounds(140, 104, 38, 22);
		contentPane.add(estrelaBox);
		
		JCheckBox petsCheckBox = new JCheckBox("Aceita Pets");
		petsCheckBox.setBounds(207, 74, 138, 23);
		contentPane.add(petsCheckBox);
		
		JCheckBox cancelamentoCheckBox = new JCheckBox("Aceita Cancelamento");
		cancelamentoCheckBox.setBounds(10, 74, 168, 23);
		contentPane.add(cancelamentoCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("Mensagem de divulgação:");
		lblNewLabel_1.setBounds(10, 133, 158, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descrição: ");
		lblNewLabel_1_1.setBounds(10, 179, 144, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JTextPane descricaoTextPane = new JTextPane();
		descricaoTextPane.setBounds(79, 179, 447, 69);
		contentPane.add(descricaoTextPane);
		
		JTextPane divulgacaoTextPane = new JTextPane();
		divulgacaoTextPane.setBounds(172, 133, 354, 35);
		contentPane.add(divulgacaoTextPane);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Horario de check-in:");
		lblNewLabel_1_1_1.setBounds(10, 263, 132, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox checkinBox = new JComboBox();
		checkinBox.setModel(new DefaultComboBoxModel(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30"}));
		checkinBox.setSelectedIndex(24);
		checkinBox.setBounds(138, 258, 62, 25);
		contentPane.add(checkinBox);
		
		JComboBox checkoutBox = new JComboBox();
		checkoutBox.setModel(new DefaultComboBoxModel(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30"}));
		checkoutBox.setSelectedIndex(24);
		checkoutBox.setBounds(346, 259, 62, 25);
		contentPane.add(checkoutBox);
		
		JLabel lblPas = new JLabel("País: ");
		lblPas.setBounds(10, 284, 38, 14);
		contentPane.add(lblPas);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(10, 309, 61, 14);
		contentPane.add(lblEstado);
		
		JLabel lblPas_1 = new JLabel("Cidade: ");
		lblPas_1.setBounds(302, 309, 61, 14);
		contentPane.add(lblPas_1);
		
		JComboBox paisBox = new JComboBox();
		paisBox.setModel(new DefaultComboBoxModel(new String[] {"Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"}));
		paisBox.setSelectedIndex(34);
		paisBox.setBounds(45, 280, 81, 22);
		contentPane.add(paisBox);
		
		JLabel lblDataDeCriao = new JLabel("Data de criação:");
		lblDataDeCriao.setBounds(198, 108, 98, 14);
		contentPane.add(lblDataDeCriao);
		
		JComboBox diaBox = new JComboBox();
		diaBox.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		diaBox.setBounds(302, 104, 38, 22);
		contentPane.add(diaBox);
		
		JComboBox mesBox = new JComboBox();
		mesBox.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		mesBox.setBounds(346, 104, 81, 22);
		contentPane.add(mesBox);
		
		JComboBox anoBox = new JComboBox();
		anoBox.setModel(new DefaultComboBoxModel(new String[] {"2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"}));
		anoBox.setBounds(437, 104, 61, 22);
		contentPane.add(anoBox);
		
		estadoField = new JTextField();
		estadoField.setColumns(10);
		estadoField.setBounds(61, 306, 105, 20);
		contentPane.add(estadoField);
		
		cidadeField = new JTextField();
		cidadeField.setColumns(10);
		cidadeField.setBounds(360, 306, 88, 20);
		contentPane.add(cidadeField);
		
		JLabel lblNomeDaRua = new JLabel("Nome da rua: ");
		lblNomeDaRua.setBounds(10, 334, 88, 14);
		contentPane.add(lblNomeDaRua);
		
		ruaField = new JTextField();
		ruaField.setColumns(10);
		ruaField.setBounds(94, 334, 192, 20);
		contentPane.add(ruaField);
		
		JLabel lblNmero = new JLabel("Número: ");
		lblNmero.setBounds(302, 337, 56, 14);
		contentPane.add(lblNmero);
		
		numeroField = new JTextField();
		numeroField.setColumns(10);
		numeroField.setBounds(360, 334, 48, 20);
		contentPane.add(numeroField);
		
		JLabel lblCep = new JLabel("CEP: ");
		lblCep.setBounds(10, 362, 38, 14);
		contentPane.add(lblCep);
		
		cepField = new JTextField();
		cepField.setColumns(10);
		cepField.setBounds(60, 359, 105, 20);
		contentPane.add(cepField);
		
		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setBounds(302, 362, 69, 14);
		contentPane.add(lblBairro);
		
		bairroField = new JTextField();
		bairroField.setColumns(10);
		bairroField.setBounds(360, 359, 88, 20);
		contentPane.add(bairroField);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Horario de check-out:");
		lblNewLabel_1_1_1_1.setBounds(213, 263, 132, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qtd. de quartos single: ");
		lblNewLabel_2.setBounds(10, 387, 190, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Qtd. de quartos double: ");
		lblNewLabel_2_1.setBounds(10, 412, 190, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Qtd. de quartos triple: ");
		lblNewLabel_2_2.setBounds(10, 437, 190, 14);
		contentPane.add(lblNewLabel_2_2);
		
		singleField = new JTextField();
		singleField.setColumns(10);
		singleField.setBounds(164, 384, 48, 20);
		contentPane.add(singleField);
		
		doubleField = new JTextField();
		doubleField.setColumns(10);
		doubleField.setBounds(164, 412, 48, 20);
		contentPane.add(doubleField);
		
		tripleField = new JTextField();
		tripleField.setColumns(10);
		tripleField.setBounds(164, 434, 48, 20);
		contentPane.add(tripleField);
		
		JLabel lblNewLabel_2_3 = new JLabel("Valor da diária: ");
		lblNewLabel_2_3.setBounds(222, 390, 98, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Valor da diária: ");
		lblNewLabel_2_3_1.setBounds(222, 412, 98, 14);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Valor da diária: ");
		lblNewLabel_2_3_2.setBounds(222, 437, 98, 14);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Qtd. de quartos de luxo: ");
		lblNewLabel_2_2_1.setBounds(10, 462, 190, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		luxoField = new JTextField();
		luxoField.setColumns(10);
		luxoField.setBounds(164, 459, 48, 20);
		contentPane.add(luxoField);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Valor da diária: ");
		lblNewLabel_2_3_2_1.setBounds(222, 462, 98, 14);
		contentPane.add(lblNewLabel_2_3_2_1);
		
		JLabel nomeDivulgacao = new JLabel("Nome divulgação: ");
		nomeDivulgacao.setBounds(218, 11, 115, 14);
		contentPane.add(nomeDivulgacao);
		
		nomeDivulgacaoField = new JTextField();
		nomeDivulgacaoField.setColumns(10);
		nomeDivulgacaoField.setBounds(338, 8, 188, 20);
		contentPane.add(nomeDivulgacaoField);
		
		JLabel lblNewLabel_2_3_2_2 = new JLabel("Valor com desconto: ");
		lblNewLabel_2_3_2_2.setBounds(360, 387, 138, 14);
		contentPane.add(lblNewLabel_2_3_2_2);
		
		descontosingleField = new JTextField();
		descontosingleField.setToolTipText("");
		descontosingleField.setColumns(10);
		descontosingleField.setBounds(486, 384, 40, 20);
		contentPane.add(descontosingleField);
		
		JLabel lblNewLabel_2_3_2_2_1 = new JLabel("Valor com desconto: ");
		lblNewLabel_2_3_2_2_1.setBounds(360, 409, 138, 14);
		contentPane.add(lblNewLabel_2_3_2_2_1);
		
		descontodoubleField = new JTextField();
		descontodoubleField.setToolTipText("");
		descontodoubleField.setColumns(10);
		descontodoubleField.setBounds(486, 409, 40, 20);
		contentPane.add(descontodoubleField);
		
		JLabel lblNewLabel_2_3_2_2_1_1 = new JLabel("Valor com desconto: ");
		lblNewLabel_2_3_2_2_1_1.setBounds(360, 440, 138, 14);
		contentPane.add(lblNewLabel_2_3_2_2_1_1);
		
		descontotripleField = new JTextField();
		descontotripleField.setToolTipText("");
		descontotripleField.setColumns(10);
		descontotripleField.setBounds(486, 434, 40, 20);
		contentPane.add(descontotripleField);
		
		JLabel lblNewLabel_2_3_2_2_1_2 = new JLabel("Valor com desconto: ");
		lblNewLabel_2_3_2_2_1_2.setBounds(360, 465, 138, 14);
		contentPane.add(lblNewLabel_2_3_2_2_1_2);
		
		descontoluxoField = new JTextField();
		descontoluxoField.setToolTipText("");
		descontoluxoField.setColumns(10);
		descontoluxoField.setBounds(486, 462, 40, 20);
		contentPane.add(descontoluxoField);
		
		JLabel lblNewLabel = new JLabel("CPF do funcionário: ");
		lblNewLabel.setBounds(218, 42, 127, 14);
		contentPane.add(lblNewLabel);
		
		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(338, 39, 125, 20);
		contentPane.add(cpfField);
		
		valorsingleField = new JTextField();
		valorsingleField.setToolTipText("");
		valorsingleField.setColumns(10);
		valorsingleField.setBounds(313, 387, 40, 20);
		contentPane.add(valorsingleField);
		
		valordoubleField = new JTextField();
		valordoubleField.setToolTipText("");
		valordoubleField.setColumns(10);
		valordoubleField.setBounds(313, 412, 40, 20);
		contentPane.add(valordoubleField);
		
		valortripleField = new JTextField();
		valortripleField.setToolTipText("");
		valortripleField.setColumns(10);
		valortripleField.setBounds(313, 437, 40, 20);
		contentPane.add(valortripleField);
		
		valorluxoField = new JTextField();
		valorluxoField.setToolTipText("");
		valorluxoField.setColumns(10);
		valorluxoField.setBounds(313, 465, 40, 20);
		contentPane.add(valorluxoField);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeOficial = nomeOficialField.getText();
				String cnpj = cnpjField.getText();
				if(!Validador.validarCNPJ(cnpj)) {
					JOptionPane.showMessageDialog(null, "O CNPJ inserido é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String cpf = cpfField.getText();
				if(!Validador.validarCPF(cpf)) {
					JOptionPane.showMessageDialog(null, "O CPF inserido é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				FuncionarioParceria f = (FuncionarioParceria) DadosFuncionario.buscar(Validador.formataCPF(cpf));
				if(f==null) {
					JOptionPane.showMessageDialog(null, "Não foi encontrado funcionário com esse CPF", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String nomeDivulgacao = nomeDivulgacaoField.getText();
				String msgDivulgacao = divulgacaoTextPane.getText();
				String descricao = descricaoTextPane.getText();
				String pais = paisBox.getSelectedItem() + "";
				String estado = estadoField.getText();
				String cidade = cidadeField.getText();
				String rua = ruaField.getText();
				String cep = cepField.getText();
				String bairro = bairroField.getText();
				int num = Integer.parseInt(numeroField.getText());
				int quartoSingle = Integer.parseInt(singleField.getText());
				double valorquartoSingle = Double.parseDouble(valorsingleField.getText());
				int quartoDouble = Integer.parseInt(doubleField.getText());
				double valorquartoDouble = Double.parseDouble(valordoubleField.getText());
				int quartoTriple = Integer.parseInt(tripleField.getText());
				double valorquartoTriple = Double.parseDouble(valortripleField.getText());
				int quartoLuxo = Integer.parseInt(luxoField.getText());
				double valorquartoLuxo = Integer.parseInt(valorluxoField.getText());
				double descontoSingle = Double.parseDouble(descontosingleField.getText());
				double descontoDouble = Double.parseDouble(descontodoubleField.getText());
				double descontoTriple = Double.parseDouble(descontotripleField.getText());
				double descontoLuxo = Double.parseDouble(descontoluxoField.getText());
				int horacheckIn = checkinBox.getSelectedIndex() / 2;
				int mincheckIn = checkinBox.getSelectedIndex()%2==0?0:30;
				int horacheckOut = checkinBox.getSelectedIndex() / 2;
				int mincheckOut = checkinBox.getSelectedIndex()%2==0?0:30;
				int dia = diaBox.getSelectedIndex() + 1;
				int mes = mesBox.getSelectedIndex() + 1;
				int ano = 2024 - anoBox.getSelectedIndex();;
				int numEstrelas = estrelaBox.getSelectedIndex() + 1;
				boolean cancelamento = cancelamentoCheckBox.isEnabled();
				boolean pets = petsCheckBox.isEnabled();
				
				Data data = new Data(dia,mes,ano);
				
				Horario checkIn = new Horario(horacheckIn, mincheckIn);
				Horario checkOut = new Horario(horacheckOut, mincheckOut);
				
				Endereco end = new Endereco(pais, rua, bairro, cidade, estado, cep, num);
				
				Hotel h = new Hotel(cnpj, nomeOficial, nomeDivulgacao, data, numEstrelas, cancelamento, pets,
						msgDivulgacao, descricao, checkIn, checkOut, end, quartoSingle, valorquartoSingle, descontoSingle,
						quartoDouble, valorquartoDouble, descontoDouble, quartoTriple, valorquartoTriple, descontoTriple,
						quartoLuxo, valorquartoLuxo, descontoLuxo, f);
				
				DadosHoteis.add(h);
				StringBuilder mensagem = new StringBuilder();
                mensagem.append("Cadastro bem-sucedido!");
                JOptionPane.showMessageDialog(null, mensagem);
                setVisible(false);
                dispose();
			}
		});
		btnNewButton.setBounds(197, 487, 99, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnCancelar.setBounds(308, 487, 89, 23);
		contentPane.add(btnCancelar);
	}
}
