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



        System.out.println("nuimero da conta: " + c1.getNumConta());
        System.out.println("dono da conta: " + c1.getDono());
        System.out.println("status da conta: " + (c1.isStatus() ? "aberta" : "fechada"));
        System.out.println("tipo da conta: " + c1.getTipo());
        System.out.println("saldo da conta: " + c1.getSaldo());
    }
}
