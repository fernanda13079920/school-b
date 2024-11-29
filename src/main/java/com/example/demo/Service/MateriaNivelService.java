
package com.example.demo.Service;

import com.example.demo.Entity.MateriaNivel;
import com.example.demo.Repository.MateriaNivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaNivelService {

    @Autowired
    private MateriaNivelRepository materianivelRepository;

    public List<MateriaNivel> getAll() {
        return materianivelRepository.findAll();
    }

    public Optional<MateriaNivel> getById(Long id) {
        return materianivelRepository.findById(id);
    }

    public MateriaNivel save(MateriaNivel materianivel) {
        return materianivelRepository.save(materianivel);
    }

    public void delete(Long id) {
        materianivelRepository.deleteById(id);
    }
}
