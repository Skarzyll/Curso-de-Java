package project13;

public class ControleRemoto implements Controlador {
    private  int      volume;
    private  boolean  ligado;
    private  boolean  tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(getLigado() ? "Ligado" : "Desligado");
        System.out.println(getVolume());
        for (int i = 0; i <= getVolume(); i = i + 10) {
            System.out.print("|");
        }
        System.out.println("");
        System.out.println(getTocando() ? "Tocando" : "Nao esta tocando");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado() == true) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado() == true) {
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() == true && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() == true && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() == true && !getTocando()) {
            setTocando(true);
        }
    }

    public void pause() {
        if (getLigado() == true && getTocando() == true) {
            setTocando(false);
        }
    }
}
