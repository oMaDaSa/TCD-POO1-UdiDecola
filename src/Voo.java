public class Voo{
  private Data dataDecolagem;
  private Horario horaDecolagem, horaPouso;
  private Trecho trecho;
  private float preco;
  private int vagasTotais, vagasOcupadas = 0;

  public Voo(Data dataDecolagem, Trecho trecho, float preco, int vagasTotais){
    setDataDecolagem(dataDecolagem);
    setTrecho(trecho);
    setPreco(preco);
    setVagasTotais(vagasTotais);
    registraVoo();
    setHoraDecolagem(trecho.getHoraSaida());
    setHoraPouso(trecho.getHoraChegada());
   //construtor sem horarios, pois serão gerados com os metodos decola e pousa. Sao definidos inicialmente como os horarios padrão do trecho
  }

  public Voo(Data dataDecolagem, Horario horaDecolagem, Horario horaPouso, Trecho trecho, float preco, int vagasTotais){
    setDataDecolagem(dataDecolagem);
    setHoraDecolagem(horaDecolagem);
    setHoraPouso(horaPouso);
    setTrecho(trecho);
    setPreco(preco);
    setVagasTotais(vagasTotais);
    registraVoo();
  }

  public void incrementaVagasOcupadas(int n){
    if(getVagasOcupadas()+n<=getVagasTotais())
      setVagasOcupadas(getVagasOcupadas()+n);
  }

  public void registraVoo(){
    trecho.incrementaVoosEfetuados(this);
  }

  public void decola(Horario hora){
    setHoraDecolagem(hora);
  }
  
  public void pousa(Horario hora){
    setHoraPouso(hora);
  }

  public float faturamento(){
    return preco*vagasOcupadas;
  }
  
  public Data getDataDecolagem() {
    return dataDecolagem;
  }

  public void setDataDecolagem(Data dataDecolagem) {
    this.dataDecolagem = dataDecolagem;
  }

  public Horario getHoraDecolagem() {
    return horaDecolagem;
  }

  public void setHoraDecolagem(Horario horaSaida) {
    this.horaDecolagem = horaSaida;
  }

  public Horario getHoraPouso() {
    return horaPouso;
  }

  public void setHoraPouso(Horario horaPouso) {
    this.horaPouso = horaPouso;
  }
  
  public Trecho getTrecho() {
  	return trecho;
  }
  
  public void setTrecho(Trecho trecho) {
  	this.trecho = trecho;
  }
  
  public float getPreco() {
  	return preco;
  }
  
  public void setPreco(float preco) {
    if(preco >= 0)
  	 this.preco = preco;
  }

  public int getVagasTotais() {
    return vagasTotais;
  }

  public void setVagasTotais(int vagasTotais) {
    this.vagasTotais = vagasTotais;
  }
  
  public int getVagasOcupadas() {
  	return vagasOcupadas;
  }
  
  public void setVagasOcupadas(int vagasOcupadas) {
  	this.vagasOcupadas = vagasOcupadas;
  }
}