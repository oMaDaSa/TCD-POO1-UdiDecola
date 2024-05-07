import java.util.ArrayList;

public class DadosCompra {
	private static ArrayList<Compra> array = new ArrayList<Compra>();

	  public static void add(Compra compra) {
	    array.add(compra);
	  }

	  public static Compra buscar(String cpf, Data dia, Horario hora) {
		Cliente c = DadosCliente.buscar(cpf);
	    for (Compra a : array) {
	      if (c==a.getCliente()&&dia.igual(a.getData())&&hora.igual(a.getHora()))
	        return a;
	    }
	    return null;
	  }

	  public static boolean remover(String cpf, Data dia, Horario hora) {
      Compra aux = buscar(cpf, dia, hora);
      if(aux == null)
        return false;
		  array.remove(buscar(cpf, dia, hora));
      return true;
	  }
}
