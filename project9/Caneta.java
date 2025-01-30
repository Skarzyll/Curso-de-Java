package project9;

public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga + "%");
        System.out.println("tampada: " + (this.tampada == true ? "Sim" : "Não"));
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    boolean tampar(){
        return this.tampada = true;
    }

    boolean destampar(){
        return this.tampada = false;
    }
}
