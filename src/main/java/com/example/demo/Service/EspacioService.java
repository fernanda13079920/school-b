
package com.example.demo.Service;

import com.example.demo.Entity.Espacio;
import com.example.demo.Repository.EspacioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioService {

    @Autowired
    private EspacioRepository espacioRepository;

    public List<Espacio> getAll() {
        return espacioRepository.findAll();
    }

    public Optional<Espacio> getById(Long id) {
        return espacioRepository.findById(id);
    }

    public Espacio save(Espacio espacio) {
        return espacioRepository.save(espacio);
    }

    public void delete(Long id) {
        espacioRepository.deleteById(id);
    }
}
