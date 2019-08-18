package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author 陈刚
 * @ClassName ProductCategory
 * @Description //TODO
 * @create 2019-07-28 15:45
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private String categoryType;

    private Date createTime;

    private Date updateTime;

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType='" + categoryType + '\'' +
                '}';
    }
}
