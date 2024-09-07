package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        if(!contatosSet.isEmpty()){
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio !");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet){
                if (c.getNome().startsWith(nome)) {
                    contatoPorNome.add(c);
                }
            }
            return contatoPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio !");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet){
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        }else {
            throw new RuntimeException("O conjunto está vazio !");
        }
    }

    public static void main(String[] args) {
        // Criando uma instancia da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibir os contatos
        agendaContatos.exibirContato();

        // add contatos a agenda
        agendaContatos.adicionarContato("Manuel", 1234567);
        agendaContatos.adicionarContato("Maria", 12345678);
        agendaContatos.adicionarContato("Maria Fernanda", 234567);
        agendaContatos.adicionarContato("Amelia", 9234567);
        agendaContatos.adicionarContato("Ferdinando", 8765430);
        
        // Exibir os contatos
        agendaContatos.exibirContato();

        // pesquidar por nome
        System.out.println(agendaContatos.pesquisarPorNome("manuel"));

        // Atualizar o contato (número)
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Amelia", 55555555);
        System.out.println("\nContato atalizado" + contatoAtualizado);
        
        // Exibir os contatos
        System.out.println("Ataulizão contatos");
        agendaContatos.exibirContato();

    }

    


}
