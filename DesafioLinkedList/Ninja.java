package NivelIntermediario.DesafioLinkedList;

import java.util.LinkedList;

public class Ninja {
    private String nome;
    private String vila;
    private int idade;

    public Ninja() {
    }

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void removePrimeiro(LinkedList listaNinja){
        listaNinja.remove(0);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d anos%n", nome, vila, idade);
    }
}
