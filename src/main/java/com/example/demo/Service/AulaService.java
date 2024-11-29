
package com.example.demo.Service;

import com.example.demo.Entity.Aula;
import com.example.demo.Repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    public List<Aula> getAll() {
        return aulaRepository.findAll();
    }

    public Optional<Aula> getById(Long id) {
        return aulaRepository.findById(id);
    }

    public Aula save(Aula aula) {
        return aulaRepository.save(aula);
    }

    public void delete(Long id) {
        aulaRepository.deleteById(id);
    }
}
