package com.ufit.ufitapi.repositories;

import com.ufit.ufitapi.entities.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

    List<Alimento> findAlimentoByNameContains(String name);
}
