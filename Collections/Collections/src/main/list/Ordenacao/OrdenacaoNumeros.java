package main.list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    // atributos
    private List<Integer> numerosList;

    // construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException(" A Lista está vazia !!!");
        }
    }

    public List<Integer> ordenacaoDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente ;
        } else {
            throw new RuntimeException(" A Lista está vazia !!!");
        }
    }

    public void exibirNumeros(){
        if (!numerosList.isEmpty()) {
            System.out.println("exibir numeros da lista: \n"+ this.numerosList );
        } else {
            System.out.println("A lista está vazia");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
