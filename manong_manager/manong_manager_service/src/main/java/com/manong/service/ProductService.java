package com.manong.service;

import com.manong.pojo.Product;
import pojo.EasyGrid;
import pojo.ResponseJsonResult;

/**
 * @Author: Topy
 * @Date: 2019/6/2 15:23
 */
public interface ProductService {
    ResponseJsonResult saveProduct (Product product);

    EasyGrid listProduct(int pages,int rows);
}
