package main.map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<Long, Produto> EstoqueProdutosMap;

    public EstoqueProdutos(){
        this.EstoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        EstoqueProdutosMap.put(codigo,new Produto(nome, preco, quantidade));
    }



}
