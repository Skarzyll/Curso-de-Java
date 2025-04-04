public class Gafanhoto extends Pessoa {
    private String login;
    private int     totAssistindo;

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
