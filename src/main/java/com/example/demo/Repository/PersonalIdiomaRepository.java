
package com.example.demo.Repository;

import com.example.demo.Entity.PersonalIdioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalIdiomaRepository extends JpaRepository<PersonalIdioma, Long> {
}
