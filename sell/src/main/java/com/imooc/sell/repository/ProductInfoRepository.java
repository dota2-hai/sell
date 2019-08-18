package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 陈刚
 * @ClassName ProductInfoRepository
 * @Description //TODO
 * @create 2019-07-28 19:10
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,Integer> {

    List<ProductInfo> findByProductStatus(Integer status);
}
