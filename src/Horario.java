import java.time.LocalTime;

public class Horario {
  int horas, min, seg;

  public Horario(int horas, int min, int seg) {
    setHoras(horas);
    setMin(min);
    setSeg(seg);
  }

  public Horario(Horario a) {
    horas = a.getHoras();
    min = a.getMin();
    seg = a.getSeg();
  }

  public Horario(int horas, int min) {
    this(horas, min, 0);
  }

  public Horario(int horas) {
    this(horas, 0, 0);
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    if (horas >= 0 && horas <= 23)
      this.horas = horas;
    else
      this.horas = 0;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    if (min >= 0 && min <= 59)
      this.min = min;
    else
      this.min = 0;
  }

  public int getSeg() {
    return seg;
  }

  public void setSeg(int seg) {
    if (seg >= 0 && seg <= 59)
      this.seg = seg;
    else
      this.seg = 0;
  }

  public static Horario horaAtual() {
    LocalTime hora = LocalTime.now();
    return new Horario(hora.getHour(), hora.getMinute(), hora.getSecond());
  }

  public String imprimeHoras() {
    String strHoras, strMinutos, strSeg;
    if (horas < 10)
      strHoras = "0" + horas;
    else
      strHoras = horas + "";
    if (min < 10)
      strMinutos = "0" + min;
    else
      strMinutos = min + "";
    if (seg < 10)
      strSeg = "0" + seg;
    else
      strSeg = seg + "";

    return strHoras + ":" + strMinutos + ":" + strSeg;
  }

  public boolean igual(Horario a) {
    return horas == a.getHoras() && min == a.getMin() && seg == a.getSeg();
  }
}