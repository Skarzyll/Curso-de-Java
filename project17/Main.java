public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();

        Visitante v1 = new Visitante();
        v1.setNome("Caio");
        v1.setIdade(21);
        v1.setSexo("M");
        v1.fazerAniversario();
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.setCurso("TI");
        a1.setMatricula(111111);
        a1.fazerAniversario();
        a1.pagarMensa();
        System.out.println(a1.toString());

        
    }
}