package project19;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Auauauau");
    }

    public void reagir(String frase) {}

    public void reagir(int hora, int min) {}

    public void reagir(boolean dono) {}

    public void reagir(int idade, float peso) {}
}
