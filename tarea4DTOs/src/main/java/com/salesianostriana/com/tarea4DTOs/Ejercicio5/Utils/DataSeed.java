package com.salesianostriana.com.tarea4DTOs.Ejercicio5.Utils;

import com.salesianostriana.com.tarea4DTOs.Ejercicio5.DTOs.SerieDTO;
import com.salesianostriana.com.tarea4DTOs.Ejercicio5.Model.Categoria;
import com.salesianostriana.com.tarea4DTOs.Ejercicio5.Model.Creador;
import com.salesianostriana.com.tarea4DTOs.Ejercicio5.Model.Serie;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeed {


    @PostConstruct
    public void initData() {

        Creador creador1 = Creador.builder()
                .id(1L)
                .nombre("Vince")
                .apellidos("Gilligan")
                .pais("EEUU")
                .build();

        Categoria catDrama = Categoria.builder()
                .id(1L)
                .nombre("Drama")
                .descripcion("Series de drama intenso")
                .build();

        Serie serieCompleta = Serie.builder()
                .id(1L)
                .titulo("Breaking Bad")
                .sinopsis("Un profesor de química...")
                .numeroTemporadas(5)
                .creador(creador1)
                .categoria(catDrama)
                .imagenes(List.of("https://img.com/bb1.jpg", "https://img.com/bb2.jpg"))
                .build();

        Serie serieSinCategoria = Serie.builder()
                .id(2L)
                .titulo("Better Call Saul")
                .sinopsis("La historia de Jimmy McGill")
                .numeroTemporadas(6)
                .creador(creador1)
                .categoria(null)
                .imagenes(List.of("https://img.com/bcs1.jpg"))
                .build();

        Serie serieSinImagenes = Serie.builder()
                .id(3L)
                .titulo("El Camino")
                .sinopsis("Película secuela")
                .numeroTemporadas(1)
                .creador(creador1)
                .categoria(catDrama)
                .imagenes(null)
                .build();

        Serie serieImagenesVacia = Serie.builder()
                .id(4L)
                .titulo("Serie Misteriosa")
                .sinopsis("Sin imágenes disponibles")
                .numeroTemporadas(1)
                .creador(creador1)
                .categoria(catDrama)
                .imagenes(List.of())
                .build();

        Serie serieNull = null;

        System.out.println("=== COMPROBACIÓN TRANSFORMACIÓN SERIE -> SERIEDTO ===");
        System.out.println("Serie Completa: " + SerieDTO.of(serieCompleta));
        System.out.println("Sin Categoría: " + SerieDTO.of(serieSinCategoria));
        System.out.println("Sin Imágenes (null): " + SerieDTO.of(serieSinImagenes));
        System.out.println("Lista Imágenes Vacía: " + SerieDTO.of(serieImagenesVacia));
        System.out.println("Serie Null: " + SerieDTO.of(serieNull));
        System.out.println("=====================================================");

    }
}