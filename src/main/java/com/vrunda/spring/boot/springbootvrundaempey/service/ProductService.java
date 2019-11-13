package com.vrunda.spring.boot.springbootvrundaempey.service;

import com.vrunda.spring.boot.springbootvrundaempey.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//you can also do @Service
public class ProductService {

    /*Service will use the service provided by Dao, we will autowire
    * the Dao into the service using Constructor Injection */


    ProductDao productDao;


    @Autowired
    ProductService(ProductDao daor) {
        System.out.println("Created the Service bean");
        this.productDao = daor;
    }

    public void save() {
        productDao.create();
    }
}
