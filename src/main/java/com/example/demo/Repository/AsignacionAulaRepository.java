
package com.example.demo.Repository;

import com.example.demo.Entity.AsignacionAula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionAulaRepository extends JpaRepository<AsignacionAula, Long> {
}
