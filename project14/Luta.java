/* package project14;

import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador L1, Lutador L2) {
        if (L1.getCategoria().equals(L2.getCategoria()) && L1 != L2) {
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;

        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            System.out.println("-----------#LUTA APROVADA#------------");
            Random ale = new Random();
            int vencedor = ale.nextInt(3);

            switch (vencedor) {
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Empatado!");
                    break;

                case 1:
                    System.out.println(this.desafiado.getNome() + " ganhou a luta!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println(this.desafiante.getNome() + " ganhou a luta!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                default:
                    System.out.println("Luta nao pode acontecer!");
                    break;
            }
        } else {
            System.out.println("-----------------#LUTA DESAPROVADA#-----------------");
        }
    }
}
 */