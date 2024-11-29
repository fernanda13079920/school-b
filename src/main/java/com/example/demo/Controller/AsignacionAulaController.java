
package com.example.demo.Controller;

import com.example.demo.Entity.AsignacionAula;
import com.example.demo.Service.AsignacionAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignacionaula")
public class AsignacionAulaController {

    @Autowired
    private AsignacionAulaService asignacionaulaService;

    @GetMapping
    public List<AsignacionAula> getAll() {
        return asignacionaulaService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<AsignacionAula> getById(@PathVariable Long id) {
        return asignacionaulaService.getById(id);
    }

    @PostMapping
    public AsignacionAula save(@RequestBody AsignacionAula asignacionaula) {
        return asignacionaulaService.save(asignacionaula);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        asignacionaulaService.delete(id);
    }
}
