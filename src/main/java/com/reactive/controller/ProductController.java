package com.reactive.controller;

import com.reactive.ReactiveApiApplication;

import com.reactive.entity.Product;
import com.reactive.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    static Logger logger = LogManager.getLogger(ReactiveApiApplication.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/products")                                                         //CHECKED
    public Flux<Product> list(@RequestParam String category){


        System.out.println("______________" + "inside flux controller" + "________________");
        Flux<Product> list = productService.listAll(category);
        return list;


        // Flux.just(productService.listAll(category)).delayElements(Duration.ofSeconds(1)).log()
        /*
        System.out.println("______________" + "inside flux controller" + "________________");
        return Flux.just(productService.listAll(category)).delayElements(Duration.ofSeconds(1)).log();*/
    }

    @GetMapping("/product")
    private Mono<Product> getById(@RequestParam int id) {
        
        return productService.getProductById(id);
    }

}

