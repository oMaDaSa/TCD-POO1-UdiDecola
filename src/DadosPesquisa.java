import java.util.ArrayList;

public class DadosPesquisa {
  private static ArrayList<Pesquisa> pesquisas = new ArrayList<Pesquisa>();

  public static void add(Pesquisa p) {
    pesquisas.add(p);
  }

  public static Pesquisa buscar(Data d) {
    for (Pesquisa p : pesquisas) {
      if (p.getDataPesquisa().equals(d))
        return p;
    }
    return null;
  }

  public static boolean remover(Data d, Horario h) {
    for (Pesquisa p : pesquisas) {
      if (p.getDataPesquisa().equals(d) && p.getHoraPesquisa().equals(h)) {
        pesquisas.remove(p);
        return true;
      }
    }
    return false;
  }

}