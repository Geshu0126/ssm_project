package com.shuker.controller;

import com.shuker.domain.Product;
import com.shuker.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/2 21:00
 * @Version 1.0
 **/
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService ;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView() ;
        List<Product> products = productService.findAll();
        mav.addObject("productList",products);
        mav.setViewName("product-list");
        return mav;
    }
}
