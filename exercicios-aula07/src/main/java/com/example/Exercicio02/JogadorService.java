package com.example.Exercicio02;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class JogadorService {

    private String[] nomes = {"Ronaldo", "Pelé", "Zico", "Neymar"};
    private String[] sobrenomes = {"Fenômeno", "Rei", "Galinho", "Júnior"};

    public Jogador gerarJogador(String time, String posicao) {
        Random rand = new Random();

        String nome = nomes[rand.nextInt(nomes.length)];
        String sobrenome = sobrenomes[rand.nextInt(sobrenomes.length)];
        int idade = 18 + rand.nextInt(23); // idade entre 18 e 40

        return new Jogador(nome, sobrenome, idade, posicao, time);
    }
}
