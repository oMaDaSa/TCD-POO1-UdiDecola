public class FuncionarioParceria extends Funcionario{
  private int qtHoteis=0;
  private float porcentagem;

  public FuncionarioParceria(String CPF, String nome, Endereco endereco, Data dataNascimento, int nroCarteira, float salario, float porcentagem){
    super(CPF, nome, endereco, dataNascimento, nroCarteira, salario);
    setPorcentagem(porcentagem);
  }

  public FuncionarioParceria(String CPF, String nome, Endereco endereco, int diaNascimento, int mesNascimento, int anoNascimento, int nroCarteira, float salario, float porcentagem){
    this(CPF, nome, endereco, new Data(diaNascimento, mesNascimento, anoNascimento), nroCarteira, salario, porcentagem);
  }

  public int getQtHoteis() {
    return qtHoteis;
  }

  public void fazerParceria(){
    qtHoteis++;
  }

  public float getPorcentagem() {
    return porcentagem;
  }

  public void setPorcentagem(float porcentagem) {
    if(porcentagem>0)
      this.porcentagem = porcentagem;
  }

  public void setSalarioBase(float salario){
    super.setSalario(salario);
  }

  public float getSalarioBase(){
    return super.getSalario();
  }
  public float salario(){
    return super.getSalario()*(1+qtHoteis*porcentagem);
  }
}
