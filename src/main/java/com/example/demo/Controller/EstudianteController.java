
package com.example.demo.Controller;

import com.example.demo.Entity.Estudiante;
import com.example.demo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAll() {
        return estudianteService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Estudiante> getById(@PathVariable Long id) {
        return estudianteService.getById(id);
    }

    @PostMapping
    public Estudiante save(@RequestBody Estudiante estudiante) {
        return estudianteService.save(estudiante);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        estudianteService.delete(id);
    }
}
