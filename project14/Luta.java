package project14;

import java.math.*;
public class Luta{
    private Lutador  desafiado, desafiante;
    private int     rounds;
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
        if (L1.getCategoria() != L2.getCategoria()) {
            if (L1 != L2) {
                aprovada = true;
                desafiado = L1;
                desafiante = L2;
            }
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            double vencedor = Math.random() * 2 + 1f;

            switch (vencedor) {
                case 0:
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    System.out.println("Empatado!");
                    break;

                case 1:
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2: 
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;

                default:
                    System.out.println("Luta nao pode acontecer!");
                    break;
            }
        }
    }
}
