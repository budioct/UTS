package com.budhioct.api.service

import com.budhioct.api.entity.Category

interface CategoryService{
    List<Category>findAll()

    Category findById(int id)
}