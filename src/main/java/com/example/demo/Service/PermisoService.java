
package com.example.demo.Service;

import com.example.demo.Entity.Permiso;
import com.example.demo.Repository.PermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisoService {

    @Autowired
    private PermisoRepository permisoRepository;

    public List<Permiso> getAll() {
        return permisoRepository.findAll();
    }

    public Optional<Permiso> getById(Long id) {
        return permisoRepository.findById(id);
    }

    public Permiso save(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    public void delete(Long id) {
        permisoRepository.deleteById(id);
    }
}
