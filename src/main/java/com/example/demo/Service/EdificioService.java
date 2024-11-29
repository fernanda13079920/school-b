
package com.example.demo.Service;

import com.example.demo.Entity.Edificio;
import com.example.demo.Repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public List<Edificio> getAll() {
        return edificioRepository.findAll();
    }

    public Optional<Edificio> getById(Long id) {
        return edificioRepository.findById(id);
    }

    public Edificio save(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public void delete(Long id) {
        edificioRepository.deleteById(id);
    }
}
