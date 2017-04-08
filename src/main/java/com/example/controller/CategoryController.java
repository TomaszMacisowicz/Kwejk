package com.example.controller;

import com.example.gifDao.CategoryRepository;

import com.example.gifDao.GifRepository;
import com.example.model.Category;
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
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/category/{categoryId}")
    public String category(@PathVariable int categoryId, ModelMap modelMap) {
        Category category = categoryRepository.findById(categoryId);
        modelMap.addAttribute("category", category);
        modelMap.addAttribute("gifs", gifRepository.findById(categoryId));
        return "category";
    }

    @GetMapping("/categories")
    public String listCaterories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryRepository.getAllCategories());

        return "categories";
    }

}
