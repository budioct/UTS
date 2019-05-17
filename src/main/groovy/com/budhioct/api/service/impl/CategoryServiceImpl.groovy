package com.budhioct.api.service.impl

import com.budhioct.api.entity.Category
import com.budhioct.api.repository.CategoryRepository
import com.budhioct.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CategoryServiceImpl implements CategoryService{

    @Autowired
    private final CategoryRepository CategoryRepository

    @Override
    List<Category> findAll(){
    CategoryRepository.findAll()
}
    @Override
    Category findById(int id) {
        CategoryRepository.findById(id)
    }

}