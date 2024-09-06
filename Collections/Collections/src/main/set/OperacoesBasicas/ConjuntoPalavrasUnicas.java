package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributos
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto Set");
            }
        } else{
            System.out.println("O conjunto está vazio !");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);            
        } else {
            System.out.println("O conjunto está vazio !");
        }
    }

    public static void main(String[] args) {
        // criando uma intancia da classe conjuntoPalavrasunicas
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // add elementos ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Javascript");
        conjuntoPalavrasUnicas.adicionarPalavra("C");
        conjuntoPalavrasUnicas.adicionarPalavra("C#");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");

        // exibir o conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // remover um elemento do conjunto
        System.out.println("\nRemover Python e exibir o conjunto");
        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // remover um elemento inexistente
        System.out.println("\nRemover PHP");
        conjuntoPalavrasUnicas.removerPalavra("PHP");

        // Verificar se uma linguagem está no conjunto
        System.out.println("java está ? "+ conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("Python está ? "+ conjuntoPalavrasUnicas.verificarPalavra("Python"));

        // exibir as palavras únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();



    }

    

}
