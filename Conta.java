package NivelIntermediario.DesafioBanco.BancoKonoha;

public interface Conta {
    void consultarSaldo();
    void transferir (double valor, ContaBancaria conta);
}
