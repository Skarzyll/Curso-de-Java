public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario(); 
        Aluno p4 = new Aluno();

        p1.setNome("jorge");
        p2.setNome("Caio");
        p3.setNome("Carlos");
        p4.setNome("Faabiana");

        p2.setSalario(2500);
        p3.setSetor("Estoque");
        p4.setCurso("TI");
    }
}
