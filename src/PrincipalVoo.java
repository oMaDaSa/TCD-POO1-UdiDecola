import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PrincipalVoo() {
		setTitle("Vôo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 270, 263);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Vôo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroVoo v = new CadastroVoo();
				v.setVisible(true);
			}
		});
		btnNewButton.setBounds(45, 26, 173, 44);
		contentPane.add(btnNewButton);
		
		JButton btnTrecho = new JButton("Trecho");
		btnTrecho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroTrechos t = new CadastroTrechos();
				t.setVisible(true);
			}
		});
		btnTrecho.setBounds(45, 86, 173, 46);
		contentPane.add(btnTrecho);
		
		JButton btnAeroporto = new JButton("Aeroporto");
		btnAeroporto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAeroporto a = new CadastroAeroporto();
				a.setVisible(true);
			}
		});
		btnAeroporto.setBounds(45, 146, 170, 47);
		contentPane.add(btnAeroporto);
	}

}
