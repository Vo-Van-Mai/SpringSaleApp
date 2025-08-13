/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvm.controllers;

import com.vvm.repositories.impl.CategoryRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class IndexController {
    
    @Autowired
    private CategoryRepositoryImpl cate;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", cate.getCategorys());
        return "index";
    }
    
}
