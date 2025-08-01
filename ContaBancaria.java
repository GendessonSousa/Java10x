package NivelIntermediario.DesafioBanco.BancoKonoha;

public abstract class ContaBancaria implements Conta {
    String nome;
    double saldo;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);
}
