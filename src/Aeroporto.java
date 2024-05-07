public class Aeroporto extends Endereco{
  private static final long serialVersionUID = 1L;
private String nome;

  public Aeroporto(String nome, String pais, String rua, String bairro, String cidade, String estado, String cep, int num) {
    super(pais,rua,bairro,cidade,estado,cep,num);
    setNome(nome);
  }
  
  public Aeroporto(){
	  super();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if(nome.length()>0)
      this.nome = nome;
    else
      this.nome = "Inválido";
  }
}