import java.util.ArrayList;

public class ListaClientes {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    public void removerCliente(Cliente cliente) {
        clientes.removeIf((item) -> item.getCpf().equals(cliente.getCpf()));
    }

    public static Cliente buscar(Cliente cliente) {
        for (Cliente item : clientes) {
            if (item.getCpf().equals(cliente.getCpf())) {
                return item;
            }

        }
        return null;
    }

    public void editarCliente(Cliente cliente) {
        int indice = clientes.indexOf(ListaClientes.buscar(cliente));
        if (indice != -1) {
            clientes.set(indice, cliente);
        }
    }

    public static String listar() {
        StringBuilder builder = new StringBuilder();
        for (Cliente cliente : ListaClientes.clientes) {
            builder.append("Nome: " + cliente.getCpf() + " - cpf: " + cliente.getNome() + "\n");
        }
        return builder.toString();
    }
}