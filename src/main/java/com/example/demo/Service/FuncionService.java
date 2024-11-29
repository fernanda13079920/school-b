
package com.example.demo.Service;

import com.example.demo.Entity.Funcion;
import com.example.demo.Repository.FuncionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionService {

    @Autowired
    private FuncionRepository funcionRepository;

    public List<Funcion> getAll() {
        return funcionRepository.findAll();
    }

    public Optional<Funcion> getById(Long id) {
        return funcionRepository.findById(id);
    }

    public Funcion save(Funcion funcion) {
        return funcionRepository.save(funcion);
    }

    public void delete(Long id) {
        funcionRepository.deleteById(id);
    }
}
