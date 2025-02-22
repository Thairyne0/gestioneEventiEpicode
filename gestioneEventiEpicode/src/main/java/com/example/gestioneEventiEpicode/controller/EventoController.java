package com.example.gestioneEventiEpicode.controller;

import com.example.gestioneEventiEpicode.entity.Evento;
import com.example.gestioneEventiEpicode.entity.Utente;
import com.example.gestioneEventiEpicode.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventi")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<Evento> creaEvento(@RequestBody Evento evento, @AuthenticationPrincipal Utente organizzatore) {
        Evento nuovoEvento = eventoService.creaEvento(evento, organizzatore);
        return ResponseEntity.ok(nuovoEvento);
    }
}
