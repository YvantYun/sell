package com.kino.sell.service;

import com.kino.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: kino
 * @Date: 2019/3/6 23:51
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
