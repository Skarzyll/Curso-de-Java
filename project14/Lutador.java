package project14;

public class Lutador implements InteLutador{
    private String nome;
    private String nacionalidade;
    private int    idade;
    private float  altura;
    private float  peso;
    private String categoria;
    private int    vitorias;
    private int    derrotas;
    private int    empates;

    public Lutador(
        String no,
        String na,
        int     i,
        float  al,
        float   p,
        int    vi,
        int    de,
        int    em
    ) {
        nome =          no;
        nacionalidade = na;
        idade =         i;
        altura =        al;
        setPeso(p);
        vitorias =      vi;
        derrotas =      de;
        empates =       em;

        
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
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (peso < 52.2) {
            setPeso(peso);
            setCategoria("INV");
        } if (peso <= 70.3 ) {
            setCategoria("PL");
        } if (peso <= 83.9) {
            setCategoria("PM");
        } if (peso <= 120.2) {
            setCategoria("PP");
        } else {
            setCategoria("INV");
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
        System.out.printf("Lutador: ", getNome());
        System.out.printf("Origem: ", getNacionalidade());
        System.out.printf("", getIdade(), " idade");
        System.out.printf("", getAltura(), "m de altura");
        System.out.printf("Pesando: ", getPeso(), "kg");
        System.out.printf("Ganhou: ", getVitorias());
        System.out.printf("Derrotas: ", getDerrotas());
        System.out.printf("Empates: ", getEmpates());
    }
}
