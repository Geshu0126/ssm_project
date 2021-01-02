package com.shuker.dao;

import com.shuker.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName IProductDao
 * @Description TODO product持久层操作
 * @Author Shuker
 * @Date 2021/1/2 20:28
 * @Version 1.0
 **/
public interface IProductDao {

    /**
     * @Description:查詢所有的产品信息
     * @Author:Shuker
     * @Date: 2021/1/2 20:31

     * @return: java.util.List<com.shuker.domain.Product>
     **/
    @Select("select * from product")
    List<Product> findAll() ;

}
