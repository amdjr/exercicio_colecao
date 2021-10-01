import java.util.ArrayList;

public class ListaClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    public void removerCliente(Cliente cliente) {
        clientes.removeIf((item) -> item.getCpf().equals(cliente.getCpf()));
    }

    public Cliente buscar(Cliente cliente) {
        for (Cliente item : this.clientes) {
            if (item.getCpf().equals(cliente.getCpf())) {
                return item;
            }

        }
        return null;
    }

    public void editarCliente(Cliente cliente) {
        int indice = clientes.indexOf(this.buscar(cliente));
        if (indice != -1) {
            clientes.set(indice, cliente);
        }
    }

    public String listar() {
        StringBuilder builder = new StringBuilder();
        for (Cliente cliente : this.clientes) {
            builder.append("Nome: " + cliente.getNome() + " - cpf: " + cliente.getCpf() + "\n");
        }
        return builder.toString();
    }
}