package com.salesianostriana.com.tarea4DTOs.Ejercicio4.Utils;

import com.salesianostriana.com.tarea4DTOs.Ejercicio4.DTOs.ReservaDTO;
import com.salesianostriana.com.tarea4DTOs.Ejercicio4.Model.Cliente;
import com.salesianostriana.com.tarea4DTOs.Ejercicio4.Model.Habitacion;
import com.salesianostriana.com.tarea4DTOs.Ejercicio4.Model.Reserva;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {


    @PostConstruct
    public void initData() {

        Cliente cliente1 = Cliente.builder()
                .id(1L)
                .nombre("Juan")
                .apellidos("Pérez Gómez")
                .email("juan@email.com")
                .build();

        Habitacion hab1 = Habitacion.builder()
                .id(1L)
                .numero("204")
                .tipo("Doble")
                .precioNoche(50.0)
                .planta(2)
                .build();

        Reserva res1 = Reserva.builder()
                .id(1L)
                .codigo("RES-001")
                .numeroNoches(3)
                .cliente(cliente1)
                .habitacion(hab1)
                .build();

        Reserva res2 = Reserva.builder()
                .id(2L)
                .codigo("RES-002")
                .numeroNoches(2)
                .cliente(null)
                .habitacion(hab1)
                .build();

        Reserva res3 = Reserva.builder()
                .id(3L)
                .codigo("RES-003")
                .numeroNoches(4)
                .cliente(cliente1)
                .habitacion(null)
                .build();

        Reserva res4 = Reserva.builder()
                .id(4L)
                .codigo("RES-004")
                .numeroNoches(null)
                .cliente(cliente1)
                .habitacion(hab1)
                .build();

        Reserva res5 = null;

        System.out.println("=== COMPROBACIÓN TRANSFROMACIÓN RESERVA -> RESERVADTO ===");
        System.out.println("Reserva Completa: " + ReservaDTO.of(res1));
        System.out.println("Sin Cliente: " + ReservaDTO.of(res2));
        System.out.println("Sin Habitación: " + ReservaDTO.of(res3));
        System.out.println("Sin Noches: " + ReservaDTO.of(res4));
        System.out.println("Reserva Null: " + ReservaDTO.of(res5));
        System.out.println("==========================================================");

    }
}