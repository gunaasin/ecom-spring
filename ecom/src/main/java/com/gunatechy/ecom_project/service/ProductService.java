package com.gunatechy.ecom_project.service;

import com.gunatechy.ecom_project.model.Product;
import com.gunatechy.ecom_project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllproduct(){
        return repo.findAll();
    }
}
