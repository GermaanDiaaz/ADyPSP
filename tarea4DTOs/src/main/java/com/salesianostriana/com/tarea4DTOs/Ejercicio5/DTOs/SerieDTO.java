package com.salesianostriana.com.tarea4DTOs.Ejercicio5.DTOs;

import com.salesianostriana.com.tarea4DTOs.Ejercicio5.Model.Categoria;
import com.salesianostriana.com.tarea4DTOs.Ejercicio5.Model.Creador;
import com.salesianostriana.com.tarea4DTOs.Ejercicio5.Model.Serie;

public record SerieDTO(
        String titulo,
        Integer temporadas,
        String creador,
        String categoria,
        String imagenPrincipal
) {

    public static SerieDTO of(Serie serie) {

        if (serie == null) {
            return null;
        }

        String creadorNombreCompleto = "Creador desconocido";
        if (serie.getCreador() != null) {
            Creador c = serie.getCreador();
            String nombre = c.getNombre() != null ? c.getNombre() : "";
            String apellidos = c.getApellidos() != null ? c.getApellidos() : "";

            String armado = (nombre + " " + apellidos).trim();
            if (!armado.isBlank()) {
                creadorNombreCompleto = armado;
            }
        }

        String categoriaNombre = "Sin categoría";
        Categoria cat = serie.getCategoria();
        if (cat != null && cat.getNombre() != null) {
            categoriaNombre = cat.getNombre();
        }

        String imagenPrincipal = null;
        if (serie.getImagenes() != null && !serie.getImagenes().isEmpty()) {
            imagenPrincipal = serie.getImagenes().get(0);
        }

        return new SerieDTO(
                serie.getTitulo(),
                serie.getNumeroTemporadas(),
                creadorNombreCompleto,
                categoriaNombre,
                imagenPrincipal
        );
    }
}