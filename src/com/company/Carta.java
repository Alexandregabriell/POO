package com.company;

/**
 * Classe cartas q compoem a class Baralho
 */
public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    /**
     * @return Retorna os valores da Carta
     */
    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", naipe=" + naipe +
                '}';
    }

}
