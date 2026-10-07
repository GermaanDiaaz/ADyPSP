package com.salesianostriana.com.tarea4DTOs.Ejercicio3.DTOs;

import com.salesianostriana.com.tarea4DTOs.Ejercicio3.Model.Libro;
import com.salesianostriana.com.tarea4DTOs.Ejercicio3.Model.Autor;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record LibroDTO(
        String titulo,
        String isbn,
        String autor,
        Integer anioPublicacion
) {
    public static LibroDTO of(Libro libro) {
        if (libro == null) {
            return null;
        }
        String nombreCompletoAutor = "Autor desconocido";

        if (libro.getAutor() != null) {
            Autor a = libro.getAutor();

            String nombreArmado = Stream.of(a.getNombre(), a.getApellido1(), a.getApellido2())
                    .filter(Objects::nonNull)
                    .filter(s -> !s.isBlank())
                    .collect(Collectors.joining(" "));

            if (!nombreArmado.isBlank()) {
                nombreCompletoAutor = nombreArmado;
            }
        }

        return new LibroDTO(
                libro.getTitulo(),
                libro.getIsbn(),
                nombreCompletoAutor,
                libro.getAnioPublicacion()
        );
    }
}
