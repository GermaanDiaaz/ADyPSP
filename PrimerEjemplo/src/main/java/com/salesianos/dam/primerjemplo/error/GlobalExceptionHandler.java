package com.salesianos.dam.primerjemplo.error;

<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/error/GlobalExceptionHandler.java
=======
import com.salesianos.dam.primerjemplo.error.notfound.CategoryNotFoundException;
import com.salesianos.dam.primerjemplo.error.notfound.EntityNotFoundException;
import com.salesianos.dam.primerjemplo.error.notfound.ProductNotFoundException;
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/error/GlobalExceptionHandler.java
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.URI;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/error/GlobalExceptionHandler.java
    @ExceptionHandler(ProductNotFoundException.class)
    public ProblemDetail handleProductNotFound(ProductNotFoundException ex) {
=======
    @ExceptionHandler(EntityNotFoundException.class)
    public ProblemDetail handleProductNotFound(EntityNotFoundException ex) {
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/error/GlobalExceptionHandler.java

        ProblemDetail problem = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problem.setTitle("Recurso no encontrado");
        problem.setDetail(ex.getMessage());
<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/error/GlobalExceptionHandler.java
        problem.setType(URI.create("https://example.com/errors/product-not-found"));
=======
        problem.setType(URI.create("https://example.com/errors/not-found"));

        return problem;
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ProblemDetail handleCategoryNotFound(CategoryNotFoundException ex) {

        ProblemDetail problem = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problem.setTitle("Categoría no encontrada");
        problem.setDetail(ex.getMessage());
        problem.setType(URI.create("https://example.com/errors/category-not-found"));
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/error/GlobalExceptionHandler.java

        return problem;
    }

    @ExceptionHandler(InvalidProductException.class)
    public ProblemDetail handleInvalidProduct(InvalidProductException ex) {

        ProblemDetail problem = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problem.setTitle("Datos de producto inválidos");
        problem.setDetail(ex.getMessage());
        problem.setType(URI.create("https://example.com/errors/invalid-product"));

        return problem;
    }


}