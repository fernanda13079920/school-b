
package com.example.demo.Service;

import com.example.demo.Entity.Idioma;
import com.example.demo.Repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdiomaService {

    @Autowired
    private IdiomaRepository idiomaRepository;

    public List<Idioma> getAll() {
        return idiomaRepository.findAll();
    }

    public Optional<Idioma> getById(Long id) {
        return idiomaRepository.findById(id);
    }

    public Idioma save(Idioma idioma) {
        return idiomaRepository.save(idioma);
    }

    public void delete(Long id) {
        idiomaRepository.deleteById(id);
    }
}
