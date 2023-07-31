package com.ufit.ufitapi.services;

import com.ufit.ufitapi.repositories.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ufit.ufitapi.entities.Alimento;

import java.util.ArrayList;
import java.util.List;


@Service
public class AlimentoService {
    @Autowired
    private AlimentoRepository repository;

    public Alimento findByName(String name){
        Alimento ali = new Alimento();
        return ali;
    }

    public List<Alimento> findAll(){
        return repository.findAll();
    }

}
