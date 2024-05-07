import java.util.HashMap;
import java.util.Random;

public class DadosTrecho {
  private static HashMap<String, Trecho> hashmap = new HashMap<String, Trecho>();

  public static void add(Trecho trecho) {
    String id = trecho.getId();
    if(hashmap.containsKey(id)) return;
    hashmap.put(id, trecho);
  }

  public static Trecho buscar(String id) {
    if(hashmap.containsKey(id))
      return hashmap.get(id);
    return null;
  }

  public static boolean remover(String id) {
    if(hashmap.containsKey(id)){
      hashmap.remove(id);
      return true;
    }
    return false;
      
  }

  public static String gerarId(){
    Random r = new Random();
    char c[] = new char[3];
    c[0] = (char)(r.nextInt(26) + 'A');
    c[1] = (char)(r.nextInt(26) + 'A');
    c[2] = (char)(r.nextInt(26) + 'A');
    String id = String.valueOf(c);
    String num = "00000";

    while(true){
      if(hashmap.containsKey(id+num)){
        num = String.format("%05d", Integer.parseInt(num) + 1);
      }
      else{
        id+=num;
        break;
      }
    }
    return id;
  }
}
