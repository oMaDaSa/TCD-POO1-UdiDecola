import java.util.ArrayList;

public class Compra {
  private final Voo[] arrayVoo;
  private final Quarto[] arrayQuarto;
  private final Data[] arrayReservas;
  private final Cliente cliente;
  private final Data data;
  private final Horario hora;
  private final String metPagamento;
  private final int valorPagamento;

  public Compra(Voo[] voos, Quarto[] quartos, Data[] reservaQuarto, Cliente cliente, String metPagamento, boolean desconto) {
    arrayVoo = voos.clone();
    arrayQuarto = quartos.clone();
    arrayReservas = reservaQuarto.clone();
    this.cliente = cliente;
    this.data = Data.dataAtual();
    this.hora = Horario.horaAtual();
    if(metPagamento.length()>0)
      this.metPagamento=metPagamento;
    else this.metPagamento="Inválido";
    int i;
    double valor=0;
    for (i = 0; i < arrayVoo.length; i++) {
      arrayVoo[i].incrementaVagasOcupadas(1);
      valor+=arrayVoo[i].getPreco();
    }
    for (i = 0; i < arrayQuarto.length; i++) {
      arrayQuarto[i].reduzirQuantidade(reservaQuarto[i]);
      if(desconto)
        valor+=arrayQuarto[i].getDesconto();
      else
        valor+=arrayQuarto[i].getValorDiaria();
    }
    if(cliente instanceof ClienteVip) {
      valor*=(1-ClienteVip.getDescontoVip());
    }
    if(cliente.getCupom()>0){
      valor*=0.95;
      cliente.usaCupom();
    }
    valorPagamento=(int)(100*valor);
    if(cliente.fazerCompra(this)) {
    	DadosCliente.remover(cliente.getCPF());
    	DadosCliente.add(new ClienteVip(cliente));
    }
  }

  public Compra(ArrayList<Voo> voos, ArrayList<Quarto> quartos, ArrayList<Data> reservaQuartos, Cliente cliente, String metPagamento, boolean desconto) {
    this(voos.toArray(new Voo[0]), quartos.toArray(new Quarto[0]), reservaQuartos.toArray(new Data[0]), cliente, metPagamento, desconto);
  }

  public Compra(Voo[] voos, Cliente cliente, String metPagamento) {
    this(voos, new Quarto[0], new Data[0], cliente, metPagamento, false);
  }

  public Compra(Quarto[] quartos, Data[] reservaQuartos, Cliente cliente, String metPagamento, boolean desconto) {
    this(new Voo[0], quartos, reservaQuartos, cliente, metPagamento, desconto);
  }

  public Compra(Voo voo, Quarto quarto, Data reservaQuarto, Cliente cliente, String metPagamento, boolean desconto) {
    this(new Voo[] { voo }, new Quarto[] { quarto }, new Data[] {reservaQuarto}, cliente, metPagamento, desconto);
  }

  public Compra(Voo voo, Cliente cliente, String metPagamento) {
    this(new Voo[] { voo }, new Quarto[0], new Data[0], cliente, metPagamento, false);
  }

  public Compra(Quarto quarto, Data reservaQuarto, Cliente cliente, String metPagamento, boolean desconto) {
    this(new Voo[0], new Quarto[] { quarto }, new Data[] {reservaQuarto}, cliente, metPagamento, desconto);
  }

  public Voo[] getArrayVoo() {
    return arrayVoo;
  }

  public Quarto[] getArrayQuarto() {
    return arrayQuarto;
  }

  public Data[] getReservasQuartos() {
    return arrayReservas;
  }	

  public Cliente getCliente() {
    return cliente;
  }

  public Data getData() {
    return data;
  }

  public Horario getHora() {
    return hora;
  }

  public String getMetPagamento(){
    return metPagamento;
  }

  public float getValor(){
    return valorPagamento/100F;
  }
}
