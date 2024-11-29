
package com.example.demo.Service;

import com.example.demo.Entity.Nivel;
import com.example.demo.Repository.NivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelService {

    @Autowired
    private NivelRepository nivelRepository;

    public List<Nivel> getAll() {
        return nivelRepository.findAll();
    }

    public Optional<Nivel> getById(Long id) {
        return nivelRepository.findById(id);
    }

    public Nivel save(Nivel nivel) {
        return nivelRepository.save(nivel);
    }

    public void delete(Long id) {
        nivelRepository.deleteById(id);
    }
}
