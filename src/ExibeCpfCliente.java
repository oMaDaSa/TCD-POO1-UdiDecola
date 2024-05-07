

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class ExibeCpfCliente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField emailField;
	private JTextField datanascimentoField;
	private JTextField enderecoField;


	/**
	 * Create the dialog.
	 */
	public ExibeCpfCliente() {
		setTitle("Exibir Cliente");
		setBounds(100, 100, 451, 236);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setBackground(SystemColor.desktop);
			lblNewLabel.setBounds(22, 18, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("CPF:");
			lblNewLabel.setBounds(22, 43, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Email:");
			lblNewLabel.setBounds(22, 68, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Data de Nascimento: ");
			lblNewLabel.setBounds(22, 94, 128, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Endereço:");
			lblNewLabel.setBounds(22, 119, 59, 14);
			contentPanel.add(lblNewLabel);
		}
		
		nomeField = new JTextField();
		nomeField.setEditable(false);
		nomeField.setBounds(64, 15, 184, 20);
		contentPanel.add(nomeField);
		nomeField.setColumns(10);
		
		cpfField = new JTextField();
		cpfField.setEditable(false);
		cpfField.setColumns(10);
		cpfField.setBounds(64, 40, 86, 20);
		contentPanel.add(cpfField);
		
		emailField = new JTextField();
		emailField.setEditable(false);
		emailField.setColumns(10);
		emailField.setBounds(64, 65, 86, 20);
		contentPanel.add(emailField);
		
		datanascimentoField = new JTextField();
		datanascimentoField.setEditable(false);
		datanascimentoField.setColumns(10);
		datanascimentoField.setBounds(142, 91, 103, 20);
		contentPanel.add(datanascimentoField);
		
		enderecoField = new JTextField();
		enderecoField.setEditable(false);
		enderecoField.setColumns(10);
		enderecoField.setBounds(89, 116, 322, 20);
		contentPanel.add(enderecoField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("VIP");
		chckbxNewCheckBox.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(22, 140, 52, 23);
		contentPanel.add(chckbxNewCheckBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.activeCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
