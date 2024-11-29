
package com.example.demo.Controller;

import com.example.demo.Entity.Personal;
import com.example.demo.Service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @GetMapping
    public List<Personal> getAll() {
        return personalService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<Personal> getById(@PathVariable Long id) {
        return personalService.getById(id);
    }

    @PostMapping
    public Personal save(@RequestBody Personal personal) {
        return personalService.save(personal);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        personalService.delete(id);
    }
}
