package com.c0837117.finalProject;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String>{
	@Query("{department:'?0'}")
    List<Product> findProductByDept(String department);
    
    public long count();
}
