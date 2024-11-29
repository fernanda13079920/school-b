
package com.example.demo.Service;

import com.example.demo.Entity.AsignacionDocente;
import com.example.demo.Repository.AsignacionDocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignacionDocenteService {

    @Autowired
    private AsignacionDocenteRepository asignaciondocenteRepository;

    public List<AsignacionDocente> getAll() {
        return asignaciondocenteRepository.findAll();
    }

    public Optional<AsignacionDocente> getById(Long id) {
        return asignaciondocenteRepository.findById(id);
    }

    public AsignacionDocente save(AsignacionDocente asignaciondocente) {
        return asignaciondocenteRepository.save(asignaciondocente);
    }

    public void delete(Long id) {
        asignaciondocenteRepository.deleteById(id);
    }
}
