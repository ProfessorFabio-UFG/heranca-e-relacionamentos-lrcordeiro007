

public class Funcionario extends PessoaFisica{
    private int mat;
    private double salario;
    private String cargo;

    Funcionario(String nome, String endereço, String telefone,
        String cpf, char sexo, int estadoCivil,
        int mat, double salario, String cargo){
        super(nome, endereço, telefone, cpf, sexo, estadoCivil);
        this.mat = mat;
        this.salario = salario;
        this.cargo = cargo;
       
    }

    public int getMatricula(){
        return mat;
    }
    public void setMatricula(int mat){
        this.mat = mat;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
