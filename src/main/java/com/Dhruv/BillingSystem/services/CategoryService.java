package com.Dhruv.BillingSystem.services;

import com.Dhruv.BillingSystem.DTO.category.CategoryDTO;
import com.Dhruv.BillingSystem.entities.Category;
import com.Dhruv.BillingSystem.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());

        categoryRepository.save(category);
        return category;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        Optional<Category> opt = categoryRepository.findById(id);
        return opt.orElse(null);
    }

    public Category updateCategoryById(Long id, CategoryDTO categoryDTO) {
        Category category = getCategoryById(id);
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());

        categoryRepository.save(category);
        return category;
    }

    public String deleteCategory(Long id) {
        Category category = getCategoryById(id);
        category.setDeleted(true);

        categoryRepository.save(category);
        return "Deleted Successfully";
    }
}

