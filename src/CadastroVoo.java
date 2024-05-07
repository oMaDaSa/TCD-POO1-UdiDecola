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

public class CadastroVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField trechoField;
	private JTextField precoField;
	private JTextField vagasField;
	private JLabel lblDataDeDecolagem;
	private JComboBox diaField;
	private JComboBox mesField;
	private JComboBox anoField;


	/**
	 * Create the frame.
	 */
	public CadastroVoo() {
		setTitle("Cadastrar Vôo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 193);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAeroporto = new JLabel("Trecho:");
		lblAeroporto.setBounds(10, 14, 66, 14);
		contentPane.add(lblAeroporto);
		
		trechoField = new JTextField();
		trechoField.setColumns(10);
		trechoField.setBounds(53, 11, 77, 20);
		contentPane.add(trechoField);
		
		JLabel lblEstado_1 = new JLabel("Preço: ");
		lblEstado_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblEstado_1);
		
		precoField = new JTextField();
		precoField.setColumns(10);
		precoField.setBounds(53, 64, 99, 20);
		contentPane.add(precoField);
		
		JLabel lblCidade = new JLabel("Vagas Totais:");
		lblCidade.setBounds(10, 92, 90, 14);
		contentPane.add(lblCidade);
		
		vagasField = new JTextField();
		vagasField.setColumns(10);
		vagasField.setBounds(96, 89, 99, 20);
		contentPane.add(vagasField);
		
		lblDataDeDecolagem = new JLabel("Data de decolagem:");
		lblDataDeDecolagem.setBounds(10, 40, 120, 14);
		contentPane.add(lblDataDeDecolagem);
		
		diaField = new JComboBox();
		diaField.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		diaField.setBounds(132, 39, 40, 17);
		contentPane.add(diaField);
		
		mesField = new JComboBox();
		mesField.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		mesField.setBounds(182, 39, 79, 17);
		contentPane.add(mesField);
		
		anoField = new JComboBox();
		anoField.setModel(new DefaultComboBoxModel(new String[] {"2024", "2025", "2026", "2027"}));
		anoField.setBounds(271, 39, 68, 17);
		contentPane.add(anoField);
		
		JButton cadastrarBotao = new JButton("Cadastrar");
		cadastrarBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Data data = new Data(diaField.getSelectedIndex()+1, mesField.getSelectedIndex()+1, anoField.getSelectedIndex()+2024);
				Trecho trecho = DadosTrecho.buscar(trechoField.getText());
				if(trecho == null) {
					JOptionPane.showMessageDialog(null, "Trecho Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				Voo voo = new Voo(data, trecho, Integer.parseInt(precoField.getText()), Integer.parseInt(vagasField.getText()));
				if(voo.getPreco() <= 0) {
					JOptionPane.showMessageDialog(null, "Preço Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				}else if(voo.getVagasTotais() <= 0) {
					JOptionPane.showMessageDialog(null, "Quantidade de vagas Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
				}else {
					DadosVoo.add(voo);
					JOptionPane.showMessageDialog(null, "Voo cadastrado", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
					Voo teste = DadosVoo.buscar(voo.getTrecho().getId(), voo.getDataDecolagem());
					System.out.printf("ID - %s\nData - %d/%d/%d\n", teste.getTrecho().getId(), teste.getDataDecolagem().getDia(), teste.getDataDecolagem().getMes(), teste.getDataDecolagem().getAno());
					setVisible(false);
                    dispose();
					return;
				}
			}
		});
		cadastrarBotao.setBounds(150, 123, 99, 23);
		contentPane.add(cadastrarBotao);
		
		JButton cancelarBotao = new JButton("Cancelar");
		cancelarBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		cancelarBotao.setBounds(259, 123, 89, 23);
		contentPane.add(cancelarBotao);
	}
}
