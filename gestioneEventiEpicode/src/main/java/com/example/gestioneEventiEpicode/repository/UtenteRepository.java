package com.example.gestioneEventiEpicode.repository;

import com.example.gestioneEventiEpicode.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Utente findByUsername(String username);
}
