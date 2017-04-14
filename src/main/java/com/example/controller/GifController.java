package com.example.controller;

import com.example.gifDao.GifRepository;
import com.example.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Macu on 2017-03-31.
 */
@Controller
public class GifController {

    @Autowired
    private GifRepository gifReposytory;

    @GetMapping("/")
    public String listGifs(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifReposytory.getAllGifs());
        return "home";
    }

    @GetMapping("/favorites")
    public String getFavorites(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifReposytory.getFavorites());
        return "favorites";
    }

    @GetMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifReposytory.findByName(name);
        modelMap.addAttribute("gif", gif);
        return "gif-details";
    }

}
