import java.io.Serializable;

public class Cliente extends Pessoa{
private final Data dataCadastro;
  private String email;
  private static int comprasVip=0;
  private int compras;
  private int cupom=0;

  public Cliente(String CPF, String nome, Endereco endereco, Data dataNascimento, String email){
    super(CPF, nome, endereco, dataNascimento);
    this.dataCadastro=Data.dataAtual();
    setEmail(email);
    compras=0;
  }
  public Cliente(String CPF, String nome, Endereco endereco, int diaNascimento, int mesNascimento, int anoNascimento, String email){
    this(CPF, nome, endereco, new Data(diaNascimento, mesNascimento, anoNascimento), email);
  }

  public Cliente(Pessoa pessoa, String email){
    this(pessoa.getCPF(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getDataNascimento(), email);
  }

  public Cliente(String CPF, String nome, Endereco endereco, Data dataNascimento, String email, Cliente ref){
    super(CPF, nome, endereco, dataNascimento);
    this.dataCadastro=Data.dataAtual();
    setEmail(email);
    compras=0;
    this.cupom++;
    ref.incCupom();
  }

  public Cliente(String CPF, String nome, Endereco endereco, int diaNascimento, int mesNascimento, int anoNascimento, String email, Cliente ref){
    this(CPF, nome, endereco, new Data(diaNascimento, mesNascimento, anoNascimento), email, ref);
  }

  public Cliente(Pessoa pessoa, String email, Cliente ref){
    this(pessoa.getCPF(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getDataNascimento(), email, ref);
  }

  public Data getDataCadastro() {
    return dataCadastro;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if(email.length()>0)
      this.email = email;
    else this.email = "Inválido";
  }

  public static int getComprasVip() {
    return comprasVip;
  }

  public static void setComprasVip(int comprasVip) {
    Cliente.comprasVip = comprasVip;
  }

  public int getCompras() {
    return compras;
  }

  public boolean fazerCompra(Compra a) {
    compras++;
    if(compras>=comprasVip) {
    	return true;
    }
    return false;
  }

  public int getCupom(){
    return cupom;
  }

  public void setCupom(int cupom){
    if(cupom>0)
      this.cupom=cupom;
  }

  public void incCupom(){
    cupom++;
  }

  public void usaCupom(){
    cupom--;
  }
  public String mostrar() {
    return super.mostrar()+"Data criação: "+dataCadastro.imprimeData()+"\nE-mail: "+email;
  }
}
