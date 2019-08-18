package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 陈刚
 * @ClassName ProductCategoryRepositoryTest
 * @Description //TODO
 * @create 2019-07-28 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void addOneTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("小米9");
        productCategory.setCategoryType("手机");
         repository.save(productCategory);
    }

    @Test
    public void addOneTest2(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("小霸王");
        productCategory.setCategoryType("游戏机");
        repository.save(productCategory);
    }

    @Test
    @Transactional
    public void updateOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        productCategory.setCategoryName("小米01");
        productCategory.setCategoryType("手机");
        productCategory = repository.save(productCategory);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.getCategoryId());
    }

    @Test
    public  void findByCategoryTypeInTest(){
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(Arrays.asList("手机"));
        Assert.assertEquals(1,productCategories.size());
    }
}