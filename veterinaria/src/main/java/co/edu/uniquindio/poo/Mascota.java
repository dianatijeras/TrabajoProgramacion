package co.edu.uniquindio.poo;

// este codigo define un registro Mascota con campos que tienen valores especificos y un constructor que valida ciertas condiciones sobre los valores de los campos al instanciar un objeto Mascota

//Declaracion del registro (record) Mascota que tiene dentro de los paranetesis sus atributos

public record Mascota(String id, String nombre, String especie, String raza, byte edad, String genero, String color, float peso) {
    //constructor que se ejecuta cuando se crea una instancia de Mascota. 
// assertions: validan que los campos no sean nulos y que ciertos campos tengan valores especificos

public Mascota {

    assert id != null && id.isBlank() : "debe llenar este espacio";
    assert nombre != null && !nombre.isBlank() : "debe llenar este espacio";
    assert especie != null && !especie.isBlank() : "debe llenar este espacio";
    assert raza != null && !raza.isBlank() : "debe llenar este espacio";
    assert edad >= 0 :"la edad debe ser mayor a 0";
    //toLowerCase() convierte la cadena genero a minusculas antes de verificar si contiene "femenino" o "masculino". por lo tanto, si el usuario ingresa "Femenino","femenino","Masculino" o "masculino", al convertir estas cadenas a minuscula, todas se veran igual: "femenino" o "masculino"
    assert genero != null && genero.toLowerCase().contains("femenino") || genero.toLowerCase().contains("masculino");
    assert color != null && !color.isBlank() : "debe llenar este espacio";
    assert peso >= 0 : "el peso debe ser mayor o igual a 0";
}
    
}
