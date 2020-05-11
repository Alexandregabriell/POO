package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class GerenciaJogo {
    public static void main(String[] args) throws IOException {
        Baralho baralho = new Baralho();
        baralho.baralho();
        int option=0;

        do {
            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("1 - MONTAR O BARALHO");
            System.out.println("2 - ENBARALHAR O BARALHO");
            System.out.println("3 - EXIBIR O BARALHO");
            System.out.println("4 - SAIR");
            Scanner leitor = new Scanner(System.in);
            option =leitor.nextInt();
            switch (option){
                case 1:
                    System.out.println("Baralho Montado com Sucesso");
                    baralho.baralho();
                    break;
                case 2:
                    System.out.println("Baralho Embaralhado com Sucesso");
                    baralho.embaralhar();
                    break;
                case 3:
                    baralho.exibir();
                    System.out.println("Digite enter para voltar ao menu");
                    System.in.read();
                default:
            }

        }while (option!=4);

    }




}
