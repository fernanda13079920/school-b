
package com.example.demo.Controller;

import com.example.demo.Entity.Financiamiento;
import com.example.demo.Service.FinanciamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/financiamiento")
public class FinanciamientoController {

    @Autowired
    private FinanciamientoService financiamientoService;

    @GetMapping
    public List<Financiamiento> getAll() {
        return financiamientoService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Financiamiento> getById(@PathVariable Long id) {
        return financiamientoService.getById(id);
    }

    @PostMapping
    public Financiamiento save(@RequestBody Financiamiento financiamiento) {
        return financiamientoService.save(financiamiento);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        financiamientoService.delete(id);
    }
}
