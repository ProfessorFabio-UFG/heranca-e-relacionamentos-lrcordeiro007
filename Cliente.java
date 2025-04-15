
public class Cliente extends PessoaFisica{
    private double renda;
    private String interesses;
    private String profissao;

    Cliente(String nome, String endereço, String telefone,String cpf, char sexo, int estadoCivil,double renda, String interesses, String profissao){
        super(nome, endereço, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }
    public double getRenda(){
        return renda;
    }
    public void setRenda(double renda){
        this.renda = renda;
    }
    public String getInteres(){
        return interesses;
    }
    public void setInteres(String interesses){
        this.interesses = interesses;
    }
    public String getProf(){
        return profissao;
    }
    public void setProf(String profissao){
        this.profissao = profissao;
    }
}

