import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class CadastroCompra extends JDialog {

  private static final long serialVersionUID = 1L;
  private final JPanel contentPanel = new JPanel();
  private JTextField idTrecho;
  private JTextField cnpjHotel;
  private JTextField cpfCliente;
  private JTextField pagamento;
  private JComboBox<String> diaDec, mesDec, anoDec, diaRes, mesRes, anoRes, tipo;
  private JButton addVoo, addQuar, OK, Cancel;
  private JCheckBox desconto;
  private ArrayList<Voo> voos;
  private ArrayList<Quarto> quartos;
  private ArrayList<Data> reservas;
  /**
   * Create the dialog.
   */
  public CadastroCompra() {
    voos=new ArrayList<Voo>();
    quartos=new ArrayList<Quarto>();
    reservas=new ArrayList<Data>();
    setBounds(100, 100, 450, 279);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBackground(SystemColor.activeCaption);
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    TrataBotoes tratador = new TrataBotoes();

    JLabel lblNewLabel = new JLabel("ID Trecho");
    lblNewLabel.setBounds(10, 36, 59, 13);
    contentPanel.add(lblNewLabel);

    idTrecho = new JTextField();
    idTrecho.setBounds(68, 33, 96, 19);
    contentPanel.add(idTrecho);
    idTrecho.setColumns(10);

    mesDec = new JComboBox<String>();
    mesDec.setModel(new DefaultComboBoxModel<String>(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
    mesDec.setBounds(172, 5, 77, 21);
    contentPanel.add(mesDec);

    diaDec = new JComboBox<String>();
    diaDec.setModel(new DefaultComboBoxModel<String>(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
    diaDec.setBounds(121, 5, 43, 21);
    contentPanel.add(diaDec);

    anoDec = new JComboBox<String>();
    anoDec.setModel(new DefaultComboBoxModel<String>(new String[] {"2024", "2025", "2026", "2027"}));
    anoDec.setBounds(255, 5, 59, 21);
    contentPanel.add(anoDec);

    JLabel lblNewLabel_1 = new JLabel("Data de decolagem");
    lblNewLabel_1.setBounds(10, 9, 140, 13);
    contentPanel.add(lblNewLabel_1);

    addVoo = new JButton("Adicionar voo");
    addVoo.addActionListener(tratador);
    addVoo.setBounds(255, 32, 120, 21);
    contentPanel.add(addVoo);

    JLabel lblCnpjHotel = new JLabel("CNPJ hotel");
    lblCnpjHotel.setBounds(10, 63, 70, 13);
    contentPanel.add(lblCnpjHotel);

    cnpjHotel = new JTextField();
    cnpjHotel.setColumns(10);
    cnpjHotel.setBounds(85, 60, 96, 19);
    contentPanel.add(cnpjHotel);

    JLabel lblNewLabel_1_1 = new JLabel("Data da reserva");
    lblNewLabel_1_1.setBounds(10, 90, 105, 13);
    contentPanel.add(lblNewLabel_1_1);

    mesRes = new JComboBox<String>();
    mesRes.setModel(new DefaultComboBoxModel<String>(new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
    mesRes.setBounds(151, 86, 77, 21);
    contentPanel.add(mesRes);

    diaRes = new JComboBox<String>();
    diaRes.setModel(new DefaultComboBoxModel<String>(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
    diaRes.setBounds(100, 86, 43, 21);
    contentPanel.add(diaRes);

    anoRes = new JComboBox<String>();
    anoRes.setModel(new DefaultComboBoxModel<String>(new String[] {"2024", "2025", "2026", "2027"}));
    anoRes.setBounds(234, 86, 59, 21);
    contentPanel.add(anoRes);

    JLabel lblNewLabel_2_1 = new JLabel("Tipo do quarto");
    lblNewLabel_2_1.setBounds(14, 117, 120, 13);
    contentPanel.add(lblNewLabel_2_1);

    tipo = new JComboBox<String>();
    tipo.setModel(new DefaultComboBoxModel<String>(new String[] {"Single", "Duplo", "Triplo", "Luxo"}));
    tipo.setBounds(100, 113, 80, 21);
    contentPanel.add(tipo);

    addQuar = new JButton("Adicionar quarto");
    addQuar.addActionListener(tratador);
    addQuar.setBounds(195, 113, 140, 21);
    contentPanel.add(addQuar);

    JLabel lblNewLabel_3 = new JLabel("CPF cliente");
    lblNewLabel_3.setBounds(10, 140, 80, 13);
    contentPanel.add(lblNewLabel_3);

    cpfCliente = new JTextField();
    cpfCliente.setBounds(85, 137, 96, 19);
    contentPanel.add(cpfCliente);
    cpfCliente.setColumns(10);

    JLabel lblNewLabel_4 = new JLabel("Método de pagamento");
    lblNewLabel_4.setBounds(10, 163, 130, 13);
    contentPanel.add(lblNewLabel_4);

    pagamento = new JTextField();
    pagamento.setBounds(140, 160, 96, 19);
    contentPanel.add(pagamento);
    pagamento.setColumns(10);

    desconto = new JCheckBox("Desconto nos quartos");
    desconto.setBackground(SystemColor.activeCaption);
    desconto.setBounds(10, 182, 170, 21);
    contentPanel.add(desconto);
    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      buttonPane.setBackground(SystemColor.activeCaption);
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        OK = new JButton("OK");
        OK.addActionListener(tratador);
        OK.setActionCommand("OK");
        buttonPane.add(OK);
        getRootPane().setDefaultButton(OK);
      }
      {
        Cancel = new JButton("Cancel");
        Cancel.addActionListener(tratador);
        Cancel.setActionCommand("Cancel");
        buttonPane.add(Cancel);
      }
    }
  }
  private class TrataBotoes implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
      Object a=e.getSource();
      if(a==addVoo) {
        Voo v=DadosVoo.buscar(idTrecho.getText(), new Data(Integer.parseInt((String)diaDec.getSelectedItem()), 1+mesDec.getSelectedIndex(), Integer.parseInt((String)anoDec.getSelectedItem())));
        if(v!=null) {
          voos.add(v);
          JOptionPane.showMessageDialog(null, "Voo adicionado!");
        }
        else
            JOptionPane.showMessageDialog(null, "O vôo não foi encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
      } else if (a==addQuar) {
        int dia=1+diaRes.getSelectedIndex(), mes=1+mesRes.getSelectedIndex(), ano=Integer.parseInt((String)anoRes.getSelectedItem());
        if(Data.dataValida(dia, mes, ano)) {
          Quarto q=DadosHoteis.buscarQuarto(Validador.formataCNPJ(cnpjHotel.getText()), tipo.getSelectedIndex());
          if(q!=null) {
            quartos.add(q);
            reservas.add(new Data(dia, mes, ano));
            JOptionPane.showMessageDialog(null, "Quarto adicionado!");
          } else {
              JOptionPane.showMessageDialog(null, "O quarto não foi encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
          }
        }
      }else if(a==OK) {
        if(voos.size()>0||quartos.size()>0) {
            if(DadosCliente.buscar(Validador.formataCPF(cpfCliente.getText()))!=null) {        		
                DadosCompra.add(new Compra(voos, quartos, reservas, DadosCliente.buscar(Validador.formataCPF(cpfCliente.getText())), pagamento.getText(), desconto.isSelected()));
                JOptionPane.showMessageDialog(null, "Compra registrada!");
                contentPanel.setVisible(false);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "O cliente com esse cpf não foi encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nada foi inserido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
      }else {
        contentPanel.setVisible(false);
        dispose();
      }

    }
  }
}
