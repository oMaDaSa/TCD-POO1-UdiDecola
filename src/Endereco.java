import java.io.Serializable;

public class Endereco implements Serializable{
private String pais, rua, bairro, cidade, estado, cep;
  private int num;

  public Endereco(String pais, String rua, String bairro, String cidade, String estado, String cep, int num) {
    setPais(pais);
    setRua(rua);
    setBairro(bairro);
    setCidade(cidade);
    setEstado(estado);
    setCep(cep);
    setNum(num);
  }

  public Endereco(String pais) {
    setPais(pais);
  }

  public Endereco(String pais, String Estado, String cidade){
    setPais(pais);
    setEstado(Estado);
    setCidade(cidade);
  }
  
  public Endereco() {}

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    if(pais.length()>0)
      this.pais = pais;
    else this.pais="Inválido";
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    if(rua.length()>0)
      this.rua = rua;
    else this.rua="Inválido";
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    if(bairro.length()>0)
      this.bairro = bairro;
    else this.bairro="Inválido";
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    if(cidade.length()>0)
      this.cidade = cidade;
    else this.cidade="Inválido";
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    if(estado.length()>0)
      this.estado = estado;
    else this.estado="Inválido";
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    if(cep.length()>0)
      this.cep = cep;
    else this.cep="Inválido";
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    if(num>0)
      this.num = num;
  }

  public String imprimeEndereco() {
    return getRua() + ", " + getBairro() + ", " + getCidade() + ", " + getEstado() + ", " + getCep() + ", " + getNum()
        + ", " + getPais();
  }
}