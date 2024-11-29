
package com.example.demo.Service;

import com.example.demo.Entity.Turno;
import com.example.demo.Repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {

    @Autowired
    private TurnoRepository turnoRepository;

    public List<Turno> getAll() {
        return turnoRepository.findAll();
    }

    public Optional<Turno> getById(Long id) {
        return turnoRepository.findById(id);
    }

    public Turno save(Turno turno) {
        return turnoRepository.save(turno);
    }

    public void delete(Long id) {
        turnoRepository.deleteById(id);
    }
}
