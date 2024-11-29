
package com.example.demo.Repository;

import com.example.demo.Entity.Paralelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParaleloRepository extends JpaRepository<Paralelo, Long> {
}
