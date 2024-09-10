package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato (String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia. ");
        }
    }

    public void exibirContatos(){
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda de contatos está vazia. ");
        }
    }

    public Integer pesquisarPorNome (String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda. ");
            }
        } else {
            System.out.println("A agenda de contatos está vazia. ");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //
        System.out.println("Exibir contatos");
        agendaContatos.exibirContatos();

        //add contatos
        agendaContatos.adicionarContato("User", 121110);
        agendaContatos.adicionarContato("user2", 123456);
        agendaContatos.adicionarContato("user3", 120001);
        agendaContatos.adicionarContato("user4", 121111);
        agendaContatos.adicionarContato("user2", 129999);
        agendaContatos.adicionarContato("user5", 123456);

        System.out.println("Exibir contatos");
        agendaContatos.exibirContatos();

        // Remover contatos
        System.out.println(" Remover contatos:");
        agendaContatos.removerContato("user4");

        System.out.println("Exibir contatos atualizado");
        agendaContatos.exibirContatos();

        System.out.println("pesquisa por nome");
        String nomePesquisa = "user3";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome(nomePesquisa);
        System.out.println("Numero de telefone de "+ nomePesquisa + ": "+ numeroPesquisa);

        System.out.println("pesquisa por nome não exitente: ");
        nomePesquisa = "user0";
        numeroPesquisa = agendaContatos.pesquisarPorNome(nomePesquisa);
        System.out.println("Numero de telefone de "+ nomePesquisa + ": "+ numeroPesquisa);        

    }
    

}
