package com.consuldemo.controller;

import com.consuldemo.entity.ProductInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value ="/queryProduct/{id}" ,method = RequestMethod.GET)
    public ProductInfo queryProductById(@PathVariable Integer id){
        ProductInfo productInfo=restTemplate.getForObject("http://service-product/productCtrl/"+id,ProductInfo.class);
        return productInfo;
    }
}
