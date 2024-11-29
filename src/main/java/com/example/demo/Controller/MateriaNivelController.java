
package com.example.demo.Controller;

import com.example.demo.Entity.MateriaNivel;
import com.example.demo.Service.MateriaNivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/materianivel")
public class MateriaNivelController {

    @Autowired
    private MateriaNivelService materianivelService;

    @GetMapping
    public List<MateriaNivel> getAll() {
        return materianivelService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<MateriaNivel> getById(@PathVariable Long id) {
        return materianivelService.getById(id);
    }

    @PostMapping
    public MateriaNivel save(@RequestBody MateriaNivel materianivel) {
        return materianivelService.save(materianivel);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        materianivelService.delete(id);
    }
}
