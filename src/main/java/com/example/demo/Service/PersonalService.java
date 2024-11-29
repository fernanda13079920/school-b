
package com.example.demo.Service;

import com.example.demo.Entity.Personal;
import com.example.demo.Repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    public List<Personal> getAll() {
        return personalRepository.findAll();
    }

    public Optional<Personal> getById(Long id) {
        return personalRepository.findById(id);
    }

    public Personal save(Personal personal) {
        return personalRepository.save(personal);
    }

    public void delete(Long id) {
        personalRepository.deleteById(id);
    }
}
