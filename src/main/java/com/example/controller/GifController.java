package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Macu on 2017-03-31.
 */
@Controller
public class GifController {

    @GetMapping("/")
public String listGifs(){
        return "home";
    }
    @PostMapping
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", "michalos", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
