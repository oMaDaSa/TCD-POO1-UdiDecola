
public class Pesquisa {
  private String origem, destino;
  private Data dataInicio, dataFim;
  private Data dataPesquisa;
  private Horario horaPesquisa;

  public Pesquisa(String origem, String destino, Data dataInicio, Data dataFim) {
    setOrigem(origem);
    setDestino(destino);
    if (dataInicio.maior(dataFim)) {
      setDataInicio(dataInicio);
      setDataFim(dataFim);
    } else {
      setDataInicio(dataFim);
      setDataFim(dataInicio);
    }
    dataPesquisa = Data.dataAtual();
    horaPesquisa = Horario.horaAtual();
  }

  public String getOrigem() {
    return origem;
  }

  public void setOrigem(String origem) {
    if (origem.length() > 0)
      this.origem = origem;
    else
      this.origem = "Inválido";
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    if (destino.length() > 0)
      this.destino = destino;
    else
      this.destino = "Inválido";
  }

  public Data getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(Data dataInicio) {
    this.dataInicio = dataInicio;
  }

  public Data getDataFim() {
    return dataFim;
  }

  public void setDataFim(Data dataFim) {
    this.dataFim = dataFim;
  }

  public Data getDataPesquisa() {
    return dataPesquisa;
  }

  public Horario getHoraPesquisa() {
    return horaPesquisa;
  }

  public String mostrarDataeHorarioPesquisa() {
    return "Data da Pesquisa: " + dataPesquisa.imprimeData() + "\nHora da Pesquisa: " + horaPesquisa.imprimeHoras();
  }

  public String mostrar() {
    return "Origem: " + origem + "\nDestino: " + destino + "\nData de Início: " + dataInicio.imprimeData()
        + "\nData de Fim: " + dataFim.imprimeData() + "\nData da Pesquisa: " + dataPesquisa.imprimeData()
        + "\nHora da Pesquisa: " + horaPesquisa.imprimeHoras();
  }

}