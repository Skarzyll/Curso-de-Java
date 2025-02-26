package project14;

public class Lutador implements InteLutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(
            String no,
            String na,
            int i,
            float al,
            float p,
            int vi,
            int de,
            int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = i;
        this.altura = al;
        this.setPeso(p);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(this.categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (this.peso < 52.2) {
            this.setPeso(peso);
            this.setCategoria("INV");
        }
        if (this.peso <= 70.3) {
            this.setCategoria("PL");
        }
        if (this.peso <= 83.9) {
            this.setCategoria("PM");
        }
        if (this.peso <= 120.2) {
            this.setCategoria("PP");
        } else {
            this.setCategoria("INV");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.printf("Lutador: ", this.getNome());
        System.out.printf("Origem: ", this.getNacionalidade());
        System.out.printf("", this.getIdade(), " idade");
        System.out.printf("", this.getAltura(), "m de altura");
        System.out.printf("Pesando: ", this.getPeso(), "kg");
        System.out.printf("Ganhou: ", this.getVitorias());
        System.out.printf("Derrotas: ", this.getDerrotas());
        System.out.printf("Empates: ", this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.printf("É um peso categoria: ", this.getCategoria());
        System.out.printf("", this.getVitorias(), " vitorias");
        System.out.printf("", this.getDerrotas(), " derrotas");
        System.out.printf("", this.getEmpates(), " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}