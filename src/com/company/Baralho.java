package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

/**
 *
 */
public class Baralho {

    private java.util.List<Carta> cartas =  new ArrayList<Carta>();

    /**
     * Logica para gerar as 52 Cartas já organozadas da maior para menor.
     */
    public void baralho(){

        cartas.clear();
        for (int i = 0;i <= 12; i++){
            for (int j =0;j<=3;j++){
                Carta c = new Carta();
                c.setValor(Valor.values()[i]);
                c.setNaipe(Naipe.values()[j]);

                cartas.add(c);
            }
        }
    }

    /**
     * Função que a que quando chamada exibe todas as cartas do baralho
     */
    public void exibir(){

        for (Carta item:cartas) {
            System.out.println(item.toString());
        }
    }


    /**
     * Função para embaralhar a lista de cartas
     */
    public void embaralhar(){
        java.util.Collections.shuffle(cartas);
    }



}
