package main.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao){
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: "+ evento.getNome() + ", Atração: "+ evento.getAtracao());
        }
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximoData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("O proximo evento: "+ proximoEvento.getNome() + " acontecerá na data " + proximoData);
        } else {
            System.out.println("Não foram encontradas eventos futuros na agenda");
        }
    }

    public static void main(String[] args) {
        // instanciando agendaEventos
        AgendaEventos agendaEventos = new AgendaEventos();

        // add eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 10), "cofeeBreak"," 1º Encontro");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 9), "bootcamp Java"," lições de java");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 20), "ENADE","Prova de conhecimentos do ens superior");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 19), "Review"," Revisão dos conhecimentos aprendidos");

        System.out.println("Agenda: ");
        agendaEventos.exibirAgenda();

        System.out.println("Evento mais proximo");
        agendaEventos.obterProximoEvento();

    }
    

}
