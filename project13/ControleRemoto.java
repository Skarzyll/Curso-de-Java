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
        System.out.println(getLigado());
        System.out.println(getVolume());
        for (int i = 0; i < getVolume(); i =+ 10) {
            System.out.println("|");
        }
        System.out.println(getTocando());
    }

    @Override
    public void maisVolume() {
        if (getLigado() == true) {
            setVolume(getVolume() + 1);
        }
    }

    
}
