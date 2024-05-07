import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class CadastroFuncionario extends JFrame {

  private static final long serialVersionUID = 1L;
  private JTextField nomeField;
  private JTextField cpfField;
  private JTextField nisField;
  private JTextField salarioField;
  private JTextField estadoField;
  private JTextField cidadeField;
  private JTextField cepField;
  private JTextField ruaField;
  private JTextField bairroField;
  private JTextField numeroField;

  /**
   * Create the frame.
   */
  public CadastroFuncionario() {
    setTitle("Cadastrar Funcionário");
    getContentPane().setBackground(SystemColor.activeCaption);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 408, 330);
    getContentPane().setLayout(null);
    getContentPane().setLayout(null);
    getContentPane().setLayout(null);
    getContentPane().setLayout(null);

    JLabel lblNewLabel = new JLabel("Nome: ");
    lblNewLabel.setBounds(10, 11, 49, 14);
    getContentPane().add(lblNewLabel);

    JLabel lblCpf = new JLabel("CPF: ");
    lblCpf.setBounds(10, 36, 49, 14);
    getContentPane().add(lblCpf);

    JLabel n = new JLabel("NIS: ");
    n.setBounds(221, 36, 49, 14);
    getContentPane().add(n);

    nomeField = new JTextField();
    nomeField.setBounds(62, 8, 218, 20);
    getContentPane().add(nomeField);
    nomeField.setColumns(10);

    cpfField = new JTextField();
    cpfField.setBounds(62, 36, 128, 20);
    getContentPane().add(cpfField);
    cpfField.setColumns(10);

    nisField = new JTextField();
    nisField.setColumns(10);
    nisField.setBounds(252, 33, 128, 20);
    getContentPane().add(nisField);

    JLabel lblSalario = new JLabel("Salario: ");
    lblSalario.setBounds(10, 67, 49, 14);
    getContentPane().add(lblSalario);

    salarioField = new JTextField();
    salarioField.setColumns(10);
    salarioField.setBounds(62, 67, 64, 20);
    getContentPane().add(salarioField);

    JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
    lblDataDeNascimento.setBounds(10, 102, 128, 14);
    getContentPane().add(lblDataDeNascimento);

    JComboBox diaBox = new JComboBox();
    diaBox.setModel(new DefaultComboBoxModel(
        new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    diaBox.setBounds(137, 98, 45, 22);
    getContentPane().add(diaBox);

    JComboBox mesBox = new JComboBox();
    mesBox.setModel(new DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
    mesBox.setBounds(192, 98, 72, 22);
    getContentPane().add(mesBox);

    JComboBox anoBox = new JComboBox();
    anoBox.setModel(new DefaultComboBoxModel(new String[] { "2024", "2023", "2022", "2021", "2020", "2019", "2018",
        "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004",
        "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990",
        "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976",
        "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962",
        "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948",
        "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934",
        "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920",
        "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906",
        "1905", "1904", "1903", "1902", "1901", "1900" }));
    anoBox.setBounds(274, 98, 55, 22);
    getContentPane().add(anoBox);

    JLabel lblPais = new JLabel("Pais: ");
    lblPais.setBounds(10, 134, 49, 14);
    getContentPane().add(lblPais);

    JComboBox paisBox = new JComboBox();
    paisBox.setModel(new DefaultComboBoxModel(new String[] { "Afeganistão", "África do Sul", "Akrotiri", "Albânia",
        "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean",
        "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália",
        "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas",
        "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária",
        "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão",
        "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville",
        "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica",
        "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos",
        "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé",
        "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia",
        "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala",
        "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria",
        "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos",
        "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos",
        "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque",
        "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia",
        "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia",
        "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta",
        "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique",
        "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island",
        "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã",
        "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands",
        "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia",
        "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia",
        "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu",
        "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe",
        "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura",
        "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão",
        "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão",
        "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo",
        "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda",
        "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island",
        "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
    paisBox.setSelectedIndex(34);
    paisBox.setBounds(62, 127, 108, 22);
    getContentPane().add(paisBox);

    JLabel lblEstado = new JLabel("Estado: ");
    lblEstado.setBounds(10, 159, 49, 14);
    getContentPane().add(lblEstado);

    JLabel lblCidade = new JLabel("Cidade:");
    lblCidade.setBounds(10, 184, 49, 14);
    getContentPane().add(lblCidade);

    JLabel lblCep = new JLabel("CEP: ");
    lblCep.setBounds(10, 209, 49, 14);
    getContentPane().add(lblCep);

    JLabel lblNomeDaRua = new JLabel("Nome da rua: ");
    lblNomeDaRua.setBounds(10, 238, 102, 14);
    getContentPane().add(lblNomeDaRua);

    estadoField = new JTextField();
    estadoField.setColumns(10);
    estadoField.setBounds(62, 156, 108, 20);
    getContentPane().add(estadoField);

    cidadeField = new JTextField();
    cidadeField.setColumns(10);
    cidadeField.setBounds(62, 184, 108, 20);
    getContentPane().add(cidadeField);

    cepField = new JTextField();
    cepField.setColumns(10);
    cepField.setBounds(62, 209, 108, 20);
    getContentPane().add(cepField);

    ruaField = new JTextField();
    ruaField.setColumns(10);
    ruaField.setBounds(92, 235, 108, 20);
    getContentPane().add(ruaField);

    JLabel lblBairro = new JLabel("Bairro: ");
    lblBairro.setBounds(210, 212, 45, 14);
    getContentPane().add(lblBairro);

    JLabel lblNmero = new JLabel("Número: ");
    lblNmero.setBounds(210, 238, 64, 14);
    getContentPane().add(lblNmero);

    bairroField = new JTextField();
    bairroField.setColumns(10);
    bairroField.setBounds(255, 209, 91, 20);
    getContentPane().add(bairroField);

    numeroField = new JTextField();
    numeroField.setColumns(10);
    numeroField.setBounds(265, 235, 64, 20);
    getContentPane().add(numeroField);

    JCheckBox parceiroCheckBox = new JCheckBox("Funcionário Parceiro");
    parceiroCheckBox.setBackground(SystemColor.activeCaption);
    parceiroCheckBox.setBounds(221, 63, 159, 23);
    getContentPane().add(parceiroCheckBox);

    JButton cadastrarBotao = new JButton("Cadastrar");
    cadastrarBotao.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        if(!Validador.validarCPF(cpf)) {
        	JOptionPane.showMessageDialog(null, "O CPF inserido é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
        }
        int carteiraTrabalho = Integer.parseInt(nisField.getText());
        float salario = Float.parseFloat(salarioField.getText());
        int dia = diaBox.getSelectedIndex() + 1;
        int mes = mesBox.getSelectedIndex() + 1;
        int ano = 2024 - anoBox.getSelectedIndex();
        String pais = paisBox.getSelectedItem() + "";
        String estado = estadoField.getText();
        String cidade = cidadeField.getText();
        String rua = ruaField.getText();
        String cep = cepField.getText();
        String bairro = bairroField.getText();
        int num = Integer.parseInt(numeroField.getText());
        boolean parceiro = parceiroCheckBox.isEnabled();

        Data data = new Data(dia, mes, ano);
        Endereco end = new Endereco(pais, rua, bairro, cidade, estado, cep, num);

        if (parceiro) {
          FuncionarioParceria f = new FuncionarioParceria(cpf, nome, end, data, carteiraTrabalho, salario, 0.10f);
          DadosFuncionario.add(f);
        } else {
          Funcionario f = new Funcionario(cpf, nome, end, data, carteiraTrabalho, salario);
          DadosFuncionario.add(f);
        }
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Cadastro bem-sucedido!");
        JOptionPane.showMessageDialog(null, mensagem);
        CadastroFuncionario.this.setVisible(false);
        dispose();
      }
    });
    cadastrarBotao.setBounds(178, 263, 102, 23);
    getContentPane().add(cadastrarBotao);

    JButton cancelarBotao = new JButton("Cancelar");
    cancelarBotao.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
        dispose();
      }
    });
    cancelarBotao.setBounds(291, 263, 93, 23);
    getContentPane().add(cancelarBotao);

  }
}
