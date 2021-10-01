import java.util.ArrayList;

public class ListaGerentes {
    static ArrayList<Gerente> gerentes = new ArrayList<>();

    public void addGerentes(Gerente gerente) {
        if (gerente != null) {
            gerentes.add(gerente);
        }
    }

    public void removerGerentes(Gerente gerente) {
        gerentes.removeIf((itemDaLista) -> itemDaLista.getNome().equalsIgnoreCase(gerente.getNome()));

    }

    public static Gerente buscar(Gerente gerente) {
        for (Gerente itemDaLista : gerentes) {
            if (itemDaLista.getNome().equalsIgnoreCase(gerente.getNome())) {
                return itemDaLista;
            }
        }
        return null;
    }

    public void editar(Gerente editGerente) {
        int indice = gerentes.indexOf(ListaGerentes.buscar(editGerente));
        gerentes.set(indice, editGerente);
    }

    public static String listar() {
        StringBuilder builder = new StringBuilder();
        for (Gerente gerente : ListaGerentes.gerentes) {
            builder.append("Nome: " + gerente.getNome() + " - Telefone: " + gerente.getTelefone() + "\n");
        }
        return builder.toString();
    }

}
