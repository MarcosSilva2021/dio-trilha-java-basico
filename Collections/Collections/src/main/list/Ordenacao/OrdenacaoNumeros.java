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
        // criar uma instancia da classe OrdenacaoNumeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // add numeros à lista
        ordenacaoNumeros.adicionarNumero(-2);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(37);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(97);

        // exibir numeros add a lista
        ordenacaoNumeros.exibirNumeros();

        // ordenar a lista em ordem ascendente
        System.out.println("Numeros ascendente:\n" + ordenacaoNumeros.ordenarAscendente());

        // exibir numeros add a lista
        ordenacaoNumeros.exibirNumeros();

        // ordenar a lista em ordem descendente
        System.out.println("Numeros descendente:\n" + ordenacaoNumeros.ordenacaoDescendente());

        // exibir numeros add a lista
        ordenacaoNumeros.exibirNumeros();
        
    }
}
