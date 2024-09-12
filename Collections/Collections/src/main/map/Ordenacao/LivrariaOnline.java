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

    public void adicionarLivro(String link, Livro livro){
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

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());
        
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livros.entrySet()){
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);                
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livros.isEmpty()) {
            for (Livro livro : livros.values()){
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new RuntimeException("A livraria está vazia");
        }
        for(Map.Entry<String, Livro> entry: livros.entrySet()){
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livros.isEmpty()) {
            for (Livro livro : livros.values()){
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();                    
                }
            }
        } else {
            throw new RuntimeException("A livraria está vazia");
        }

        for (Map.Entry<String, Livro> entry: livros.entrySet()){
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        // instanciando livravriaonline
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        System.out.println(livrariaOnline.livros);

        // add elementos
        livrariaOnline.adicionarLivro("https://google.com ", new Livro("O magico de Oz", "Platão", 027d));
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z ", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun ", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6 ", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk ", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L ", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4 ", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
        
        // Exibir todos os livros
        System.out.println(livrariaOnline.livros);
        System.out.println("\nLivros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        String termoBusca = "Platão";
        System.out.println("Pesquisar por autor .........."+ termoBusca);
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor(termoBusca));

        System.out.println("Livro mais caro ...\n" + livrariaOnline.obterLivroMaisCaro());
                
        System.out.println("Livro mais barato ...\n" + livrariaOnline.obterLivroMaisBarato());
        
        // Remover um livro pelo título
       termoBusca = "Platão";
       System.out.println("Remover livro de titulo: "+ termoBusca);
       livrariaOnline.removerLivro(termoBusca);
       System.out.println(livrariaOnline.livros);

}




    
}

    


