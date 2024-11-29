
package com.example.demo.Controller;

import com.example.demo.Entity.Edificio;
import com.example.demo.Service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/edificio")
public class EdificioController {

    @Autowired
    private EdificioService edificioService;

    @GetMapping
    public List<Edificio> getAll() {
        return edificioService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Edificio> getById(@PathVariable Long id) {
        return edificioService.getById(id);
    }

    @PostMapping
    public Edificio save(@RequestBody Edificio edificio) {
        return edificioService.save(edificio);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        edificioService.delete(id);
    }
}
