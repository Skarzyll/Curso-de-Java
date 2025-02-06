public class Conta {
    private int     numConta;
    private String  tipo;
    private String  dono;
    private int     saldo;
    private boolean status;

    public void Canta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("CC")) {
            this.setSaldo(50);

        } else if (tipo.equals("CP")) {
            this.setSaldo(150);

        }
        return true;
    }

        
}
