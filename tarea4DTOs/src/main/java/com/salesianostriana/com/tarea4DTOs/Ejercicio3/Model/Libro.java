package com.salesianostriana.com.tarea4DTOs.Ejercicio3.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro {
    private Long id;
    private String titulo;
    private String isbn;
    private Integer anioPublicacion;
    private Integer numeroPaginas;
    private Autor autor;
}