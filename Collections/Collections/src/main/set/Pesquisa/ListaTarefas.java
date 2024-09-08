package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // atributos
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto está vazio !!!");
        }
        if (tarefaRemover == null) {
            System.out.println("Tarefa não encontrada !!!!");
        }
    }

    public void exibirTarefas(){
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Tarefa não encontrada !!!");
        }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefasSet){
            if (t.getConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        if (tarefasConcluidas.isEmpty()) {
            throw new RuntimeException("Nenhuma tarefa Concluida !!!");            
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if (!t.getConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        if (tarefasPendentes.isEmpty()) {
            throw new RuntimeException("Nenhuma tareda Pendente");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefasMarcarPendente = null;
        for (Tarefa t : tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasMarcarPendente = t;
                break;                
            }
        }
        if (tarefasMarcarPendente != null) {
            if (tarefasMarcarPendente.getConcluida()) {
                tarefasMarcarPendente.setConcluida(false);                
            }
        } else {
            System.out.println("Tarefa não encontrada na lista !");
        }
    }

    public void limparListaTarefas(){
        if (tarefasSet.isEmpty()) {
            System.out.println("A lista esta vazia !");
        } else {
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        // Criando uma instancia da classe ListaTarefa
        ListaTarefas listaTarefas = new ListaTarefas();
        
        // adicioando elementos na lista
        listaTarefas.adicionarTarefa("Estudar 1 hora");
        listaTarefas.adicionarTarefa("Meditar");
        listaTarefas.adicionarTarefa("Programar o dia");
        listaTarefas.adicionarTarefa("Ler livros");
        listaTarefas.adicionarTarefa("ir faculdade");

        // exibir tarefas
        listaTarefas.exibirTarefas();
    }
    

}
