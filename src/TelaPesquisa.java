import java.awt.EventQueue;
import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPesquisa extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;

  /**
   * Create the frame.
   */
  public TelaPesquisa() {
    setTitle("Pesquisa");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 352, 199);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.activeCaption);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);

    JComboBox paisOrigemBox = new JComboBox();
    paisOrigemBox.setModel(new DefaultComboBoxModel(new String[] { "Afeganistão", "África do Sul", "Akrotiri",
        "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita",
        "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean",
        "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize",
        "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil",
        "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá",
        "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores",
        "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul",
        "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto",
        "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos",
        "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana",
        "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia",
        "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras",
        "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook",
        "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão",
        "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean",
        "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão",
        "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia",
        "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas",
        "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México",
        "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia",
        "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia",
        "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão",
        "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal",
        "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana",
        "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia",
        "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon",
        "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa",
        "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca",
        "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia",
        "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses",
        "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia",
        "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela",
        "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
    paisOrigemBox.setSelectedIndex(34);
    paisOrigemBox.setBounds(110, 11, 109, 22);
    contentPane.add(paisOrigemBox);

    JLabel lblNewLabel = new JLabel("Pais de origem: ");
    lblNewLabel.setBounds(10, 15, 98, 14);
    contentPane.add(lblNewLabel);

    JLabel lblNewLabel_1 = new JLabel("Data de inicio: ");
    lblNewLabel_1.setBounds(10, 40, 98, 14);
    contentPane.add(lblNewLabel_1);

    JLabel lblPaisDeDestino = new JLabel("Pais de destino: ");
    lblPaisDeDestino.setBounds(10, 73, 98, 14);
    contentPane.add(lblPaisDeDestino);

    JComboBox paisDestinoBox = new JComboBox();
    paisDestinoBox.setModel(new DefaultComboBoxModel(new String[] { "Afeganistão", "África do Sul", "Akrotiri",
        "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita",
        "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean",
        "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize",
        "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil",
        "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá",
        "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores",
        "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul",
        "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto",
        "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos",
        "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana",
        "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia",
        "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras",
        "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook",
        "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão",
        "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean",
        "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão",
        "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia",
        "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas",
        "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México",
        "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia",
        "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia",
        "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão",
        "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal",
        "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana",
        "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia",
        "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon",
        "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa",
        "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca",
        "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia",
        "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses",
        "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia",
        "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela",
        "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
    paisDestinoBox.setSelectedIndex(34);
    paisDestinoBox.setBounds(110, 69, 109, 22);
    contentPane.add(paisDestinoBox);

    JComboBox diaOrigemBox = new JComboBox();
    diaOrigemBox.setModel(new DefaultComboBoxModel(
        new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    diaOrigemBox.setBounds(111, 40, 50, 22);
    contentPane.add(diaOrigemBox);

    JComboBox mesOrigemBox = new JComboBox();
    mesOrigemBox.setModel(new DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
        "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
    mesOrigemBox.setBounds(172, 40, 82, 22);
    contentPane.add(mesOrigemBox);

    JComboBox anoOrigemBox = new JComboBox();
    anoOrigemBox.setModel(new DefaultComboBoxModel(new String[] { "2024", "2025", "2026", "2027" }));
    anoOrigemBox.setBounds(264, 40, 67, 22);
    contentPane.add(anoOrigemBox);

    JLabel lblNewLabel_1_1 = new JLabel("Data de partida: ");
    lblNewLabel_1_1.setBounds(10, 102, 98, 14);
    contentPane.add(lblNewLabel_1_1);

    JComboBox diaPartidaBox = new JComboBox();
    diaPartidaBox.setModel(new DefaultComboBoxModel(
        new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    diaPartidaBox.setBounds(111, 102, 50, 22);
    contentPane.add(diaPartidaBox);

    JComboBox mesPartidaBox = new JComboBox();
    mesPartidaBox.setModel(new DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
        "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
    mesPartidaBox.setBounds(172, 102, 82, 22);
    contentPane.add(mesPartidaBox);

    JComboBox anoPartidaBox = new JComboBox();
    anoPartidaBox.setModel(new DefaultComboBoxModel(new String[] { "2024", "2025", "2026", "2027" }));
    anoPartidaBox.setBounds(264, 102, 67, 22);
    contentPane.add(anoPartidaBox);

    JButton btnNewButton = new JButton("Pesquisar");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String origem = paisOrigemBox.getSelectedItem() + "";
        String destino = paisDestinoBox.getSelectedItem() + "";
        int diaOrigem = diaOrigemBox.getSelectedIndex() + 1;
        int mesOrigem = mesOrigemBox.getSelectedIndex() + 1;
        int anoOrigem = anoOrigemBox.getSelectedIndex() + 1;
        int diaPartida = diaPartidaBox.getSelectedIndex() + 1;
        int mesPartida = mesPartidaBox.getSelectedIndex() + 1;
        int anoPartida = anoPartidaBox.getSelectedIndex() + 1;
        Data dataOrigem = new Data(diaOrigem, mesOrigem, anoOrigem);
        Data dataPartida = new Data(diaPartida, mesPartida, anoPartida);

        Pesquisa p = new Pesquisa(origem, destino, dataOrigem, dataPartida);
        DadosPesquisa.add(p);

        StringBuilder mensagem = new StringBuilder();
        mensagem.append(p.mostrarDataeHorarioPesquisa());
        JOptionPane.showMessageDialog(null, mensagem);
        setVisible(false);
        dispose();
      }
    });
    btnNewButton.setBounds(208, 135, 109, 23);
    contentPane.add(btnNewButton);
  }
}
