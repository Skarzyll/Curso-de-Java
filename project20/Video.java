public class Video implements AcoesVideo {
    private String  title;
    private int     avaliacao, views, curtidas;
    private boolean reproduzindo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [title=" + title + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = true;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

}
