public class Principal {
    public static void main(String[] args) {

        Gerente jose = new Gerente("Jose", "55-999999");
        Gerente carlos = new Gerente("Carlos", "55-999999");

        ListaGerentes.gerentes.add(jose);
        ListaGerentes.gerentes.add(carlos);

        System.out.println(ListaGerentes.listar());

        Cliente ana = new Cliente("Ana", "9595511455");
        Cliente mario = new Cliente("Mario", "9971633633");

        ListaClientes.clientes.add(ana);
        ListaClientes.clientes.add(mario);

        System.out.println(ListaClientes.listar());

        ListaContas banco = new ListaContas();

        Conta conta1 = new Conta(19559, 200);
        Conta conta2 = new Conta(22591, 5200);

        banco.addContas(conta1);
        banco.addContas(conta2);

        System.out.println(banco.listar());

        System.out.println(banco.buscar(conta1));

    }
}
