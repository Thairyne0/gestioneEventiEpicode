package com.example.gestioneEventiEpicode.service;

import com.example.gestioneEventiEpicode.entity.Evento;
import com.example.gestioneEventiEpicode.entity.Utente;
import com.example.gestioneEventiEpicode.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public Evento creaEvento(Evento evento, Utente organizzatore) {
        evento.setOrganizzatore(organizzatore);
        return eventoRepository.save(evento);
    }
}
