package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // atributo lista de numeros
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);            
        }else{
            System.out.println("A lista está vazia !!!");
        }
    }

    public static void main(String[] args) {
        // criou instancia da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // add numeros a lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-3);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(12);

        // exibir a lista de numeros
        System.out.println("Numeros adicionados: ");
       somaNumeros.exibirNumeros();

       // calcular e exibir a soma dos numeros na lista
       System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());

       // calcular e exibir a maior numeros na lista
       System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());

       // calcular e exibir a menor numeros na lista
       System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
    }         
}
