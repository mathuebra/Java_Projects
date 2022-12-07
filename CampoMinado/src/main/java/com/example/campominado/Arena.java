package com.example.campominado;

import java.security.SecureRandom;
import java.util.Random;

public class Arena {

    //Nessa classe definirei os espaços e a aleatorização para o posicionamento das armas

    Random randomizer1 = new Random();
    Random randomizer2 = new Random();
    private int[][] campo = new int[4][4];
    private int tentativas;

    private int qntArmas;

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getQntArmas() {
        return qntArmas;
    }

    public void setQntArmas(int qntArmas) {
        this.qntArmas = qntArmas;
    }

    public Arena () {
        tentativas = 10;
        qntArmas = 0;
    }

    public void inicializaJogo() {

        //Aqui eu inicializo os campos como 0, para programar somente os campos que serão não nulos (1) para terem uma arma
        //Logo, fica mais fácil definir se o usuário chutou um espaço correto ou não

        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j ++) {
                campo[i][j] = 0;
            }
        }

        for (int i = 0; i < 4; i ++) {

            //Gerando dois números aleatórios para definirem a posição da arma na matriz
            //Atribuindo esses numeros aleatórios num int para deixar o "for" mais "Limpo"

            int numeroAleatorioLinha = randomizer1.nextInt(4);//O parâmetro define o "range" de numeros a serem sorteados
            int numeroAleatorioColuna = randomizer2.nextInt(4);//No caso, de 0 até 4-1 ou seja, de 0 a 3


            //Previne repetição de arma para sempre ter 4 armas
            if (campo[numeroAleatorioLinha][numeroAleatorioColuna] == 1) {
                numeroAleatorioLinha = randomizer1.nextInt(4);
                numeroAleatorioColuna = randomizer2.nextInt(4);
            }

            campo[numeroAleatorioLinha][numeroAleatorioColuna] = 1;
        }

    }

    public void adicionaArma() {
        qntArmas ++;
    }

    //função a ser passada para o hello controller que verifica a existência de arma no espaço selecionado
    public int verificaArma(int i, int j) {
        if (campo[i][j] == 1) return 1;
        return 0;
    }

    public void tentativasJogo() {
        tentativas -= 1;
    }

    public int verificaVitoria() {
        if (qntArmas == 4 && tentativas >= 0) return 1;

        if (qntArmas < 4 && tentativas == 0) return -1;

        return 0;
    }
}
