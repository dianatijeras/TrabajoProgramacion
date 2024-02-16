package co.edu.uniquindio.poo;


public record Estudiante(String nombre, String apellido, String numeroIdentificacion, String correo, String telefono, byte edad) {

    public Estudiante{
        assert nombre != null;
        assert apellido != null;
        assert numeroIdentificacion != null;
        assert correo != null && correo.contains("@") ;
        assert telefono != null;
        assert edad >= 0;
    }


    
}
