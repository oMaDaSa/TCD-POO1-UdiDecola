import java.io.Serializable;
import java.time.LocalDate;

public class Data implements Serializable{
int dia, mes, ano;  

  public Data(int dia, int mes, int ano) {
    if (dataValida(dia, mes, ano)) {
      this.dia=dia;
      this.mes=mes;
      this.ano=ano;
    } else {
      setDia(1);
      setMes(1);
      setAno(2000);
    }
  }

  public Data(int ano) {
    this(1, 1, ano);
  }

  public Data(Data d) {
    dia = d.getDia();
    mes = d.getMes();
    ano = d.getAno();
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    if (dataValida(dia, this.mes, this.ano))
      this.dia = dia;
    else
      this.dia = 1;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    if (mes >= 1 && mes <= 12)
      this.mes = mes;
    else
      this.mes = 1;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public static boolean dataValida(int dia, int mes, int ano) {
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
      if (dia >= 1 && dia <= 31)
        return true;
    } else if (mes == 2) {
      if (ano % 4 == 0) {
        if (dia >= 1 && dia <= 29)
          return true;
      } else {
        if (dia >= 1 && dia <= 28)
          return true;
      }
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      if (dia >= 1 && dia <= 30)
        return true;
    }
    return false;
  }

  public static Data dataAtual(){
    LocalDate data=LocalDate.now();
    return new Data(data.getDayOfMonth(), data.getMonthValue(), data.getYear());
  }

  public String imprimeData() {
    String strMes = "";
    String strDia = dia + "";
    switch (mes) {
      case 1:
        strMes = "Janeiro";
        break;
      case 2:
        strMes = "Fevereiro";
        break;
      case 3:
        strMes = "Março";
        break;
      case 4:
        strMes = "Abril";
        break;
      case 5:
        strMes = "Maio";
        break;
      case 6:
        strMes = "Junho";
        break;
      case 7:
        strMes = "Julho";
        break;
      case 8:
        strMes = "Agosto";
        break;
      case 9:
        strMes = "Setembro";
        break;
      case 10:
        strMes = "Outubro";
        break;
      case 11:
        strMes = "Novembro";
        break;
      case 12:
        strMes = "Dezembro";
        break;
    }
    if (dia < 10)
      strDia = "0" + dia;
    return strDia + " de " + strMes + " de " + ano;
  }

  public boolean maior(Data compara){
    if(ano< compara.getAno()) return true;
    else if(mes< compara.getMes()) return true;
    else if(dia< compara.getDia()) return true;
    return false;
  }
  public boolean igual(Data compara) {
    return ano==compara.getAno()&&mes==compara.getMes()&&dia==compara.getDia();
  }
}