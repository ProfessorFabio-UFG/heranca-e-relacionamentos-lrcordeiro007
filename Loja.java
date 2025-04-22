import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public void empregarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void demitirFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
    }

    public void cadastrarFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void listarClientes() {
        System.out.println("Clientes:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void listarFornecedores() {
        System.out.println("Fornecedores:");
        for (Fornecedor f : fornecedores) {
            System.out.println(f);
        }
    }
}
