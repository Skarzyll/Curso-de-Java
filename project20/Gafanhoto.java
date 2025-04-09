public class Gafanhoto extends Pessoa {
    private String login;
    private int     totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome,login, sexo, idade);
        this.login =login;
        this.totAssistindo = 0;
    }

    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto [login=" + login + ", totAssistindo=" + totAssistindo + "]";
    }

    public void viewMaisUm() {
        this.totAssistindo++;
    }
}
