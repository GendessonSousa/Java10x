package NivelIntermediario.DesafioBanco.BancoKonoha;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaNaruto = new ContaCorrente("Naruto Uzumaki", 0);
        ContaCorrente contaSasuke = new ContaCorrente("Sasuke Uchiha",0);
        ContaPoupanca contaSakura = new ContaPoupanca("Sakura Haruno", 0);
        ContaPoupanca contaIno = new ContaPoupanca("Ino Yamanaka", 0);

        System.out.println("--------------------------------------------------------------");
        contaNaruto.depositar(1000);
        contaSasuke.depositar(700);
        contaNaruto.consultarSaldo();
        contaSasuke.consultarSaldo();
        contaSasuke.transferir(500, contaNaruto);
        contaNaruto.consultarSaldo();
        contaSasuke.consultarSaldo();
        System.out.println("--------------------------------------------------------------");

        contaSakura.depositar(1000);
        contaIno.depositar(400);
        contaSakura.consultarSaldo();
        contaIno.consultarSaldo();
        contaIno.transferir(500, contaSakura);
        contaSakura.consultarSaldo();
        contaIno.consultarSaldo();
        System.out.println("--------------------------------------------------------------");
    }
}
