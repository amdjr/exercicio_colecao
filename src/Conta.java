public class Conta {

    private int numero;
    private float saldo;

    Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
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

    @Override
    public String toString() {
        return String.format("Nº %d\nSaldo %.2f\n\n", this.numero, this.saldo);
    }

}
