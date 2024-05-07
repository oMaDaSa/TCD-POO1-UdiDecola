import java.util.ArrayList;

public class DadosHoteis {
  private static ArrayList<Hotel> hoteis = new ArrayList<Hotel>();

  public static void add(Hotel hotel) {
    hoteis.add(hotel);
  }

  public static Hotel buscar(String cnpj) {
    for (Hotel hotel : hoteis) {
      if (hotel.getCNPJ().equals(cnpj))
        return hotel;
    }
    return null;
  }

  public static Quarto buscarQuarto(String cnpj, int tipo) {
    Hotel a=buscar(cnpj);
    if(a==null) return null;
    if(tipo==0) {
      return a.getQuartoSingle();
    }else if(tipo==1) {
      return a.getQuartoDuplo();
    }else if(tipo==2) {
      return a.getQuartoTriplo();
    }else if(tipo==3) {
      return a.getQuartoLuxo();
    }
    return null;
  }

  public static boolean remover(String cnpj) {
    Hotel hotel = DadosHoteis.buscar(cnpj);
    if (hotel != null) {
      hoteis.remove(hotel);
      return true;
    }
    return false;
  }
}