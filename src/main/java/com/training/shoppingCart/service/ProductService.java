package com.training.shoppingCart.service;

import com.training.shoppingCart.requestWrapper.ProductRequestWrapper;

public interface ProductService {

void addProduct(ProductRequestWrapper request);
void updateProduct(ProductRequestWrapper request , Integer id);

}