
package com.example.demo.Controller;

import com.example.demo.Entity.AsignacionDocente;
import com.example.demo.Service.AsignacionDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignaciondocente")
public class AsignacionDocenteController {

    @Autowired
    private AsignacionDocenteService asignaciondocenteService;

    @GetMapping
    public List<AsignacionDocente> getAll() {
        return asignaciondocenteService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<AsignacionDocente> getById(@PathVariable Long id) {
        return asignaciondocenteService.getById(id);
    }

    @PostMapping
    public AsignacionDocente save(@RequestBody AsignacionDocente asignaciondocente) {
        return asignaciondocenteService.save(asignaciondocente);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        asignaciondocenteService.delete(id);
    }
}
