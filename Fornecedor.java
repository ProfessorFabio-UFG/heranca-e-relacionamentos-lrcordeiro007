
public class Fornecedor extends Juri{
    private String produto;

    Fornecedor(String nome, String endereço, String telefone,String cnpj, String razaoSocial,String produto){
        super(nome, endereço, telefone, cnpj, razaoSocial);
        this.produto =produto;
    }

    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }
}

