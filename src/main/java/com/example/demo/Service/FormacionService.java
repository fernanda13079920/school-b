
package com.example.demo.Service;

import com.example.demo.Entity.Formacion;
import com.example.demo.Repository.FormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormacionService {

    @Autowired
    private FormacionRepository formacionRepository;

    public List<Formacion> getAll() {
        return formacionRepository.findAll();
    }

    public Optional<Formacion> getById(Long id) {
        return formacionRepository.findById(id);
    }

    public Formacion save(Formacion formacion) {
        return formacionRepository.save(formacion);
    }

    public void delete(Long id) {
        formacionRepository.deleteById(id);
    }
}
