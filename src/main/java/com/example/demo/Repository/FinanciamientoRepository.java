
package com.example.demo.Repository;

import com.example.demo.Entity.Financiamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanciamientoRepository extends JpaRepository<Financiamiento, Long> {
}
