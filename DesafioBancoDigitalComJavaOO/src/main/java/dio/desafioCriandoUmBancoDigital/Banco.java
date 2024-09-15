package main.java.dio.desafioCriandoUmBancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    // atributos
    private String nome;
    private List<Conta> contas;
    
    List<Cliente> clientes = new ArrayList<Cliente>();

    // construtor
    public Banco() {
    }

    // getters e setters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Conta> getContas() {
        return contas;
    }


    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void mostrarClientes(){
        System.out.println(clientes);
    }

    

}
