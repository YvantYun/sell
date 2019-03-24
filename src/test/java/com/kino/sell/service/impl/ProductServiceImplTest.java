package com.kino.sell.service.impl;

import com.kino.sell.dataobject.ProductInfo;
import com.kino.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Author: kino
 * @Date: 2019/3/7 21:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {


    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo result = productService.findOne("123456");
        Assert.assertNotNull(result);
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,10);
        Page<ProductInfo> productInfos = productService.findAll(request);
        System.out.println(productInfos.getTotalElements());

    }

    @Test
    public void save() {

        ProductInfo productInfo = new ProductInfo();

        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductStock(100);
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductDescription("很好喝的虾");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}