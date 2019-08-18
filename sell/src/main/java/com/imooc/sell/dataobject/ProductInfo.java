package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author 陈刚
 * @ClassName ProductInfo
 * @Description //TODO
 * @create 2019-07-28 19:06
 */
@Data
@Entity
@DynamicUpdate
public class ProductInfo {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
    }
    @Id
    @GeneratedValue
    private Integer productId;
    private String productName;
    private BigDecimal productPrice;



    /**
     * 库存
     */
    private String productStock;
    private String productDescription;
    /**
     * 商品小图
     */
    private String productIcon;
    /**
     * 商品状态
     * 0：正常
     * 1：下架
     */
    private Integer productStatus;

    /**
     * 商品类目
     */
    private String categoryType;
}
