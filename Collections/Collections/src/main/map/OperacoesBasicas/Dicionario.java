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

    

}
