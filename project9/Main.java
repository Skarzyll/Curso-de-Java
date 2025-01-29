package project9;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.carga = 80;
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.ponta = 0.5f;
        c1.tampada = true;

        c1.status();
    }
}