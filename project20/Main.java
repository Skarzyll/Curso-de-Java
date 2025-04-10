/* import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Video> v = new ArrayList<Video>();
        //Video v[] = new Video[3];

        v.add(0, new Video("Aula de Java", 0, 0, 0, true));
        v.get(0).like();
        v.get(0).pause();
        v.get(0).play();
        v.get(0).isReproduzindo();
        
        /*  v[0] = new Video("Aula de Java", 0, 0, 0, true);
        v[0].like();
        v[0].pause();
        v[0].play();
        v[0].isReproduzindo(); */

        ArrayList<Gafanhoto> g = new ArrayList<Gafanhoto>();
        //Gafanhoto g[] = new Gafanhoto[3];

        g.add(0, new Gafanhoto("Caio", 21, "M", "Logado"));
        g.get(0).ganharExp();
        g.get(0).viewMaisUm();
        
        /* g[0] = new Gafanhoto("Caio", 21, "M", "Logado");
        g[0].ganharExp();
        g[0].viewMaisUm(); */

        System.out.println(v.get(0).toString());
        System.out.println(g.get(0).toString());

        View vis = new View(g.get(0), v.get(0));

        vis.avaliar(35.3f);

        System.out.println(vis.toString());
    }
}
*/