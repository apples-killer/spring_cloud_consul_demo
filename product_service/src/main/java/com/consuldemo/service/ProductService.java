package com.consuldemo.service;


import com.consuldemo.entity.ProductInfo;

public interface ProductService {

    public ProductInfo queryProductById(Integer id);

    public int addProduct(ProductInfo productInfo);
}
