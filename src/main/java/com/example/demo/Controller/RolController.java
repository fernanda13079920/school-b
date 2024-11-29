
package com.example.demo.Controller;

import com.example.demo.Entity.Rol;
import com.example.demo.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> getAll() {
        return rolService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Rol> getById(@PathVariable Long id) {
        return rolService.getById(id);
    }

    @PostMapping
    public Rol save(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        rolService.delete(id);
    }
}
