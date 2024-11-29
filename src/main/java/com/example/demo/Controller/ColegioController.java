
package com.example.demo.Controller;

import com.example.demo.Entity.Colegio;
import com.example.demo.Service.ColegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/colegio")
public class ColegioController {

    @Autowired
    private ColegioService colegioService;

    @GetMapping
    public List<Colegio> getAll() {
        return colegioService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Colegio> getById(@PathVariable Long id) {
        return colegioService.getById(id);
    }

    @PostMapping
    public Colegio save(@RequestBody Colegio colegio) {
        return colegioService.save(colegio);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        colegioService.delete(id);
    }
}
