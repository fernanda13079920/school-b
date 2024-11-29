
package com.example.demo.Controller;

import com.example.demo.Entity.Curso;
import com.example.demo.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAll() {
        return cursoService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Curso> getById(@PathVariable Long id) {
        return cursoService.getById(id);
    }

    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        cursoService.delete(id);
    }
}
