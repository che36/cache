package com.cesar.cache.service;

import com.cesar.cache.entity.Product;
import com.cesar.cache.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    @Cacheable(value = "product-cache", key = "")
    public List<Product> listAll() {
        log.info("c=ProductService,m=listAll");
        return productRepository.listAll();
    }
}
