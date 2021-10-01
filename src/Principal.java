public class Principal {
    public static void main(String[] args) {

        Gerente jose = new Gerente("Jose", "55-999999");
        Gerente carlos = new Gerente("Carlos", "55-999999");

        ListaGerentes.gerentes.add(jose);
        ListaGerentes.gerentes.add(carlos);

        System.out.println(ListaGerentes.listar());

        System.out.println(ListaGerentes.buscar(carlos));

        ListaContas banco = new ListaContas();

        Conta conta1 = new Conta(1, 200);
        Conta conta2 = new Conta(2, 5200);

        banco.addContas(conta1);
        banco.addContas(conta2);

        System.out.println(banco.listar());

    }
}
