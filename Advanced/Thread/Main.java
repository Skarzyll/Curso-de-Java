package Advanced.Thread;

public class Main extends Thread { //Extende thread
    public static void main(String[] args) {
        Main t = new Main(); //Cria uma variavel do tipo Main
        t.start(); //Inicia a execucao do thread e chama a funcao run
        System.out.println("caio");
    }

    public void run(){
        System.out.println("aaaaa");
    }
}
