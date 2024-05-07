import java.util.ArrayList;
import java.util.HashMap;

public class DadosVoo {
  private static HashMap<String, ArrayList<Voo>> hashmap = new HashMap<String, ArrayList<Voo>>();

  public static void add(Voo voo) {
    String id = voo.getTrecho().getId();
    if(!hashmap.containsKey(id)) {
      ArrayList<Voo> array = new ArrayList<Voo>();
      hashmap.put(id, array);
    }
    hashmap.get(id).add(voo);
  } 
  

  public static Voo buscar(String id, Data data) {
    Trecho aux;
    ArrayList<Voo> array = hashmap.get(id);
    if (array == null)
      return null;
    for (Voo a : array) {
      aux = a.getTrecho();
      if (aux.getId().equals(id) && a.getDataDecolagem().igual(data))
        return a;
    }
    return null;
  }

  public static boolean remover(String id, Data data) {
    if (!hashmap.containsKey(id))
      return false;
    hashmap.get(id).remove(buscar(id, data));
    return true;
  }
}
