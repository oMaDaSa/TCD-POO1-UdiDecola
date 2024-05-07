public class Hotel extends Empresa {
  private int numEstrelas;
  private boolean aceitaPets, aceitaCancelamento;
  private String msgDivulgacao, descricao;
  private Horario checkIn, checkOut;
  private Data data;
  private Endereco endereco;
  private Quarto quartoDuplo;
  private Quarto quartoSingle;
  private Quarto quartoTriplo;
  private Quarto quartoLuxo;
  private static float taxa;

  public Hotel(String cnpj, String nomeOficial, String nomeDivulgacao, Data dataCriacao, int numEstrelas,
      boolean aceitaCancelamento,
      boolean aceitaPets, String msgDivulgacao, String descricao, Horario checkIn, Horario checkOut, Endereco endereco,
      int qtdSingle, double valorSingle, double descSingle, int qtdDuplo, double valorDuplo, double descDuplo,
      int qtdTriplo, double valorTriplo, double descTriplo, int qtdLuxo, double valorLuxo, double descLuxo,
      FuncionarioParceria funcionario) {
    super(cnpj, nomeOficial, nomeDivulgacao);
    setNumEstrelas(numEstrelas);
    setAceitaCancelamento(aceitaCancelamento);
    setAceitaPets(aceitaPets);
    setMsgDivulgacao(msgDivulgacao);
    setDescricao(descricao);
    setCheckIn(checkIn);
    setCheckOut(checkOut);
    setEndereco(endereco);
    quartoSingle = new Quarto(qtdSingle, valorSingle, descSingle, this);
    quartoDuplo = new Quarto(qtdDuplo, valorDuplo, descDuplo, this);
    quartoTriplo = new Quarto(qtdTriplo, valorTriplo, descTriplo, this);
    quartoLuxo = new Quarto(qtdLuxo, valorLuxo, descLuxo, this);
    funcionario.fazerParceria();
  }

  public Hotel(String cnpj, String nomeOficial, String nomeDivulgacao, Data dataCriacao, int numEstrelas,
      boolean aceitaCancelamento,
      boolean aceitaPets, String msgDivulgacao, String descricao, Horario checkIn, Horario checkOut, Quarto quartoduplo,
      Quarto quartoSingle, Quarto quartoTriplo, Quarto quartoLuxo, Endereco endereco, FuncionarioParceria funcionario) {
    super(cnpj, nomeOficial, nomeDivulgacao);
    setNumEstrelas(numEstrelas);
    setAceitaCancelamento(aceitaCancelamento);
    setAceitaPets(aceitaPets);
    setMsgDivulgacao(msgDivulgacao);
    setDescricao(descricao);
    setCheckIn(checkIn);
    setCheckOut(checkOut);
    setEndereco(endereco);
    setQuartoDuplo(quartoduplo);
    setQuartoSingle(quartoSingle);
    setQuartoTriplo(quartoTriplo);
    setQuartoLuxo(quartoLuxo);
    funcionario.fazerParceria();
  }

  public Quarto getQuartoDuplo() {
    return quartoDuplo;
  }

  public void setQuartoDuplo(Quarto quartoDuplo) {
    this.quartoDuplo = quartoDuplo;
  }

  public Quarto getQuartoSingle() {
    return quartoSingle;
  }

  public void setQuartoSingle(Quarto quartoSingle) {
    this.quartoSingle = quartoSingle;
  }

  public Quarto getQuartoTriplo() {
    return quartoTriplo;
  }

  public void setQuartoTriplo(Quarto quartoTriplo) {
    this.quartoTriplo = quartoTriplo;
  }

  public Quarto getQuartoLuxo() {
    return quartoLuxo;
  }

  public void setQuartoLuxo(Quarto quartoLuxo) {
    this.quartoLuxo = quartoLuxo;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Horario getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(Horario checkIn) {
    this.checkIn = checkIn;
  }

  public Horario getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(Horario checkOut) {
    this.checkOut = checkOut;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public String getMsgDivulgacao() {
    return msgDivulgacao;
  }

  public void setMsgDivulgacao(String msgDivulgacao) {
    if (msgDivulgacao.length() > 0)
      this.msgDivulgacao = msgDivulgacao;
    else
      this.msgDivulgacao = "Sem divulgação";
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    if (descricao.length() > 0)
      this.descricao = descricao;
    else
      this.descricao = "Sem descrição";
  }

  public int getNumEstrelas() {
    return numEstrelas;
  }

  public void setNumEstrelas(int numEstrelas) {
    if (numEstrelas >= 0 && numEstrelas <= 5)
      this.numEstrelas = numEstrelas;
    else
      this.numEstrelas = 0;
  }

  public boolean isAceitaPets() {
    return aceitaPets;
  }

  public void setAceitaPets(boolean aceitaPets) {
    this.aceitaPets = aceitaPets;
  }

  public boolean isAceitaCancelamento() {
    return aceitaCancelamento;
  }

  public void setAceitaCancelamento(boolean aceitaCancelamento) {
    this.aceitaCancelamento = aceitaCancelamento;
  }

  public boolean addDispDuplo(Data data, int i) {
    return quartoDuplo.adicionaDisponibilidade(data, i);
  }

  public int checaDispDuplo(Data data) {
    return quartoDuplo.checaDisponibilidade(data);
  }

  public boolean reduzirQuantidadeDuplo(Data data) {
    return quartoDuplo.reduzirQuantidade(data);
  }

  public boolean addDispSingle(Data data, int i) {
    return quartoSingle.adicionaDisponibilidade(data, i);
  }

  public int checaDispSingle(Data data) {
    return quartoSingle.checaDisponibilidade(data);
  }

  public boolean reduzirQuantidadeSingle(Data data) {
    return quartoSingle.reduzirQuantidade(data);
  }

  public boolean addDispTriplo(Data data, int i) {
    return quartoTriplo.adicionaDisponibilidade(data, i);
  }

  public int checaDispTriplo(Data data) {
    return quartoTriplo.checaDisponibilidade(data);
  }

  public boolean reduzirQuantidadeTriplo(Data data) {
    return quartoTriplo.reduzirQuantidade(data);
  }

  public boolean addDispLuxo(Data data, int i) {
    return quartoLuxo.adicionaDisponibilidade(data, i);
  }

  public int checaDispLuxo(Data data) {
    return quartoLuxo.checaDisponibilidade(data);
  }

  public boolean reduzirQuantidadeLuxo(Data data) {
    return quartoLuxo.reduzirQuantidade(data);
  }

  public int totalQuartos() {
    return quartoDuplo.getqtdTotal() + quartoSingle.getqtdTotal() + quartoTriplo.getqtdTotal();
  }

  public static void setTaxa(float valor) {
    if (valor > 0)
      taxa = valor;
    else
      taxa = 0;
  }

  public static float getTaxa() {
    return taxa;
  }

}