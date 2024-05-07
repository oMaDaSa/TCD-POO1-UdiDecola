import java.io.IOException;
import java.util.ArrayList;

public class DadosCliente {
  private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public static void add(Cliente cliente) {
	clientes.add(cliente);
    Persistencia.gravar(clientes, "clientes.dat");
  }

  public static Cliente buscar(String cpf) {
    for (Cliente cliente : clientes) {
      if (cliente.getCPF().equals(cpf))
        return cliente;
    }
    return null;
  }

  public static boolean remover(String cpf) {
    Cliente cliente = DadosCliente.buscar(cpf);
    if (cliente == null)
      return false;
    
    clientes.remove(cliente);
    Persistencia.gravar(clientes, "clientes.dat");
    return true;
  }
  public static void lerArq() throws ClassNotFoundException, IOException {
	@SuppressWarnings("unchecked")
	ArrayList<Cliente> aux=(ArrayList<Cliente>) Persistencia.recuperar("clientes.dat");
	  if(aux!=null)
		  clientes=aux;
  }
}