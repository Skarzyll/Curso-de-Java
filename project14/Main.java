package project14;

public class Main {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[2];

        lutadores[0] = new Lutador("Caio", "Brasileiro", 21, 1.70f, 110.0f, 10, 5, 3);

        lutadores[1] = new Lutador("Lucas", "Americano", 23, 1.65f, 111f, 5, 7, 8);

        lutadores[0].apresentar();
        lutadores[1].apresentar();

        lutadores[0].status();
        lutadores[1].status();
    }
}
