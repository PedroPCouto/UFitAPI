package com.ufit.ufitapi.config;

import com.ufit.ufitapi.entities.Alimento;
import com.ufit.ufitapi.repositories.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private AlimentoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Alimento ali = new Alimento(null, "Arroz frito", 100, 100f, 100f, 100f, 100f);
        Alimento ali2 = new Alimento(null, "Feijão foda", 100, 100f, 100f, 100f, 100f);
        repository.save(ali);
        repository.save(ali2);
    }


}
