package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (! dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionario está vazio. ");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Termo de pesquisa não encontrado no dicionário. ";
    }

    public void exibirPalavra(){
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("o dicionário está vazio. ");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // exibir palavras
        dicionario.exibirPalavra();

        //add palavras
    dicionario.adicionarPalavra("java", "Linguagem orientada a objetos.");
    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    dicionario.adicionarPalavra("python", "Linguagem muito utlizada na ciência de dados.");
    
    
    // exibir palavras
    dicionario.exibirPalavra();

    // pesquisar por palavras o significado   
    String deficpalavra = "java";
    System.out.println("pesquisar palavras ..."+ deficpalavra +":");
    System.out.println(dicionario.pesquisarPorPalavra(deficpalavra));

    deficpalavra = "c#";
    System.out.println("pesquisar palavras ..."+ deficpalavra +":");
    System.out.println(dicionario.pesquisarPorPalavra(deficpalavra));

    deficpalavra = "python";
    System.out.println("pesquisar palavras ..."+ deficpalavra +":");
    System.out.println(dicionario.pesquisarPorPalavra(deficpalavra));

    //remover palavras
    deficpalavra = "python";
    System.out.println("Removendo a palavra ... "+ deficpalavra+":");
    dicionario.removerPalavra(deficpalavra);

    System.out.println("Lista atualizada :");
    dicionario.exibirPalavra();

    }
}
