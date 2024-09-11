package main.map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(codigo,new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obteProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obteProdutoMiasBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorEstoque = entry.getValue();                    
                }
            }
        }
        return produtoMaiorQuantidadeValorEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // Exibe o estoque vazio
        System.out.println("Produtos no estoque");
        estoqueProdutos.exibirProdutos();

        // adiciona produtos ao estoque
        estoqueProdutos.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoqueProdutos.adicionarProduto(2L, "Tablet", 7, 100.0);
        estoqueProdutos.adicionarProduto(3L, "Monitor 4k", 10, 300);
        estoqueProdutos.adicionarProduto(4L, "Caixa de Som", 3, 25.0);
        estoqueProdutos.adicionarProduto(6L, "Teclado sem fio", 8, 12.0);

        //exibir produtos
        System.out.println("Produtos no estoque");
        estoqueProdutos.exibirProdutos();

        Produto produto = estoqueProdutos.obteProdutoMaisCaro();
        System.out.println("Produto mais caro: "+ produto);

        
        produto = estoqueProdutos.obteProdutoMiasBarato();
        System.out.println("produto mais Barato:" + produto);

        produto = estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("produto de maior quantidade no estoque :" + produto);

    }
}
