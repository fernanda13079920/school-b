
package com.example.demo.Service;

import com.example.demo.Entity.Colegio;
import com.example.demo.Repository.ColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColegioService {

    @Autowired
    private ColegioRepository colegioRepository;

    public List<Colegio> getAll() {
        return colegioRepository.findAll();
    }

    public Optional<Colegio> getById(Long id) {
        return colegioRepository.findById(id);
    }

    public Colegio save(Colegio colegio) {
        return colegioRepository.save(colegio);
    }

    public void delete(Long id) {
        colegioRepository.deleteById(id);
    }
}
