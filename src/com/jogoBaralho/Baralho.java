package com.company;

//Importando a biblioteca Random
import java.util.Random;

public class Baralho {
    //Declarando as variaveis:
    Naipe naipes[] = new Naipe[4];
    Valor valores[] = new Valor[13];
    String cartas[][] = new String[4][13];
    String carta[] = new String[52];
    int i = 0;
    int j = 0;
    int c = 0;

    public void montar(){
        //Atribuindo os naipes e valores
        for (Naipe naipe : Naipe.values()) {
            naipes[i] = naipe;
            i++;
        }
        for (Valor valor : Valor.values()){
            valores[j] = valor;
            j++;
        }

        //Onde monto o baralho, as 52 cartas
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j< 13; j++){
                //Montando o baralho no array bidimensional "cartas"
                cartas[i][j] = (valores[j] + " de " + naipes[i]);

                //Transformando o array "cartas" de bidimensional para unidimensional
                carta[c] = cartas[i][j];
                c++;
            }
        }

        //Chamando o método exibir
        exibir();
    }
    public void embaralhar(){
        //Declarando a variavel auxiliar
        String aux;
        int random;

        //Começando a embaralhar
        for (int c = 0; c < 52; c++) {
            Random rand = new Random();
            random = rand.nextInt(52);
            aux = carta[c];
            carta[c] = carta[random];
            carta[random] = aux;
        }

        //Chamando o Método exibir
        exibir();
    }

    public void exibir(){
        //Exibindo o baralho
        for (int c = 0; c < 52; c++) {
            System.out.println(c+1 + " " + carta[c]);
        }

        //Quebra linha
        System.out.println();

        }
}

