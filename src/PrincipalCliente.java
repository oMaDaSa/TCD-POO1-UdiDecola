
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class PrincipalCliente extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;


  /**
   * Create the frame.
   */
  public PrincipalCliente() {
  	setTitle("Cliente");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 270, 263);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.activeCaption);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);

    JButton btnNewButton = new JButton("Cadastrar");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        CadastroCliente cadastro=new CadastroCliente();
        cadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastro.setVisible(true);
      }
    });
    btnNewButton.setBounds(53, 14, 150, 30);
    contentPane.add(btnNewButton);

    JButton btnConsultar = new JButton("Consultar");
    btnConsultar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        BuscaCliente busca=new BuscaCliente(false);
        busca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        busca.setVisible(true);
      }
    });
    btnConsultar.setBounds(52, 67, 150, 30);
    contentPane.add(btnConsultar);

    JButton btnExcluir = new JButton("Excluir");
    btnExcluir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        BuscaCliente exc=new BuscaCliente(true);
        exc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        exc.setVisible(true);
      }
    });
    btnExcluir.setBounds(51, 120, 150, 30);
    contentPane.add(btnExcluir);

    JButton btnComprar = new JButton("Compras");
    btnComprar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        CadastroCompra compra=new CadastroCompra();
        compra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        compra.setVisible(true);
      }
    });
    btnComprar.setBounds(51, 173, 150, 30);
    contentPane.add(btnComprar);
  }
}
