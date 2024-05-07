public abstract class Empresa {
  private String CNPJ, nomeOficial, nomeDivulgacao;
  private Data dataCriacao;

  public Empresa(String CNPJ, String nomeOficial, String nomeDivulgacao){
    setCNPJ(CNPJ);
    this.nomeOficial=nomeOficial;
    this.nomeDivulgacao=nomeDivulgacao;
    dataCriacao=Data.dataAtual();
  }

  public Empresa(Empresa empresa){
    setCNPJ(empresa.CNPJ);
    this.nomeOficial=empresa.nomeOficial;
    this.nomeDivulgacao=empresa.nomeDivulgacao;
    this.dataCriacao = new Data(empresa.dataCriacao);
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(String CNPJ) {
    if(Validador.validarCNPJ(CNPJ)) this.CNPJ = Validador.formataCNPJ(CNPJ);
    else this.CNPJ="Inválido";
  }

  public String getNomeOficial() {
    return nomeOficial;
  }

  public void setNomeOficial(String nomeOficial) {
    if(nomeOficial.length()>0)
      this.nomeOficial = nomeOficial;
    else
      this.nomeOficial = "Inválido";
  }

  public String getNomeDivulgacao() {
    return nomeDivulgacao;
  }

  public void setNomeDivulgacao(String nomeDivulgacao) {
    if(nomeDivulgacao.length()>0)
      this.nomeDivulgacao = nomeDivulgacao;
    else
      this.nomeDivulgacao = "Inválido";
  }

  public Data getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Data dataCriacao) {
    this.dataCriacao = new Data(dataCriacao);
  }

  public void setDataCriacao(int dia, int mes, int ano){
    if(Data.dataValida(dia, mes, ano)) dataCriacao=new Data(dia, mes, ano);
  }
}
