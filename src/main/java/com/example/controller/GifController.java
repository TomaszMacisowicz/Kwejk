package com.example.controller;

import com.example.gifDao.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Macu on 2017-03-31.
 */
@Controller
public class GifController {

    @Autowired
    private GifRepository gifReposytory;


    @RequestMapping("/")
    private String listGifs(){
        return "home";
    }


    @RequestMapping("/gif/(name)")
    public String gif(ModelMap modelMap) {
       List<Gif> allGifs = gifReposytory.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }


    @RequestMapping
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", "michalos", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
