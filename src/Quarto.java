import java.util.HashMap;
import java.util.Map;

public class Quarto {
  private int qtdTotal;
  private Hotel hotel;
  private double valorDiaria, desconto;
  private HashMap<Data, Integer> disponibilidade;

  public Quarto(int qtdTotal, double valorDiaria, double desconto, Hotel hotel) {
    setqtdTotal(qtdTotal);
    setValorDiaria(valorDiaria);
    setDesconto(desconto);
    setHotel(hotel);
    disponibilidade = new HashMap<Data,Integer>();
  }

  public int getqtdTotal() {
    return qtdTotal;
  }

  public void setqtdTotal(int qtdTotal) {
    if(qtdTotal>0)
      this.qtdTotal = qtdTotal;
    else
      this.qtdTotal = 0;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel){
    this.hotel=hotel;
  }

  public double getValorDiaria() {
    return valorDiaria;
  }

  public void setValorDiaria(double valorDiaria) {
    if (valorDiaria > 0)
      this.valorDiaria = valorDiaria;
    else
      this.valorDiaria = 0;
  }

  public double getDesconto() {
    return desconto;
  }

  public void setDesconto(double desconto) {
    if(desconto>0)
      this.desconto = desconto;
    else
      this.desconto = 0;
  }

  public boolean adicionaDisponibilidade(Data data, int qtd) {
    if(qtd<=qtdTotal){
      disponibilidade.put(data, qtd);
      return true;
    }
    return false;
  }
  public int checaDisponibilidade(Data data) {
    if(disponibilidade.containsKey(data)){
      int valor = disponibilidade.get(data);
        return valor;
      }
      else {
        adicionaDisponibilidade(data, qtdTotal);
      }
    return qtdTotal;
  }

  public boolean reduzirQuantidade(Data data) {
    if(checaDisponibilidade(data)>0){
      int valor = disponibilidade.get(data);
      valor--;
      disponibilidade.put(data, valor);
      return true;
    }else
      return false;
  }

}