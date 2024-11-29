
package com.example.demo.Controller;

import com.example.demo.Entity.Horario;
import com.example.demo.Service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/horario")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping
    public List<Horario> getAll() {
        return horarioService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Horario> getById(@PathVariable Long id) {
        return horarioService.getById(id);
    }

    @PostMapping
    public Horario save(@RequestBody Horario horario) {
        return horarioService.save(horario);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        horarioService.delete(id);
    }
}
