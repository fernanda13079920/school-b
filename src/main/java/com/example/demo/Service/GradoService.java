
package com.example.demo.Service;

import com.example.demo.Entity.Grado;
import com.example.demo.Repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradoService {

    @Autowired
    private GradoRepository gradoRepository;

    public List<Grado> getAll() {
        return gradoRepository.findAll();
    }

    public Optional<Grado> getById(Long id) {
        return gradoRepository.findById(id);
    }

    public Grado save(Grado grado) {
        return gradoRepository.save(grado);
    }

    public void delete(Long id) {
        gradoRepository.deleteById(id);
    }
}
