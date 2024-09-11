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

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()){
            if (entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }    
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        // instanciando ContPalavras
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // add palavras
        contagemPalavras.adicionarPalavras("PHP", 2);
        contagemPalavras.adicionarPalavras("Java", 5);
        contagemPalavras.adicionarPalavras("C#", 2);
        contagemPalavras.adicionarPalavras("javaScript", 9);
        contagemPalavras.adicionarPalavras("Python",4);

        // exibir
        System.out.println("lista de palavras :" + contagemPalavras.palavras);

        //exibir
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " Palavras. ");

        //Ling mais frquente
        String palavraMap = contagemPalavras.encontrarPalavrasMaisFrequente();
        System.out.println("A palavra mais frequente é: "+ palavraMap);






    }

    

}
