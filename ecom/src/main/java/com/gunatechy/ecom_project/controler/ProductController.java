package com.gunatechy.ecom_project.controler;

import com.gunatechy.ecom_project.model.Product;
import com.gunatechy.ecom_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
   public String greet(){
       return "hello world";
   }

   @GetMapping("/products")
   public List<Product> getAllProduct(){
        List<Product> list = service.getAllproduct();
         System.out.println(list);
        return service.getAllproduct();
   }
}
