
package com.example.demo.Service;

import com.example.demo.Entity.Financiamiento;
import com.example.demo.Repository.FinanciamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinanciamientoService {

    @Autowired
    private FinanciamientoRepository financiamientoRepository;

    public List<Financiamiento> getAll() {
        return financiamientoRepository.findAll();
    }

    public Optional<Financiamiento> getById(Long id) {
        return financiamientoRepository.findById(id);
    }

    public Financiamiento save(Financiamiento financiamiento) {
        return financiamientoRepository.save(financiamiento);
    }

    public void delete(Long id) {
        financiamientoRepository.deleteById(id);
    }
}
