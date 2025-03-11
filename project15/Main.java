public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3]; 

        p[0] = new Pessoa("Caio", 21, "M");
        l[0] = new Livro("Berserk", "Kentaro Miura", 370, 1, p[0], true);

        System.out.println(l[0].detalhes());
    }
}