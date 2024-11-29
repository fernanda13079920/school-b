
package com.example.demo.Controller;

import com.example.demo.Entity.Funcion;
import com.example.demo.Service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funcion")
public class FuncionController {

    @Autowired
    private FuncionService funcionService;

    @GetMapping
    public List<Funcion> getAll() {
        return funcionService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Funcion> getById(@PathVariable Long id) {
        return funcionService.getById(id);
    }

    @PostMapping
    public Funcion save(@RequestBody Funcion funcion) {
        return funcionService.save(funcion);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        funcionService.delete(id);
    }
}
