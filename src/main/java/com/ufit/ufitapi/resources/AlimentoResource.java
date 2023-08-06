package com.ufit.ufitapi.resources;

import com.ufit.ufitapi.entities.Alimento;
import com.ufit.ufitapi.services.AlimentoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alimentos")
public class AlimentoResource {
    @Autowired
    private AlimentoService service;

    @GetMapping
    public ResponseEntity<List<Alimento>> findAllAlimentos(){
        List<Alimento> allAlimentos = service.findAll();
        return ResponseEntity.ok().body(allAlimentos);
    }
    @GetMapping(value = "/{name}")
    public ResponseEntity<List<Alimento>> findAlimentosByName(@PathVariable String name){
        List<Alimento> alimentosByName = service.findByName(name);
        return ResponseEntity.ok().body(alimentosByName);
    }

}
