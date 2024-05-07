import java.util.ArrayList;

public class Trecho{
  private Aeroporto localOrigem, localDestino;
  private Horario horaSaida, horaChegada;
  private String id;
  private ArrayList<Voo> voosEfetuados;

  public Trecho(Aeroporto localOrigem, Aeroporto localDestino, Horario horaSaida, Horario horaChegada){
    setLocalOrigem(localOrigem);
    setLocalDestino(localDestino);
    setHoraSaida(horaSaida);
    setHoraChegada(horaChegada);
    setId();
    setVoosEfetuados();
  }

  public void incrementaVoosEfetuados(Voo voo){
    this.voosEfetuados.add(voo);
  }

  public Endereco getLocalOrigem() {
    return localOrigem;
  }

  public void setLocalOrigem(Aeroporto localOrigem) {
    this.localOrigem = localOrigem;
  }

  public Endereco getLocalDestino() {
    return localDestino;
  }

  public void setLocalDestino(Aeroporto localDestino) {
    this.localDestino = localDestino;
  }

  public Horario getHoraSaida() {
    return horaSaida;
  }

  public void setHoraSaida(Horario horaSaida) {
    this.horaSaida = horaSaida;
  }

  public Horario getHoraChegada() {
    return horaChegada;
  }

  public void setHoraChegada(Horario horaChegada) {
    this.horaChegada = horaChegada;
  }

  public void setId() {
    this.id = DadosTrecho.gerarId();
  }

  public String getId() {
    return id;
  }

  public ArrayList<Voo> getVoosEfetuados(){
    return this.voosEfetuados;
  }

  public void setVoosEfetuados(){
    this.voosEfetuados = new ArrayList<Voo>();
  }

}