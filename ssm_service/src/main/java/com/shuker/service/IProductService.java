package com.shuker.service;

import com.shuker.domain.Product;

import java.util.List;

/**
 * @ClassName IProductService
 * @Description TODO 产品业务层
 * @Author Shuker
 * @Date 2021/1/2 20:32
 * @Version 1.0
 **/
public interface IProductService {
    /**
     * @Description:业务层查询所有
     * @Author:Shuker
     * @Date: 2021/1/2 20:33

     * @return: java.util.List<com.shuker.domain.Product>
     **/
    List<Product> findAll() throws Exception ;
}
