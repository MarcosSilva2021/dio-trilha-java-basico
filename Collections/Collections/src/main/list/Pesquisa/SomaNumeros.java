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

    

}
