package main.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao){
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    

}
