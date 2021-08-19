package com.cesar.cache.repository;


import com.cesar.cache.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {
    public List<Product> listAll() {
        log.info("c=ProductRepository,m=listAll");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final Product product1 = Product.builder()
                .sku("produto123")
                .price(new BigDecimal("10.00"))
                .description("Produto 1")
                .build();
        final Product product2 = Product.builder()
                .sku("produto987")
                .price(new BigDecimal("7.90"))
                .description("Produto 2")
                .build();

        List<Product> products = List.of(product1, product2);
        return products;

    }
}
