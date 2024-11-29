
package com.example.demo.Controller;

import com.example.demo.Entity.Formacion;
import com.example.demo.Service.FormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/formacion")
public class FormacionController {

    @Autowired
    private FormacionService formacionService;

    @GetMapping
    public List<Formacion> getAll() {
        return formacionService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Formacion> getById(@PathVariable Long id) {
        return formacionService.getById(id);
    }

    @PostMapping
    public Formacion save(@RequestBody Formacion formacion) {
        return formacionService.save(formacion);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        formacionService.delete(id);
    }
}
