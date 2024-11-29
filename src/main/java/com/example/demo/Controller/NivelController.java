
package com.example.demo.Controller;

import com.example.demo.Entity.Nivel;
import com.example.demo.Service.NivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nivel")
public class NivelController {

    @Autowired
    private NivelService nivelService;

    @GetMapping
    public List<Nivel> getAll() {
        return nivelService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Nivel> getById(@PathVariable Long id) {
        return nivelService.getById(id);
    }

    @PostMapping
    public Nivel save(@RequestBody Nivel nivel) {
        return nivelService.save(nivel);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        nivelService.delete(id);
    }
}
