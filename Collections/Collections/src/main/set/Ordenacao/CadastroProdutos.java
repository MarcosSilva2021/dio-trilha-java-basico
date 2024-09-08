package main.set.Ordenacao;

import java.util.Set;
import java.util.HashSet;

public class CadastroProdutos {
    // atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    
    
}
