package com.trianasalesianos.dam.ejercicioDTOs.apartado2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    private Long id;
    private String nombre;
    private String desc;
    private Double pvp;
    private List<String> imagenes;
    private Categoria categoria;
}