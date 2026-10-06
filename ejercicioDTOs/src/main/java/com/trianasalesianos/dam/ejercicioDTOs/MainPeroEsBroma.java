package com.trianasalesianos.dam.ejercicioDTOs;

import com.trianasalesianos.dam.ejercicioDTOs.apartado1.Curso;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MainPeroEsBroma {

    @PostConstruct
    public void main(){

        Curso c = Curso.builder()
                .id(1L)
                .nombre("Jose")


        System.out.println("Iniciar main de mentira...");
    }
}
