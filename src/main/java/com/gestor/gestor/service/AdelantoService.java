package com.gestor.gestor.service;

import com.gestor.gestor.repository.repo.GestoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdelantoService {

    @Autowired
    private GestoreRepository gestoreRepository;

    public List<Adelanto> obtenerListaAdelanto() {
        return null;
    }
}
