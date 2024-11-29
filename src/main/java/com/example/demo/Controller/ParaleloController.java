
package com.example.demo.Controller;

import com.example.demo.Entity.Paralelo;
import com.example.demo.Service.ParaleloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paralelo")
public class ParaleloController {

    @Autowired
    private ParaleloService paraleloService;

    @GetMapping
    public List<Paralelo> getAll() {
        return paraleloService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Paralelo> getById(@PathVariable Long id) {
        return paraleloService.getById(id);
    }

    @PostMapping
    public Paralelo save(@RequestBody Paralelo paralelo) {
        return paraleloService.save(paralelo);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        paraleloService.delete(id);
    }
}
