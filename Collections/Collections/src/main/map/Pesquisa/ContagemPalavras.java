package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    // atributos
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem ){
        palavras.put(linguagem, contagem);
    }

    public void removerPalavras(String palavra){
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("O conjunto Map está vazio !!");
        }
    }

    

}
