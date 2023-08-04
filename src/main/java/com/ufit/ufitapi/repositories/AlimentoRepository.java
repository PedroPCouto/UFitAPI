package com.ufit.ufitapi.repositories;

import com.ufit.ufitapi.entities.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

}
