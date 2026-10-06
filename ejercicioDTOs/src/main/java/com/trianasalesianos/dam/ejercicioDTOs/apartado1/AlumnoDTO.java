package com.trianasalesianos.dam.ejercicioDTOs.apartado1;

public record AlumnoDTO (
        String nombre,
        String apellidos,
        String email,
        Curso curso,
        Direccion direccion
) {


    public static AlumnoDTO of(Alumno a){
        return new AlumnoDTO(
                a.getNombre(),
                a.getApellido1() + " "+ a.getApellido2(),
                a.getEmail(),
                a.getCurso().getNombre(),
                formatearDireccion(a.getDireccion())
        );

        private static String formatearDireccion(Direccion direccion){
            return "%s %s. CP %s (%s)".formatted(
                    direccion.getTipoVia(),
                    direccion.ge
            )

        }
    }
}