package project13;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();


        c1.ligar();
        c1.play();
        for (int i = 0; i < 50; i++) {
            c1.maisVolume();
        }
        c1.abrirMenu();
        c1.fecharMenu();
    }
}
