
package com.example.demo.Service;

import com.example.demo.Entity.Paralelo;
import com.example.demo.Repository.ParaleloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParaleloService {

    @Autowired
    private ParaleloRepository paraleloRepository;

    public List<Paralelo> getAll() {
        return paraleloRepository.findAll();
    }

    public Optional<Paralelo> getById(Long id) {
        return paraleloRepository.findById(id);
    }

    public Paralelo save(Paralelo paralelo) {
        return paraleloRepository.save(paralelo);
    }

    public void delete(Long id) {
        paraleloRepository.deleteById(id);
    }
}
