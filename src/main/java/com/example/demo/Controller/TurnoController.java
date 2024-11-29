
package com.example.demo.Controller;

import com.example.demo.Entity.Turno;
import com.example.demo.Service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping
    public List<Turno> getAll() {
        return turnoService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Turno> getById(@PathVariable Long id) {
        return turnoService.getById(id);
    }

    @PostMapping
    public Turno save(@RequestBody Turno turno) {
        return turnoService.save(turno);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        turnoService.delete(id);
    }
}
