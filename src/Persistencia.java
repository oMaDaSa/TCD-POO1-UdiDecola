import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Persistencia {
  public static void gravar(Object o, String nome) {
    FileOutputStream f;
    ObjectOutputStream oS;
    try {
      f = new FileOutputStream(nome);
      oS = new ObjectOutputStream(f);
      oS.writeObject(o);

      oS.flush();
      oS.close();
      f.flush();
      f.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static Object recuperar(String nome) throws IOException, ClassNotFoundException {
    FileInputStream f = new FileInputStream(nome);
    if(f.available()==0) {
        f.close();
        return null;
    }
    ObjectInputStream oS = new ObjectInputStream(f);
    Object obj=oS.readObject();

    oS.close();
    f.close();
    return obj;
  }
}
