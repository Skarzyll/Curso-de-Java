package project19;

public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();

        m1.setCorPelo("Marrom");
        m1.setIdade(7);
        m1.setMembros(4);
        m1.setPeso(70.7f);
        m1.emitirSom();

        System.out.println("------------%%--------------");

        Lobo l1 = new Lobo();

        l1.setCorPelo("Marrom");
        l1.setIdade(7);
        l1.setMembros(4);
        l1.setPeso(70.7f);
        l1.emitirSom();

        System.out.println("------------%%--------------");

        Cachorro ca1 = new Cachorro();

        ca1.setCorPelo("Marrom");
        ca1.setIdade(7);
        ca1.setMembros(4);
        ca1.setPeso(70.7f);
        ca1.emitirSom();

        System.out.println("------------%%--------------");
    }
}