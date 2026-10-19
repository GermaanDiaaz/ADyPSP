package com.salesianos.dam.primerjemplo.dto;

<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/dto/GetProductList.java
=======

>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/dto/GetProductList.java
import com.salesianos.dam.primerjemplo.model.Product;

public record GetProductList(
        Long id,
        String name,
<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/dto/GetProductList.java
        Double price
) {

    public static GetProductList of(Product p) {

        return new GetProductList(p.getId(), p.getName(), p.getPrice());
=======
        Double price,
        String categoryName
) {


    public static GetProductList of(Product pr) {
        return new GetProductList(pr.getId(), pr.getName(), pr.getPrice(), pr.getDetails());
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/dto/GetProductList.java
    }



<<<<<<< HEAD:01_PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/dto/GetProductList.java

=======
>>>>>>> 806e0dd887a4fca7fed856213e2155e2b3f93080:PrimerEjemplo/src/main/java/com/salesianos/dam/primerjemplo/dto/GetProductList.java
}

