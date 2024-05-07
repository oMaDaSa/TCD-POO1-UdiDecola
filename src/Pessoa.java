import java.io.Serializable;

public abstract class Pessoa implements Serializable{
	private String CPF, nome;
    private Endereco endereco;
    private Data dataNascimento;

    public Pessoa(String CPF, String nome, Endereco endereco, Data dataNascimento){
        setCPF(CPF);
        setNome(nome);
        setEndereco(endereco);
        this.dataNascimento=dataNascimento;
    }

    public Pessoa(String CPF, String nome, Endereco endereco, int diaNascimento, int mesNascimento, int anoNascimento){
      this(CPF, nome, endereco, new Data(diaNascimento, mesNascimento, anoNascimento));
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(Validador.validarCPF(CPF)) this.CPF=Validador.formataCPF(CPF);
        else this.CPF="Inválido";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
      if(nome.length()>0)
        this.nome = nome;
      else this.nome = "Inválido";
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        if(Data.dataValida(dia, mes, ano)) this.dataNascimento = new Data(dia, mes, ano); //Impede que uma data válida seja sobrescrita com uma genérica
    }

    public String mostrar() {
      return "Nome: "+nome+"\nCPF: "+CPF+"\nEndereco: "+endereco.imprimeEndereco()+"\nData de nascimento: "+dataNascimento.imprimeData()+"\n";
    }
}
