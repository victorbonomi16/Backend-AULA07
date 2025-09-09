package com.example.Exercicio02;

public class Jogador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String posicao;
    private String time;

    // Construtor
    public Jogador(String nome, String sobrenome, int idade, String posicao, String time) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.posicao = posicao;
        this.time = time;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public int getIdade() { return idade; }
    public String getPosicao() { return posicao; }
    public String getTime() { return time; }

    public void setNome(String nome) { this.nome = nome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setPosicao(String posicao) { this.posicao = posicao; }
    public void setTime(String time) { this.time = time; }
}
