import java.util.ArrayList;

public class DadosAeroporto {
  private static ArrayList<Aeroporto> aeroportos = new ArrayList<Aeroporto>();

  public static void add(Aeroporto aeroporto) {
	  aeroportos.add(aeroporto);
  }
  
  public static Aeroporto buscar(String nome, String pais, String cidade) {
    for (Aeroporto aeroporto : aeroportos) {
      if ((aeroporto.getNome().equals(nome) && aeroporto.getPais().equals(pais)) && (aeroporto.getCidade().equals(cidade)))
        return aeroporto;
    }
    return null;
  }

  public static boolean remover(String nome, String pais, String estado, String cidade) {
    Aeroporto aeroporto = DadosAeroporto.buscar(nome, pais, cidade);
    if (aeroporto == null)
      return false;
    
    aeroportos.remove(aeroporto);
    return true;
  }
}