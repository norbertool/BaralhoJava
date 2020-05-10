package com.company;

//Importando a biblioteca Scanner
import java.util.Scanner;

public class GerenciarJogo {

    public static void main(String[] args) {
        //Criando o objeto baralho
        Baralho baralho = new Baralho();

        //Chamando o Método Montar
        baralho.montar();

        // Executado um PAUSE
        Scanner scan = new Scanner(System.in);
        System.out.println("Baralho montado, vamos embaralhar agora");
        System.out.println("Pressione qualquer tecla...");
        scan.nextLine();

        //Chamando o Método Embaralhar
        baralho.embaralhar();
    }
}
