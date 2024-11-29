
package com.example.demo.Controller;

import com.example.demo.Entity.Aula;
import com.example.demo.Service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/aula")
public class AulaController {

    @Autowired
    private AulaService aulaService;

    @GetMapping
    public List<Aula> getAll() {
        return aulaService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Aula> getById(@PathVariable Long id) {
        return aulaService.getById(id);
    }

    @PostMapping
    public Aula save(@RequestBody Aula aula) {
        return aulaService.save(aula);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        aulaService.delete(id);
    }
}
