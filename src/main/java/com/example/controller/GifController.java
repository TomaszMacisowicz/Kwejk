package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Macu on 2017-03-31.
 */
@Controller
public class GifController {

    @GetMapping("/")
public String listGifs(){
        return "home";
    }
}
