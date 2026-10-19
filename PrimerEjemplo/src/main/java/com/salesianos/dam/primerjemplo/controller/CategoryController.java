package com.salesianos.dam.primerjemplo.controller;

<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/controller/CategoryController.java
import com.salesianos.dam.primerjemplo.dto.GetCategoryDTO;
=======
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/controller/CategoryController.java
import com.salesianos.dam.primerjemplo.model.Category;
import com.salesianos.dam.primerjemplo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/controller/CategoryController.java
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/controller/CategoryController.java

import java.util.List;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @GetMapping
<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/controller/CategoryController.java
    public ResponseEntity<List<GetCategoryDTO>> getAllCategories() {

        List<Category> result = categoryService.getAllCategories();
        return ResponseEntity.ok(
                result
                        .stream()
                        .map(GetCategoryDTO::of)
                        .toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetCategoryDTO> getCategoryById(@PathVariable Long id) {

        return ResponseEntity.ok(GetCategoryDTO.of(categoryService.getCategoryById(id)));

    }

    @PostMapping
    public ResponseEntity<GetCategoryDTO> addCategory(@RequestBody GetCategoryDTO category) {

        return ResponseEntity.status(201)
                .body(GetCategoryDTO.of(categoryService.addCategory(category)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GetCategoryDTO> updateCategory(
            @PathVariable Long id,
            @RequestBody GetCategoryDTO category) {

        return ResponseEntity.ok(
                GetCategoryDTO.of(categoryService.updateCategory(id, category)));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
=======
    public ResponseEntity<List<Category>> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAll());
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/controller/CategoryController.java
    }

}
