
package com.example.demo.Service;

import com.example.demo.Entity.Horario;
import com.example.demo.Repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    public List<Horario> getAll() {
        return horarioRepository.findAll();
    }

    public Optional<Horario> getById(Long id) {
        return horarioRepository.findById(id);
    }

    public Horario save(Horario horario) {
        return horarioRepository.save(horario);
    }

    public void delete(Long id) {
        horarioRepository.deleteById(id);
    }
}
