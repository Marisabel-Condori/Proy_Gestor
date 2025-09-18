package com.gestor.gestor.repository.repo;

import com.gestor.gestor.repository.entity.Gestore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface GestoreRepository extends JpaRepository<Gestore, Long> {
}
