
package com.example.demo.Controller;

import com.example.demo.Entity.Espacio;
import com.example.demo.Service.EspacioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/espacio")
public class EspacioController {

    @Autowired
    private EspacioService espacioService;

    @GetMapping
    public List<Espacio> getAll() {
        return espacioService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Espacio> getById(@PathVariable Long id) {
        return espacioService.getById(id);
    }

    @PostMapping
    public Espacio save(@RequestBody Espacio espacio) {
        return espacioService.save(espacio);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        espacioService.delete(id);
    }
}
