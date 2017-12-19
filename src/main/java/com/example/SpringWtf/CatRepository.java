package com.example.SpringWtf;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface CatRepository extends Repository<Cat, Long> {

    Cat save(Cat cat);

    List<CatDto> findAll();
}
