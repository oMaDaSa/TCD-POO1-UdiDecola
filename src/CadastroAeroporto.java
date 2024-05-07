
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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroAeroporto extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField aeroportoField;
    private JTextField estadoField;
    private JTextField cidadeField;
    private JTextField cepField;
    private JTextField ruaField;
    private JTextField bairroField;
    private JTextField numeroField;


    /**
     * Create the frame.
     */
    public CadastroAeroporto() {
        setTitle("Cadastrar Aeroporto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 369, 240); 
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblAeroporto = new JLabel("Aeroporto:");
        lblAeroporto.setBounds(10, 14, 66, 14);
        contentPane.add(lblAeroporto);

        aeroportoField = new JTextField();
        aeroportoField.setColumns(10);
        aeroportoField.setBounds(86, 11, 196, 20);
        contentPane.add(aeroportoField);


        JLabel lblPas = new JLabel("País: ");
        lblPas.setBounds(10, 39, 49, 14);
        contentPane.add(lblPas);

        JLabel lblEstado = new JLabel("Estado: ");
        lblEstado.setBounds(10, 64, 49, 14);
        contentPane.add(lblEstado);

        JLabel lblCidade = new JLabel("Cidade: ");
        lblCidade.setBounds(10, 89, 49, 14);
        contentPane.add(lblCidade);

        JLabel lblCep = new JLabel("CEP: ");
        lblCep.setBounds(10, 114, 49, 14);
        contentPane.add(lblCep);

        JLabel lblNomeDaRua = new JLabel("Rua:");
        lblNomeDaRua.setBounds(10, 139, 49, 14);
        contentPane.add(lblNomeDaRua);

        JLabel lblBairro = new JLabel("Bairro: ");
        lblBairro.setBounds(202, 114, 49, 14);
        contentPane.add(lblBairro);

        JLabel lblNmero = new JLabel("Número: ");
        lblNmero.setBounds(212, 139, 66, 14);
        contentPane.add(lblNmero);

        estadoField = new JTextField();
        estadoField.setColumns(10);
        estadoField.setBounds(69, 61, 133, 20);
        contentPane.add(estadoField);

        cidadeField = new JTextField();
        cidadeField.setColumns(10);
        cidadeField.setBounds(69, 86, 134, 20);
        contentPane.add(cidadeField);

        cepField = new JTextField();
        cepField.setColumns(10);
        cepField.setBounds(69, 111, 89, 20);
        contentPane.add(cepField);

        ruaField = new JTextField();
        ruaField.setColumns(10);
        ruaField.setBounds(69, 139, 133, 20);
        contentPane.add(ruaField);

        bairroField = new JTextField();
        bairroField.setColumns(10);
        bairroField.setBounds(244, 111, 82, 20);
        contentPane.add(bairroField);

        numeroField = new JTextField();
        numeroField.setColumns(10);
        numeroField.setBounds(275, 139, 40, 20);
        contentPane.add(numeroField);

        JComboBox paisBox = new JComboBox();
        paisBox.setModel(new DefaultComboBoxModel(new String[] {"Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"}));
        paisBox.setSelectedIndex(34);
        paisBox.setBounds(70, 35, 100, 22);
        contentPane.add(paisBox);

        JButton cadastrarBotao = new JButton("Cadastrar");
        cadastrarBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {				
                Aeroporto aeroporto = new Aeroporto(aeroportoField.getText(), paisBox.getSelectedItem() + "", ruaField.getText(), bairroField.getText(), cidadeField.getText(), estadoField.getText(), cepField.getText(), Integer.parseInt(numeroField.getText()));
                if(aeroporto.getNome() == "Inválido") {
                    JOptionPane.showMessageDialog(null, "Nome Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                }else if(aeroporto.getCidade() == "Inválido") {
                    JOptionPane.showMessageDialog(null, "Cidade Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                }else if(aeroporto.getEstado() == "Inválido") {
                    JOptionPane.showMessageDialog(null, "Estado Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                }else if(aeroporto.getRua() == "Inválido") {
                    JOptionPane.showMessageDialog(null, "Rua Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                }else if(aeroporto.getCep() == "Inválido") {
                    JOptionPane.showMessageDialog(null, "CEP Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                }else if(aeroporto.getBairro() == "Inválido") {
                    JOptionPane.showMessageDialog(null, "Bairro Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                }else if(aeroporto.getNum()+"" == ""){
                    JOptionPane.showMessageDialog(null, "Número Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                }else {
                    DadosAeroporto.add(aeroporto);
                    JOptionPane.showMessageDialog(null, "Aeroporto Cadastrado com Sucesso", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    dispose();
                }
            }
        });
        cadastrarBotao.setBounds(136, 170, 100, 23);
        contentPane.add(cadastrarBotao);

        JButton cancelarBotao = new JButton("Cancelar");
        cancelarBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
        cancelarBotao.setBounds(246, 170, 89, 23);
        contentPane.add(cancelarBotao);

    }

}
