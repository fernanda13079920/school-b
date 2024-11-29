
package com.example.demo.Controller;

import com.example.demo.Entity.PersonalIdioma;
import com.example.demo.Service.PersonalIdiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personalidioma")
public class PersonalIdiomaController {

    @Autowired
    private PersonalIdiomaService personalidiomaService;

    @GetMapping
    public List<PersonalIdioma> getAll() {
        return personalidiomaService.getAll();
    }

    @GetMapping("/<built-in function id>")
    public Optional<PersonalIdioma> getById(@PathVariable Long id) {
        return personalidiomaService.getById(id);
    }

    @PostMapping
    public PersonalIdioma save(@RequestBody PersonalIdioma personalidioma) {
        return personalidiomaService.save(personalidioma);
    }

    @DeleteMapping("/<built-in function id>")
    public void delete(@PathVariable Long id) {
        personalidiomaService.delete(id);
    }
}
