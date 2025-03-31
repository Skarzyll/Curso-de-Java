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

        System.out.println("---------%%--------");

        Canguru can1 = new Canguru();

        can1.setIdade(2);
        can1.setPeso(0.300f);
        can1.setMembros(4);
        can1.usarBolsa();
        can1.locomover();
        can1.alimentar();
        can1.emitirSom();

        System.out.println("---------%%--------");

        Cachorro ca1 = new Cachorro();

        ca1.setIdade(2);
        ca1.setPeso(0.300f);
        ca1.setMembros(4);
        ca1.guardarOsso();
        ca1.locomover();
        ca1.alimentar();
        ca1.emitirSom();

        System.out.println("---------%%--------");

        Cobra co1 = new Cobra();

        co1.setIdade(2);
        co1.setPeso(0.300f);
        co1.setMembros(4);
        co1.setCorEscama("Marrom");
        co1.locomover();
        co1.alimentar();
        co1.emitirSom();

        System.out.println("---------%%--------");

        Tartaruga t1 = new Tartaruga();

        t1.setIdade(2);
        t1.setPeso(0.300f);
        t1.setMembros(4);
        t1.setCorEscama("Marrom");
        t1.locomover();
        t1.alimentar();
        t1.emitirSom();

        System.out.println("---------%%--------");

        Goldfish go1 = new Goldfish();

        go1.setIdade(2);
        go1.setPeso(0.300f);
        go1.setMembros(4);
        go1.setCorEscama("Dourado");
        go1.soltarBolhas();
        go1.locomover();
        go1.alimentar();
        go1.emitirSom();
    }
}
