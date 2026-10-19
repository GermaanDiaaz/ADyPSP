package com.salesianos.dam.primerjemplo.utils;

import com.salesianos.dam.primerjemplo.service.CategoryService;
import com.salesianos.dam.primerjemplo.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final CategoryService categoryService;
    private final ProductService productService;

    @PostConstruct
    public void initData() {

<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/utils/DataSeed.java
        Category cat1 = categoryService.addCategory(new EditCategoryDto("Electrónica"));
        Category cat2 = categoryService.addCategory(new EditCategoryDto("Ropa"));
        Category cat3 = categoryService.addCategory(new EditCategoryDto("Hogar"));

        productService.addProduct(new EditProductDto("Portátil Polluo", 999.99, cat1.getId()));
        productService.addProduct(new EditProductDto("Camiseta Friki", 19.99, cat2.getId()));
        productService.addProduct(new EditProductDto("Silla anti chepa", 29.50, cat3.getId()));

=======
        /*
            Invocar a los servicios para insertar
            datos de ejemplo
         */
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/utils/DataSeed.java

    }

}
