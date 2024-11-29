
package com.example.demo.Controller;

import com.example.demo.Entity.Grado;
import com.example.demo.Service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/grado")
public class GradoController {

    @Autowired
    private GradoService gradoService;

    @GetMapping
    public List<Grado> getAll() {
        return gradoService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Grado> getById(@PathVariable Long id) {
        return gradoService.getById(id);
    }

    @PostMapping
    public Grado save(@RequestBody Grado grado) {
        return gradoService.save(grado);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        gradoService.delete(id);
    }
}
