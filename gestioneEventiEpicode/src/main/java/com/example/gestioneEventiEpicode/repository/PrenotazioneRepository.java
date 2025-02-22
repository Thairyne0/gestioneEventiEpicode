package com.example.gestioneEventiEpicode.repository;

import com.example.gestioneEventiEpicode.entity.Evento;
import com.example.gestioneEventiEpicode.entity.Prenotazione;
import com.example.gestioneEventiEpicode.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtente(Utente utente);
    List<Prenotazione> findByEvento(Evento evento);
}