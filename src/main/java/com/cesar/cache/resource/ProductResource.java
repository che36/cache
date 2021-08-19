package com.cesar.cache.resource;

import com.cesar.cache.entity.Product;
import com.cesar.cache.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Slf4j
public class ProductResource {
    private final ProductService productService;

    @GetMapping("/")
    public List<Product> listALl() {
        log.info("c = ProductResource,m=listAll");
        return productService.listAll();
    }
}
