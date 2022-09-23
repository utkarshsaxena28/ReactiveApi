package com.reactive.service;

import com.reactive.entity.Product;
import com.reactive.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;
import java.time.Duration;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo proRepo;

    // Getting list of all Product present in database
    public Flux<Product> listAll(String category) {

        /*
        System.out.println("______________" + "inside flux service" + "________________");
        List<Product> list = null;
        list = proRepo.findByCategory(category);
        System.out.println("############################################");
        System.out.println("______________" + list + "________________");
        System.out.println("############################################");
        return list;*/

        //return Flux.just(proRepo.findByCategory(category)).delayElements(Duration.ofSeconds(1)).log();

        System.out.println("______________" + "inside flux service" + "________________");
        Flux<Product> list = null;
        list = proRepo.findByCategory(category);
        System.out.println("############################################");
        System.out.println("______________" + list + "________________");
        System.out.println("############################################");
        return list;
    }

    // Get single product by id
    public Mono<Product> getProductById(int id) {
        Mono<Product> prodct = null;
        try {
            prodct = proRepo.findByProductid(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prodct;
    }
}

