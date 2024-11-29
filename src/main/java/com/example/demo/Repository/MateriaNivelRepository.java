
package com.example.demo.Repository;

import com.example.demo.Entity.MateriaNivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaNivelRepository extends JpaRepository<MateriaNivel, Long> {
}
