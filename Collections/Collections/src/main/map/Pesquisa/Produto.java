package main.map.Pesquisa;

public class Produto {
    // atributos
    private String nome;
    private double preco;
    private int quantiidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantiidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantiidade() {
        return quantiidade;
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", preco=" + preco + ", quantiidade=" + quantiidade + "}";
    }
}
