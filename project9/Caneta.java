package project9;

public class Caneta {
    public    String  modelo;
    public    String  cor;
    private   Float   ponta;
    protected int     carga;
    private boolean tampada;

    public void status(){
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga + "%");
        System.out.println("tampada: " + (this.tampada == true ? "Sim" : "Não"));
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected boolean tampar(){
        return this.tampada = true;
    }

    protected boolean destampar(){
        return this.tampada = false;
    }
}
