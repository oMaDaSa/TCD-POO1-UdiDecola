
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class BuscaCliente extends JFrame implements ActionListener {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField cpfField;
  private boolean exclui;

  /**
   * Create the frame.
   */
  public BuscaCliente(boolean exclui) {
    setTitle("Buscar");
    this.exclui = exclui;
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 235, 129);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.activeCaption);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("Insira o CPF: ");
    lblNewLabel.setBounds(10, 11, 80, 14);
    contentPane.add(lblNewLabel);

    JButton buscarBotao = new JButton("Buscar");
    buscarBotao.addActionListener(this);

    buscarBotao.setBounds(46, 44, 125, 25);
    contentPane.add(buscarBotao);

    cpfField = new JTextField();
    cpfField.setBounds(87, 8, 118, 20);
    contentPane.add(cpfField);
    cpfField.setColumns(10);
  }

  public void actionPerformed(ActionEvent e) {
    Cliente c = DadosCliente.buscar(Validador.formataCPF(cpfField.getText()));
    if (c == null) {
      JOptionPane.showMessageDialog(this, "Não foi encontrado o cliente", "Erro", JOptionPane.ERROR_MESSAGE);
      return;
    }
    if (exclui) {
        DadosCliente.remover(Validador.formataCPF(cpfField.getText()));
        JOptionPane.showMessageDialog(this, "Cliente removido com sucesso", "Remoção", JOptionPane.PLAIN_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(this, c.mostrar(), "Cliente", JOptionPane.PLAIN_MESSAGE);
    }
    setVisible(false);
    dispose();
  }

}
