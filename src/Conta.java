public class Conta {

    private int numero;
    private int saldo;

    Conta(int numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    Conta(int numero) {
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
