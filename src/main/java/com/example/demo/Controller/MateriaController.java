
package com.example.demo.Controller;

import com.example.demo.Entity.Materia;
import com.example.demo.Service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getAll() {
        return materiaService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Materia> getById(@PathVariable Long id) {
        return materiaService.getById(id);
    }

    @PostMapping
    public Materia save(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        materiaService.delete(id);
    }
}
