package com.budhioct.api.controller

import com.budhioct.api.entity.Category
import com.budhioct.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController{
    @Autowired
    private final CategoryService CategoryService
    
    @GetMapping('')
    List<Category> findAll(){
        CategoryService.findAll()
    }
}