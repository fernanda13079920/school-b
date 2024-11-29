
package com.example.demo.Service;

import com.example.demo.Entity.Rol;
import com.example.demo.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public List<Rol> getAll() {
        return rolRepository.findAll();
    }

    public Optional<Rol> getById(Long id) {
        return rolRepository.findById(id);
    }

    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    public void delete(Long id) {
        rolRepository.deleteById(id);
    }
}
