package com.reactive.repository;

import com.reactive.entity.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface ProductRepo extends R2dbcRepository<Product, Integer> {

    public Mono<Product> findByProductid(int id);

    //public List<Product> findByCategory(String category);
    public Flux<Product> findByCategory(String category);

}

