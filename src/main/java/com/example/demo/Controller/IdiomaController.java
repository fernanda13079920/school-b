
package com.example.demo.Controller;

import com.example.demo.Entity.Idioma;
import com.example.demo.Service.IdiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/idioma")
public class IdiomaController {

    @Autowired
    private IdiomaService idiomaService;

    @GetMapping
    public List<Idioma> getAll() {
        return idiomaService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Idioma> getById(@PathVariable Long id) {
        return idiomaService.getById(id);
    }

    @PostMapping
    public Idioma save(@RequestBody Idioma idioma) {
        return idiomaService.save(idioma);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        idiomaService.delete(id);
    }
}
