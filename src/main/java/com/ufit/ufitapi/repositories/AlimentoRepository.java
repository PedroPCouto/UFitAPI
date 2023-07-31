package com.ufit.ufitapi.repositories;

import com.ufit.ufitapi.entities.Alimento;
import org.springframework.stereotype.Repository;
import org.springframework.;

import java.util.UUID;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, UUID>{
}
