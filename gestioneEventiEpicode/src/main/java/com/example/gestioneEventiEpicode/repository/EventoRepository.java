package com.example.gestioneEventiEpicode.repository;

import com.example.gestioneEventiEpicode.entity.Evento;
import com.example.gestioneEventiEpicode.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    List<Evento> findByOrganizzatore(Utente organizzatore);
}
