package com.example.spring_mongo.controller;

import com.example.spring_mongo.modal.Products;
import com.example.spring_mongo.repository.ProductsRepository;
import com.example.spring_mongo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ProductsController {

    @Autowired
    public ProductsRepository productsRepository;
    @Autowired
    public ProductService productService;


    @PostMapping("/add")
    public String addProduct(@RequestBody Products product, @RequestParam("file") MultipartFile file){
        productService.insertProductToDB(file,product.getTitle(),product.isInStock(),product.getType_product(),product.getReguler_price(),product.getSale_price(),product.getLast_price());
        return "student add";
    }
}
