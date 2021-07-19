package com.shopuser.service.impl;

import com.shopuser.dao.ProductDao;
import com.shopuser.service.ProductService;
import com.spa.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid){
        return  productDao.findByPid(pid);
    }
}
