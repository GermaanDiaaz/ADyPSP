package com.salesianos.dam.primerjemplo.dto;

import com.salesianos.dam.primerjemplo.model.Category;

import java.util.List;

public record GetCategoryDTO(
        Long id,
        String name
) {
    public static GetCategoryDTO of(Category category) {
        return new GetCategoryDTO(
                category.getId(),
                category.getName()
        );
    }
}