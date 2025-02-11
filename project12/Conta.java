public class Conta {
    private int     numConta;
    private String  tipo;
    private String  dono;
    private float     saldo;
    private boolean status;

    public Conta() {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("CC")) {
            this.setSaldo(50);

        } else if (tipo.equals("CP")) {
            this.setSaldo(100);

        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");

        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");

        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");

        }
    }

    public void depositar(int valor) {
        
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono() + " com sucesso.");

        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(int valor) {
        if (status == true) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " autorizado na conta de " + dono);
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    void pagarMensal() {
        if (status == true) {
            int val = 0;

            if (tipo.equals("CC")) {
                val = 5;
            } else if (tipo.equals("CP")) {
                val =10;
            }

            saldo -= val;

            System.out.println("Mensalidade paga com sucesso por " + dono);
        }
    }
}
