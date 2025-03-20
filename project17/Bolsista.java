//Subclass
public class Bolsista extends Aluno {
    private float Bolsa;

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float bolsa) {
        Bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }

    public void pagarMensa() {
        System.out.println("Mensalidade paga!");
    }
}
