package com.ufit.ufitapi.resources;

import com.ufit.ufitapi.entities.Alimento;
import com.ufit.ufitapi.services.AlimentoService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Resource
@RestController
@RequestMapping(value = "/alimentos")
public class AlimentoResource {
    @Autowired
    private AlimentoService service;
    @GetMapping
    public ResponseEntity<Alimento> findAlimentoByName(String name){
        Alimento ali = service.findByName(name);
        return ResponseEntity.ok().body(ali);
    }

    @GetMapping
    public ResponseEntity<List<Alimento>> findAllAlimentos(){
        List<Alimento> allAlimentos = service.findAll();
        return  ResponseEntity.ok().body(allAlimentos);
    }
}
