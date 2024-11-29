
package com.example.demo.Controller;

import com.example.demo.Entity.Permiso;
import com.example.demo.Service.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/permiso")
public class PermisoController {

    @Autowired
    private PermisoService permisoService;

    @GetMapping
    public List<Permiso> getAll() {
        return permisoService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Permiso> getById(@PathVariable Long id) {
        return permisoService.getById(id);
    }

    @PostMapping
    public Permiso save(@RequestBody Permiso permiso) {
        return permisoService.save(permiso);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        permisoService.delete(id);
    }
}
