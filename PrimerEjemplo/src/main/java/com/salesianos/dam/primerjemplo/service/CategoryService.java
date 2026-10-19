package com.salesianos.dam.primerjemplo.service;


<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/service/CategoryService.java
import com.salesianos.dam.primerjemplo.dto.GetCategoryDTO;
import com.salesianos.dam.primerjemplo.error.CategoryNotFoundException;
=======
import com.salesianos.dam.primerjemplo.error.notfound.CategoryNotFoundException;
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/service/CategoryService.java
import com.salesianos.dam.primerjemplo.model.Category;
import com.salesianos.dam.primerjemplo.repo.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/service/CategoryService.java
    public Category getAll(){
=======
    public List<Category> getAll(){
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/service/CategoryService.java
        List<Category> categories = categoryRepository.findAll();
        if  (categories.isEmpty()) {
            throw new CategoryNotFoundException();
        }

        return categories;
    }

    public Category getById(Long id){
        return categoryRepository.findById(id)
                .orElseThrow(CategoryNotFoundException::new);
    }

<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/service/CategoryService.java
    public Category addCategory(GetCategoryDTO category){
=======
    public Category addCategory(Category category){
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/service/CategoryService.java
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category category){
        if (!categoryRepository.existsById(id)) {
            throw new CategoryNotFoundException();
        }
        category.setName(category.getName());
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

}
