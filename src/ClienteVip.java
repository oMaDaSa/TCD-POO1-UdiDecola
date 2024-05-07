
public class ClienteVip extends Cliente{
	private static float descVip=0;
	private Data dataVip;
	
	public ClienteVip(Cliente c) {
		super(c.getCPF(), c.getNome(), c.getEndereco(), c.getDataNascimento(), c.getEmail());
		dataVip=Data.dataAtual();
	}
	
	public Data getDataVip() {
		return dataVip;
	}

	public void setDataVip(Data dataVip) {
		this.dataVip = dataVip;
	}

	public static float getDescontoVip() {
		  return descVip;
	}

	public static void setDescontoVip(float descVip) {
		if(descVip>0)
			ClienteVip.descVip = descVip;
	}
	public String mostrar() {
	    return super.mostrar()+"\nO cliente é vip";
	  }
}
