package com.example.demo.adapter.out;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveGameRepository extends CrudRepository<SpielstandEntity, String> {
}
