public class Main {
    public static void main(String[] args) {
        Video v1 = new Video();

        v1.setTitle("Curso em video");
        v1.setCurtidas(7);
        v1.setReproduzindo(true);
        v1.setAvaliacao(5);
        v1.setViews(8000000);

        Gafanhoto g1 = new Gafanhoto();

        g1.setLogin("Logado");
        g1.setTotAssistindo(3);

        System.out.println(v1.toString());
        System.out.println(g1.toString());
    }
}
