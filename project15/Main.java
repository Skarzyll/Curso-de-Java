/* import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> p = new ArrayList<Pessoa>();
        ArrayList<Livro> l = new ArrayList<Livro>();

        //Pessoa[] p = new Pessoa[3];
        //Livro[] l = new Livro[3]; 

        //p[0] = new Pessoa("Caio", 21, "M");
        p.add(0, new Pessoa("Caio", 21, "M"));

        //l[0] = new Livro("Berserk", "Kentaro Miura", 370, 1, p[0], true);
        l.add(0, new Livro("Berserk", "Kentaro Miura", 370, 1, p.get(0), true));

        System.out.println(l.get(0).detalhes());
    }
} */