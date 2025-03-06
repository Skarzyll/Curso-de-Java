public class Livro implements Publicacao {
    private String  titulo, autor, leitor;
    private int     totpaginas, pagatual;
    private boolean aberto;

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

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void detalhes() {
        
    }

    @Override
    public void abrir() {
        
    }

    @Override
    public void fechar() {
        
    }

    @Override
    public void folhear() {
        
    }

    @Override
    public void avancarPag() {
        
    }

    @Override
    public void voltarPag() {
        
    }
}
