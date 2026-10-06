package com.trianasalesianos.dam.ejercicioDTOs.apartado2;

import org.springframework.util.CollectionUtils;

import java.util.List;

public record ProductoDTO(
        String nombre,
        Double pvp,
        List<String> imagenes,
        Categoria categoria
) {

    public static ProductoDTO of(Producto p){
        if (p == null) {

            return null;
        }
        return new ProductoDTO(
                p.getNombre(),
                p.getPvp(),
                CollectionUtils.isEmpty(p.getImagenes()) ? null : p.getImagenes(),
                p.getCategoria() != null ? p.getCategoria().getNombre() : null

        )

    }


        public Producto to(){
        return Producto.builder()
                .nombre(nombre)
                .pvp(pvp)
                .imagenes(imagenes)
                .categoria(categoria)
                .build();
    }
}
