
package com.example.demo.Controller;

import com.example.demo.Entity.PermisoRol;
import com.example.demo.Service.PermisoRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/permisorol")
public class PermisoRolController {

    @Autowired
    private PermisoRolService permisorolService;

    @GetMapping
    public List<PermisoRol> getAll() {
        return permisorolService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<PermisoRol> getById(@PathVariable Long id) {
        return permisorolService.getById(id);
    }

    @PostMapping
    public PermisoRol save(@RequestBody PermisoRol permisorol) {
        return permisorolService.save(permisorol);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        permisorolService.delete(id);
    }
}
