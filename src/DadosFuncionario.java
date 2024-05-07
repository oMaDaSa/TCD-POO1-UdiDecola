import java.util.ArrayList;

public class DadosFuncionario {
  private static ArrayList<Funcionario> array = new ArrayList<Funcionario>();

  public static void add(Funcionario a) {
    array.add(a);
  }

  public static Funcionario buscar(String cpf) {
    for (Funcionario a : array) {
      if (a.getCPF().equals(cpf))
        return a;
    }
    return null;
  }

  public static boolean remover(String cpf) {
    Funcionario aux = buscar(cpf);
    if(aux == null) 
      return false;
    array.remove(aux);
    return true;
  }
 
}
