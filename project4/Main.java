package project4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Digite a quantidade de pernas do animal: ");
        int pernas = t.nextInt();
        String tipo;

        switch (pernas) {
            case 1:

                tipo = "saci";
                break;
            case 2:

                tipo = "bípede";
                break;
            case 4:

                tipo = "quadrúpede";
                break;
            case 6:

                tipo = "aranha";
                break;        
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
