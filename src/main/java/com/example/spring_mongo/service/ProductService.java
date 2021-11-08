package com.example.spring_mongo.service;

import com.example.spring_mongo.modal.Products;
import com.example.spring_mongo.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productsRepository;
    public void insertProductToDB(MultipartFile file,String title, boolean inStock, String type_product, Double reguler_price, Double sale_price, Double last_price){
        Products p = new Products();

        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        if(fileName.contains("..")){
            System.out.println("not a a valid file");
        }
        p.setImage(file.getName());
        p.setInStock(inStock);
        p.setTitle(title);
        p.setType_product(type_product);
        p.setReguler_price(reguler_price);
        p.setSale_price(sale_price);
        p.setLast_price(last_price);
        productsRepository.insert(p);
    }

}
