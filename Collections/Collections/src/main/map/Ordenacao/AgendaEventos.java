package main.map.Ordenacao;

import java.time.LocalDate;
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
    

}
