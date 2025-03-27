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

        
    }
}
