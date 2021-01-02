package com.shuker.service.impl;

import com.shuker.dao.IProductDao;
import com.shuker.domain.Product;
import com.shuker.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/2 20:34
 * @Version 1.0
 **/
@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    private IProductDao productDao ;
    /**
     * @Description:业务层查询所有
     * @Author:Shuker
     * @Date: 2021/1/2 20:33
     * @return: java.util.List<com.shuker.domain.Product>
     **/
    public List<Product> findAll() throws Exception  {
        return productDao.findAll();
    }
}
