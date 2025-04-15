public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;

    Pessoa(String nome, String endereço, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEnde(){
        return endereço;
    }
    public void setEnde(String endereço){
        this.endereço = endereço;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}

