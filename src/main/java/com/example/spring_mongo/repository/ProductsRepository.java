package com.example.spring_mongo.repository;

import com.example.spring_mongo.modal.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<Products,Long> {

}
