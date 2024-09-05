package main.list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
    // atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;            
        } else {
            throw new RuntimeException(" A lista está vazia !!");
        }
    }

    public static void main(String[] args) {
        // criar instancia de ordenaçãoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // add pessoas as listas
        ordenacaoPessoa.adicionarPessoa("Maneul", 20, 1.72);
        ordenacaoPessoa.adicionarPessoa("Manu", 30, 1.85);
        ordenacaoPessoa.adicionarPessoa("Carlos", 27, 1.70);
        ordenacaoPessoa.adicionarPessoa("Maneul", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println( "\n Lista de pessoas adicionadas\n" + ordenacaoPessoa.pessoaList);

        // ordenar e exibir por idade
        System.out.println("\n ordenar e exibir por idade\n "+ ordenacaoPessoa.ordenarPorIdade());

        // ordenar e exibir por altura
        System.out.println("\n Exibir e ordenar por altura\n" + ordenacaoPessoa.ordenarPorAltura());     

    }   

}
