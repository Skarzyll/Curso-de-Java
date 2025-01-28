package project6;

public class Main {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 6};

        /* for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        } */

        for (int i : n) {
            System.out.println(i);
        }
    }
}
