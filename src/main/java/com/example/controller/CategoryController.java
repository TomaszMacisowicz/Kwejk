package com.example.controller;

import com.example.gifDao.CategoryRepository;
import org.apache.log4j.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * Created by Macu on 2017-04-03.
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/category/{categoryId}")
    public String category(@PathVariable int categoryId, ModelMap modelMap){
        Category category= categoryRepository.findById(CategoryId);
        modelMap.addAttribute("category",category);
        return "category";
    }

    @GetMapping("/categories")


}
