
package com.example.demo.Service;

import com.example.demo.Entity.AsignacionAula;
import com.example.demo.Repository.AsignacionAulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignacionAulaService {

    @Autowired
    private AsignacionAulaRepository asignacionaulaRepository;

    public List<AsignacionAula> getAll() {
        return asignacionaulaRepository.findAll();
    }

    public Optional<AsignacionAula> getById(Long id) {
        return asignacionaulaRepository.findById(id);
    }

    public AsignacionAula save(AsignacionAula asignacionaula) {
        return asignacionaulaRepository.save(asignacionaula);
    }

    public void delete(Long id) {
        asignacionaulaRepository.deleteById(id);
    }
}
