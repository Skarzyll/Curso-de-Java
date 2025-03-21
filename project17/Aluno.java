//Subclass
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensa() {
        System.out.println("Ta pago!");
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", curso=" + curso + ", getNome()=" + getNome() + ", getSexo()="
                + getSexo() + ", getIdade()=" + getIdade() + "]";
    }
}
