
package com.example.demo.Service;

import com.example.demo.Entity.PersonalIdioma;
import com.example.demo.Repository.PersonalIdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalIdiomaService {

    @Autowired
    private PersonalIdiomaRepository personalidiomaRepository;

    public List<PersonalIdioma> getAll() {
        return personalidiomaRepository.findAll();
    }

    public Optional<PersonalIdioma> getById(Long id) {
        return personalidiomaRepository.findById(id);
    }

    public PersonalIdioma save(PersonalIdioma personalidioma) {
        return personalidiomaRepository.save(personalidioma);
    }

    public void delete(Long id) {
        personalidiomaRepository.deleteById(id);
    }
}
