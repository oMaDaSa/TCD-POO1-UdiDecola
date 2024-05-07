public class Companhia extends Empresa{
  private static float taxa;
  public Companhia(String cnpj, String nomeOficial, String nomeDivulgacao, Data dataCriacao) {
    super(cnpj, nomeOficial, nomeDivulgacao);
  }

  public Companhia(Empresa empresa) {
    super(empresa);
  }
  public static void setTaxa(float valor){
    if(taxa>=0)
      taxa=valor;
  }

  public static float getTaxa(){
    return taxa;
  }
}