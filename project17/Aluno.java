public class Aluno extends Pessoa{
    private int matricula;
    private String curtso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurtso() {
        return curtso;
    }

    public void setCurtso(String curtso) {
        this.curtso = curtso;
    }

    public void pagarMensa() {
        System.out.println("Ta pago!");
    }
}
