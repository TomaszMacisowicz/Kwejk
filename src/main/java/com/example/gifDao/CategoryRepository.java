package com.example.gifDao;

import org.apache.log4j.Category;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.List;


@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES= Array.asList(
            new Category(1,"funny"),
            new Category(2,"sport"),
            new Category(3,"it")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
    public Category findById(int id){
        for(Category category :ALL_CATEGORIES){
            if(category.getId()==id)
                return category;

        }
        return null;

    }

}
