import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField emailField;
    private JTextField estadoField;
    private JTextField cidadeField;
    private JTextField ruaField;
    private JTextField numField;
    private JTextField cepField;
    private JTextField bairroField;
    private JComboBox mesBox;
    private JComboBox diaBox;
    private JComboBox anoBox;
    private JButton btnNewButton;
    private JButton btnCancelar;

    /**
     * Create the frame.
     */
    public CadastroCliente() {
        setTitle("Cadastrar Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 459, 303);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setBounds(9, 11, 46, 14);
        contentPane.add(lblNewLabel);

        nomeField = new JTextField();
        nomeField.setBounds(52, 8, 229, 20);
        contentPane.add(nomeField);
        nomeField.setColumns(10);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(9, 36, 46, 14);
        contentPane.add(lblCpf);

        cpfField = new JTextField();
        cpfField.setColumns(10);
        cpfField.setBounds(52, 36, 123, 20);
        contentPane.add(cpfField);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(9, 88, 46, 14);
        contentPane.add(lblEmail);

        emailField = new JTextField();
        emailField.setColumns(10);
        emailField.setBounds(52, 85, 229, 20);
        contentPane.add(emailField);

        JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
        lblDataDeNascimento.setBounds(9, 61, 142, 14);
        contentPane.add(lblDataDeNascimento);

        JLabel lblPas = new JLabel("País:");
        lblPas.setBounds(9, 113, 46, 14);
        contentPane.add(lblPas);

        JLabel lblEstado = new JLabel("Estado: ");
        lblEstado.setBounds(9, 138, 55, 14);
        contentPane.add(lblEstado);

        estadoField = new JTextField();
        estadoField.setColumns(10);
        estadoField.setBounds(65, 135, 99, 20);
        contentPane.add(estadoField);

        JLabel lblCidade = new JLabel("Cidade: ");
        lblCidade.setBounds(9, 163, 55, 14);
        contentPane.add(lblCidade);

        cidadeField = new JTextField();
        cidadeField.setColumns(10);
        cidadeField.setBounds(65, 160, 99, 20);
        contentPane.add(cidadeField);

        JLabel lblCep = new JLabel("CEP:");
        lblCep.setBounds(9, 191, 46, 14);
        contentPane.add(lblCep);

        JLabel lblNomeDaRua = new JLabel("Nome da rua: ");
        lblNomeDaRua.setBounds(9, 216, 99, 14);
        contentPane.add(lblNomeDaRua);

        JLabel lblNumero = new JLabel("Número: ");
        lblNumero.setBounds(287, 216, 55, 14);
        contentPane.add(lblNumero);

        ruaField = new JTextField();
        ruaField.setColumns(10);
        ruaField.setBounds(92, 213, 175, 20);
        contentPane.add(ruaField);

        numField = new JTextField();
        numField.setColumns(10);
        numField.setBounds(346, 213, 33, 20);
        contentPane.add(numField);

        cepField = new JTextField();
        cepField.setColumns(10);
        cepField.setBounds(41, 188, 73, 20);
        contentPane.add(cepField);

        JLabel lblBairro = new JLabel("Bairro:");
        lblBairro.setBounds(135, 191, 40, 14);
        contentPane.add(lblBairro);

        bairroField = new JTextField();
        bairroField.setColumns(10);
        bairroField.setBounds(185, 188, 92, 20);
        contentPane.add(bairroField);

        JComboBox paisBox = new JComboBox();
        paisBox.setModel(new DefaultComboBoxModel(new String[] {"Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"}));
        paisBox.setSelectedIndex(34);
        paisBox.setBounds(52, 113, 99, 20);
        contentPane.add(paisBox);

        mesBox = new JComboBox();
        mesBox.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
        mesBox.setBounds(185, 60, 79, 17);
        contentPane.add(mesBox);

        diaBox = new JComboBox();
        diaBox.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        diaBox.setBounds(135, 60, 40, 17);
        contentPane.add(diaBox);

        anoBox = new JComboBox();
        anoBox.setModel(new DefaultComboBoxModel(new String[] {"2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"}));
        anoBox.setBounds(274, 60, 68, 17);
        contentPane.add(anoBox);

        btnNewButton = new JButton("Cadastrar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String cpf = cpfField.getText();
                if(!Validador.validarCPF(cpf)) {
                    JOptionPane.showMessageDialog(null, "O CPF inserido é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                cpf=Validador.formataCPF(cpf);
                if(DadosCliente.buscar(cpf)!=null) {
                    JOptionPane.showMessageDialog(null, "Já existe um cliente com esse CPF", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String email = emailField.getText();
                int dia = diaBox.getSelectedIndex() + 1;
                int mes = mesBox.getSelectedIndex() + 1;
                int ano = 2024 - anoBox.getSelectedIndex();
                String pais = paisBox.getSelectedItem() + "";
                String estado = estadoField.getText();
                String cidade = cidadeField.getText();
                String rua = ruaField.getText();
                String cep = cepField.getText();
                String bairro = bairroField.getText();
                int num = Integer.parseInt(numField.getText());

                Data data = new Data(dia,mes,ano);
                Endereco end = new Endereco(pais, rua, bairro, cidade, estado, cep, num);
                String d = data.imprimeData();
                Cliente c = new Cliente(cpf, nome, end, data, email);
                String endereco = end.imprimeEndereco();

                AcessaBanco a = new AcessaBanco();
                a.inserirBanco(String.format("insert into cliente values (\'%s\',\'%s\',\'%s\',\'%s\',\'%s\')", nome, cpf, d, email, endereco));


                DadosCliente.add(c);
                StringBuilder mensagem = new StringBuilder();
                mensagem.append("Cadastro bem-sucedido!");
                JOptionPane.showMessageDialog(null, mensagem);
                setVisible(false);
                dispose();
            }
        });
        btnNewButton.setBounds(201, 241, 113, 23);
        contentPane.add(btnNewButton);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
        btnCancelar.setBounds(324, 241, 89, 23);
        contentPane.add(btnCancelar);
    }
}
