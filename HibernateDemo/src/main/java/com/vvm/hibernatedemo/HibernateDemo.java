/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vvm.hibernatedemo;

import com.vvm.pojo.Product;
import com.vvm.repositories.impl.CategoryRepositoryImpl;
import com.vvm.repositories.impl.ProductRespositoriesImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {

//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCategorys().forEach(c -> System.out.println(c.getName()));

//        ProductRespositoriesImpl p = new ProductRespositoriesImpl();
//        Map<String, String> params = new HashMap<>();
////        params.put("kw", "galaxy");
////        params.put("fromPrice", "18600000.0");
//          params.put("orderBy", "price");
//          params.put("page","1");
//        p.getProducts(params).forEach(r -> System.out.printf("%s - %.1f\n", r.getName(), r.getPrice()));
        CategoryRepositoryImpl c = new CategoryRepositoryImpl();
        
        ProductRespositoriesImpl p = new ProductRespositoriesImpl();
        
        
        Product p1 = new Product();
        p1.setName("Samsung galaxy a51");
        p1.setPrice(100000l);
        p1.setCategoryId(c.getCateById(1));
        
        p.addOrUpdate(p1);
    }
}
