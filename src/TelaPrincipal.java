
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaPrincipal frame = new TelaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public TelaPrincipal() throws ClassNotFoundException, IOException {
        DadosCliente.lerArq();
        Cliente.setComprasVip(3);
        ClienteVip.setDescontoVip(0.1f);
        setTitle("Tela Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 270, 263);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setForeground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton_1 = new JButton("Vôo");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PrincipalVoo v = new PrincipalVoo();
                v.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(53, 94, 150, 30);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Funcionário");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroFuncionario f = new CadastroFuncionario();
                f.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(53, 52, 150, 30);
        contentPane.add(btnNewButton_2);

        JButton btnHotel = new JButton("Hotel");
        btnHotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroHotel h = new CadastroHotel();
                h.setVisible(true);
            }
        });
        btnHotel.setBounds(53, 136, 150, 30);
        contentPane.add(btnHotel);

        JButton btnNewButton_2_1 = new JButton("Cliente");
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PrincipalCliente c = new PrincipalCliente();
                c.setVisible(true);
            }
        });
        btnNewButton_2_1.setBounds(53, 10, 150, 30);
        contentPane.add(btnNewButton_2_1);

        JButton btnPesquisa = new JButton("Pesquisa");
        btnPesquisa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaPesquisa p = new TelaPesquisa();
                p.setVisible(true);
            }
        });
        btnPesquisa.setBounds(53, 178, 150, 30);
        contentPane.add(btnPesquisa);
    }
}