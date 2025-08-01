package NivelIntermediario.DesafioBanco.BancoKonoha;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual do titular " + nome + ": " + saldo);
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        if (valor > saldo){
            System.out.println("Você não tem saldo o suficiente para tal transação!");
        } else {
            System.out.println("Titular " + nome + " está transferindo " + valor + " para o titular " + conta.nome);
            saldo -= valor;
            conta.saldo += valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor<0){
            System.out.println("Por favor, insira um valor maior que 0!");
        } else {
            saldo += valor;
        }
    }
}
