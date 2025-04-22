
public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Funcionario f1 = new Funcionario("João", "Rua A", "9999-0000", "123.456.789-00", 'M', 1, 101, 2500.00, "Vendedor");
        Cliente c1 = new Cliente("Maria", "Rua B", "9888-1111", "987.654.321-00", 'F', 2, 3000.00, "Moda", "Designer");
        Fornecedor fr1 = new Fornecedor("Empresa X", "Av. Central", "4002-8922", "11.222.333/0001-44", "Empresa X Ltda", "Roupas");

        loja.empregarFuncionario(f1);
        loja.cadastrarCliente(c1);
        loja.cadastrarFornecedor(fr1);

        loja.listarFuncionarios();
        loja.listarClientes();
        loja.listarFornecedores();
    }
}
