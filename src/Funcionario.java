public class Funcionario extends Pessoa {
  private int nroCarteira;
  private int salario;

  public Funcionario(String CPF, String nome, Endereco endereco, Data dataNascimento, int nroCarteira, float salario) {
    super(CPF, nome, endereco, dataNascimento);
    setNroCarteira(nroCarteira);
    setSalario(salario);
  }

  public Funcionario(String CPF, String nome, Endereco endereco, int diaNascimento, int mesNascimento,
      int anoNascimento, int nroCarteira, float salario) {
    this(CPF, nome, endereco, new Data(diaNascimento, mesNascimento, anoNascimento), nroCarteira, salario);
  }

  public Funcionario(Pessoa pessoa, int nroCarteira, float salario) {
    this(pessoa.getCPF(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getDataNascimento(), nroCarteira, salario);
  }

  public int getNroCarteira() {
    return nroCarteira;
  }

  public void setNroCarteira(int nroCarteira) {
    if (nroCarteira > 0)
      this.nroCarteira = nroCarteira;
  }

  public float getSalario() {
    return salario / 100F;
  }

  public void setSalario(float salario) {
    if (salario > 0)
      this.salario = (int) (salario * 100);
  }
}
