
public class Juri extends Pessoa{
    private String cnpj;
    private String razaoSocial;

    Juri(String nome, String endereço, String telefone,String cnpj, String razaoSocial){
        super(nome, endereço, telefone);
        this.cnpj = cnpj;
        this.razaoSocial= razaoSocial;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getRazao(){
        return razaoSocial;
    }
    public void setRazao(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
}

