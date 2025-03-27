public class Main {
    public static void main(String[] args) {
        //Animal a1 = new Animal(); CLASSE ABSTRATA NAO PODE SER INSTANCIADA

        Mamifero m1 = new Mamifero();

        m1.setIdade(2);
        m1.setPeso(0.300f);
        m1.setMembros(4);
        m1.setCorPelo("Marrom");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();

        System.out.println("---------%%--------");

        Reptil r1 = new Reptil();

        r1.setIdade(2);
        r1.setPeso(0.300f);
        r1.setMembros(4);
        r1.setCorEscama("Marrom");
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();

        System.out.println("---------%%--------");

        Peixe p1 = new Peixe();

        p1.setIdade(2);
        p1.setPeso(0.300f);
        p1.setMembros(4);
        p1.setCorEscama("Marrom");
        p1.soltarBolhas();
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();

        System.out.println("---------%%--------");

        Ave av1 = new Ave();

        av1.setIdade(2);
        av1.setPeso(0.300f);
        av1.setMembros(4);
        av1.setCorPena("Marrom");
        av1.fazerNinho();
        av1.locomover();
        av1.alimentar();
        av1.emitirSom();
    }
}
