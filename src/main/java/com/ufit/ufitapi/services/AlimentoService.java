package com.ufit.ufitapi.services;

import com.ufit.ufitapi.repositories.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ufit.ufitapi.entities.Alimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AlimentoService {
    @Autowired
    private AlimentoRepository repository;

    public List<Alimento> findAll(){
        return repository.findAll();
    }

    public List<Alimento> findByName(String name){
        return repository.findAlimentoByNameContains(name);
    }

}
