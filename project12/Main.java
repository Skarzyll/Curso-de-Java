public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.setStatus(true);
        c1.abrirConta("CC");
        c1.setNumConta(1);
        c1.setDono("Jubileu");
        c1.setSaldo(0);
        c1.depositar(1000);
        c1.pagarMensal();
        c1.sacar(200);

        System.out.println("numero da conta: " + c1.getNumConta());
        System.out.println("dono da conta: " + c1.getDono());
        System.out.println("status da conta: " + (c1.isStatus() ? "aberta" : "fechada"));
        System.out.println("tipo da conta: " + c1.getTipo());
        System.out.println("saldo da conta: " + c1.getSaldo());

        Conta c2 = new Conta();

        c2.setStatus(true);
        c2.abrirConta("CP");
        c2.setNumConta(2);
        c2.setDono("Maritaca");
        c2.setSaldo(0);
        c2.depositar(1000);
        c2.pagarMensal();
        c2.sacar(100);

        System.out.println("numero da conta: " + c2.getNumConta());
        System.out.println("dono da conta: " + c2.getDono());
        System.out.println("status da conta: " + (c2.isStatus() ? "aberta" : "fechada"));
        System.out.println("tipo da conta: " + c2.getTipo());
        System.out.println("saldo da conta: " + c2.getSaldo());
    }
}
