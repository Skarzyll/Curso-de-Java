//subclass
public class Professor {
    private String especialista;
    private int    salario;

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void aumSalario(int p) {
        this.salario = this.salario + p;
    }
}
