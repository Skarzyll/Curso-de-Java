package Advanced.Thread;

public class Main implements Runnable /* extends Thread */ { //Extende thread ou implementa o Runnable

    public static int count = 0;

    public static void main(String[] args) {
        Main m = new Main(); //Cria uma variavel do tipo Main

        /* t.start(); */ //Inicia a execucao do thread e chama a funcao run

        Thread t = new Thread(m); //Crio uma nova instancia de Thread e passo a variavel de main como parametro

        t.start();

        while (t.isAlive()) {
            System.out.println("o thread ainda esta ativo");
        }
        
        System.out.println(count);
        count++;
        System.out.println(count);
    }

    public void run(){
        System.out.println("aaaaa");
        count++;
    }
}
