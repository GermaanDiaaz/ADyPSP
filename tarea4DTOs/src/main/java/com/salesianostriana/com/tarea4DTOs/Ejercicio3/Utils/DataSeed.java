package com.salesianostriana.com.tarea4DTOs.Ejercicio3.Utils;

import com.salesianostriana.com.tarea4DTOs.Ejercicio3.DTOs.LibroDTO;
import com.salesianostriana.com.tarea4DTOs.Ejercicio3.Model.Autor;
import com.salesianostriana.com.tarea4DTOs.Ejercicio3.Model.Libro;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    @PostConstruct
    public void initData() {

        Autor autor1 = Autor.builder()
                .id(1L)
                .nombre("Gabriel")
                .apellido1("García")
                .apellido2("Márquez")
                .nacionalidad("Colombiana")
                .build();

        Libro libro1 = Libro.builder()
                .id(1L)
                .titulo("Cien años de soledad")
                .isbn("978-0307474728")
                .anioPublicacion(1967)
                .numeroPaginas(471)
                .autor(autor1)
                .build();

        Autor autor2 = Autor.builder()
                .id(2L)
                .nombre("George")
                .apellido1("Orwell")
                .apellido2(null)
                .nacionalidad("Británica")
                .build();
        Libro libro2 = Libro.builder()

                .id(2L)
                .titulo("1984")
                .isbn("978-0451524935")
                .anioPublicacion(1949)
                .numeroPaginas(328)
                .autor(autor2)
                .build();

        Libro libro3 = Libro.builder()
                .id(3L)
                .titulo("Lazarillo de Tormes")
                .isbn("978-8424115456")
                .anioPublicacion(1554)
                .numeroPaginas(120)
                .autor(null)
                .build();

        Libro libro4 = null;

        System.out.println("=== COMPROBACIÓN TRANSFROMACIÓN LIBRO -> LIBRODTO ===");
        System.out.println("Con autor completo: " + LibroDTO.of(libro1));
        System.out.println("Sin segundo apellido: " + LibroDTO.of(libro2));
        System.out.println("Sin autor: " + LibroDTO.of(libro3));
        System.out.println("Libro null: " + LibroDTO.of(libro4));
        System.out.println("======================================================");

    }

}