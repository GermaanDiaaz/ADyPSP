package com.salesianostriana.com.tarea4DTOs.Ejercicio4.DTOs;

import com.salesianostriana.com.tarea4DTOs.Ejercicio4.Model.Cliente;
import com.salesianostriana.com.tarea4DTOs.Ejercicio4.Model.Habitacion;
import com.salesianostriana.com.tarea4DTOs.Ejercicio4.Model.Reserva;

public record ReservaDTO(
        String codigo,
        String cliente,
        String habitacion,
        Integer numeroNoches,
        Double precioTotal
) {

    public static ReservaDTO of(Reserva reserva) {

        if (reserva == null) {
            return null;
        }

        String clienteNombreCompleto = "Cliente no asignado";
        if (reserva.getCliente() != null) {
            Cliente c = reserva.getCliente();
            String nombre = c.getNombre() != null ? c.getNombre() : "";
            String apellidos = c.getApellidos() != null ? c.getApellidos() : "";

            String armado = (nombre + " " + apellidos).trim();
            if (!armado.isEmpty()) {
                clienteNombreCompleto = armado;
            }
        }

        String habitacionDescripcion = "Habitación no asignada";
        if (reserva.getHabitacion() != null) {
            Habitacion h = reserva.getHabitacion();
            String numero = h.getNumero() != null ? h.getNumero() : "";
            String tipo = h.getTipo() != null ? h.getTipo() : "";

            if (!numero.isEmpty() && !tipo.isEmpty()) {
                habitacionDescripcion = numero + " - " + tipo;
            } else if (!numero.isEmpty()) {
                habitacionDescripcion = numero;
            } else if (!tipo.isEmpty()) {
                habitacionDescripcion = tipo;
            }
        }

        Double precioTotal = null;
        if (reserva.getNumeroNoches() != null
                && reserva.getHabitacion() != null
                && reserva.getHabitacion().getPrecioNoche() != null) {

            precioTotal = reserva.getNumeroNoches() * reserva.getHabitacion().getPrecioNoche();
        }

        return new ReservaDTO(
                reserva.getCodigo(),
                clienteNombreCompleto,
                habitacionDescripcion,
                reserva.getNumeroNoches(),
                precioTotal
        );
    }
}