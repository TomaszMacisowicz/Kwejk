package com.example.gifDao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import com.example.model.Gif;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Ramacciotti", false,1),
            new Gif("ben-and-mike", "Ben Jakuben", true,1),
            new Gif("book-dominos", "Craig Dennis", false,1),
            new Gif("compiler-bot", "Ada Lovelace", true,2),
            new Gif("cowboy-coder", "Grace Hopper", false,2),
            new Gif("infinite-andrew", "Marissa Mayer", true,3)
    );
    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS){
            if ( gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif>findById(Integer id){
        for (Gif gif : ALL_GIFS){
            if ( gif.getCategoryId() == id ){

                return gif;
            }public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}