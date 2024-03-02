package co.edu.uniquindio.poo;

//Almacenar la información de VARIOS estudiantes, incluyendo su número de identificación (sin repetir), nombres, apellidos, correo, teléfono y edad. Desea listar los estudiantes en orden alfabético y en orden descendente según la edad. También desea obtener la lista de los estudiantes menores de edad.

public record Estudiante(String nombre, String apellido, String numeroIdentificacion, String correo, String telefono, byte edad) {

    public Estudiante{
        assert nombre != null && !nombre.isBlank(): "el nombre debe ser diferente de vacio";
        assert apellido != null && apellido.isBlank(): "el apellido debe ser diferente de vacio";
        assert numeroIdentificacion != null && !numeroIdentificacion.isBlank(): "el numero de identidad debe ser diferente de vacio";
        assert correo != null && correo.contains("@") : "el correo electronico debe contener un @";
        assert telefono != null : "el telefono no puede ser null";
        assert edad >= 0 : "la edad debe ser mayor a cero";
    }

    

    
}
