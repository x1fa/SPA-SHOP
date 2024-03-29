package com.shopuser.dao;

import com.spa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    Product findByPid(Integer pid);
}
