package main.map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adiconarLivro(String link, Livro livro){
        livros.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover){
            livros.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }
    

    

}
