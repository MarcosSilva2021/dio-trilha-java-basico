package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio !");
        }
    }

    public Set<Produto> exibiProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparotorPorPreco());
        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        // criando uma instancia da classe cadastroProduto
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // add produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 12);
        cadastroProdutos.adicionarProduto(2l, "Utrabook", 150d, 9);
        cadastroProdutos.adicionarProduto(1L, "Tablet", 15d, 43);
        cadastroProdutos.adicionarProduto(4l, "Tela 4k", 45d, 15);

        //exibir todos os produtos cadastrados
        System.out.println("\nExibir produtos cad: "+cadastroProdutos.produtoSet);

        System.out.println("\n ordenar por nome: "+ cadastroProdutos.exibirProdutosPorNome());

        System.out.println("\n Ordem por Preço: "+ cadastroProdutos.exibiProdutosPorPreco());
    }    
}
