package com.salesianos.dam.primerejemplo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepo productRepo;

    @PostMapping
    public ResponseEntity<list>

    @GetMapping("/{name}")
    public ResponseEntity

    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deleteProduct (@PathVariableString name){

        //Idempotente
        productRepo.deleteProduct (name);
        return ResponseEntity.noContent().build();

        //No Idempotente
        /*if(productRepo.getProductByName(name).isEmpty()){
            return ResponseEntity.notFound().build();
        }

        productRepo.deleteProduct (name)
        return ResponseEntity.noContent().build();
        */
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> getFilteredProducts()
}
