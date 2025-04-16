package Advanced.Thread;

public class Main extends Thread {
    public static void main(String[] args) {
        Main t = new Main();
        t.start();
        System.out.println("caio");
    }

    public void run(){
        System.out.println("aaaaa");
    }
}
