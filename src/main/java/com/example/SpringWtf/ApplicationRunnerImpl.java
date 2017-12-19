package com.example.SpringWtf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Autowired
    CatRepository catRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        catRepository.save(Cat.builder().name("Mruczek").mrau("mrau").paws(4).build());
        catRepository.save(Cat.builder().name("Wruczek").mrau("wrrr").paws(4).build());
        catRepository.save(Cat.builder().name("Kadlubek").mrau("mrrr").paws(0).build());
        List<CatDto> all = catRepository.findAll();
        CatDto catDto = all.get(0);
        CatDto catDto2 = all.get(1);
    }
}