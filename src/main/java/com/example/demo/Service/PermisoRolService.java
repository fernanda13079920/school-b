
package com.example.demo.Service;

import com.example.demo.Entity.PermisoRol;
import com.example.demo.Repository.PermisoRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisoRolService {

    @Autowired
    private PermisoRolRepository permisorolRepository;

    public List<PermisoRol> getAll() {
        return permisorolRepository.findAll();
    }

    public Optional<PermisoRol> getById(Long id) {
        return permisorolRepository.findById(id);
    }

    public PermisoRol save(PermisoRol permisorol) {
        return permisorolRepository.save(permisorol);
    }

    public void delete(Long id) {
        permisorolRepository.deleteById(id);
    }
}
