public class Livro implements Publicacao {
    private String  titulo, autor;
    private int     totPaginas, pagAtual;
    private Pessoa  leitor;
    private boolean aberto;

    public Livro(String titulo, String autor, int totpaginas, int pagatual, Pessoa leitor, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totpaginas;
        this.pagAtual = pagatual;
        this.leitor = leitor;
        this.aberto = aberto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotpaginas() {
        return totPaginas;
    }

    public void setTotpaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagatual() {
        return pagAtual;
    }

    public void setPagatual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String detalhes() {
        return "Livro{" + "titulo =" + titulo + ", autor =" + autor + ", totPaginas = " + totPaginas + ", pagAtual = " + pagAtual + ", aberto = " + aberto + ", leitor = " + leitor + "}";
    }

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("O livro esta aberto!");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("O livro esta fechado!");
    }

    @Override
    public void folhear(int pag) {
        this.pagAtual = pag;
    }

    @Override
    public void avancarPag() {
        
    }

    @Override
    public void voltarPag() {
        
    }
}
