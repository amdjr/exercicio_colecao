import java.util.ArrayList;

public class ListaContas {
    static ArrayList<Conta> contas = new ArrayList<>();

    public void addContas(Conta conta) {
        if (conta != null) {
            contas.add(conta);
        }
    }

    public void removerContas(Conta conta) {
        contas.removeIf((item) -> item.getNumero() == (conta.getNumero()));

    }

    public Conta buscar(Conta conta) {
        for (Conta item : ListaContas.contas) {
            if (item.getNumero() == conta.getNumero()) {
                return item;
            }
        }
        return null;
    }

    public void editar(Conta conta) {
        int indice = contas.indexOf(buscar(conta));
        if (indice != -1) {
            contas.set(indice, conta);
        }
    }

    public String listar() {
        StringBuilder builder = new StringBuilder();
        for (Conta conta : ListaContas.contas) {
            builder.append(conta.toString());
        }
        return builder.toString();
    }

}
