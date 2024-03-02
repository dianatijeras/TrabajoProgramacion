package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;


//Esta clase contiene pruebas unitaias para la clase veterinaria

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());


/*
 * prueba que la clase Mascota almacene y recupere los datos correctamente
 */

@Test
public void datosCompletosVeterinaria(){
    //Se imprime un mensaje indicando el inicio de la prueba
    System.out.println("Inicio de prueba datos completos");

    //Creacion de una nueva veterinaria
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

    //Verificacion de que el nombre de la veterinaria sea correcto
    assertEquals("Amigos Peludos", veterinaria.getNombre());

    //Se imprime un mensaje indicando que la Veterinaria se ha creado con exito
    System.out.println("Veterinaria creada con exito:" + veterinaria.getNombre());
}

/*
 * prueba que verifica que sea posible registrar a una nueva mascota
 */

@Test 
public void agregarNuevaMascota(){
    //Se imprime un mensaje indicando el inicio de la prueba
    System.out.println("Inicio de prueba agregar nueva mascota");

    //Creacion de una nueva veterinaria
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

    //Almacenar los datos de prueba 2|Pola|Perro|Jack Russell Terrier|4|femenino|Cafe y Blanco|10.2|

    //Creacion de una nueva mascota
    Mascota mascota = new Mascota("2", "Pola", "Perro", "Jack Russell Terrier", (byte)4, "femenino", "Cafe y Blanco", (float)10.2);

    //Registro de la mascota en la veterinaria
    veterinaria.registrarMascota(mascota);

    //verificar que la mascota se agrego correctamente
    assertTrue(veterinaria.getListaMascotas().contains(mascota));
    assertEquals(1, veterinaria.getListaMascotas().size());

    //Se imprime un mensaje indicando que la mascota se ha registrado en la vaterinarria correctamente
    System.out.println("Mascota registrada con exito:" + veterinaria.getListaMascotas());
    
    }
    
// prueba que valida que la clase veterinaria valide el ingreso de datos nulos
@Test
public void veterinariaNula(){
    //Se imprime un mensaje indicando el inicio de la prueba
    System.out.println("Inicio de prueba de datos nulos");

    //Verificacion de que se lanza una excepcion al intentar crear una veterinaria con nombre nulo
    assertThrows(Throwable.class, ()-> new Veterinaria(null));

    //Se imprime un mensaje indicando que faltan datos para la creacion de la veterinaria
    System.out.println("Error, faltan datos para la creacion de la Veterinaria");
    }

//prueba que valida el ingreso de una mascota repetida
@Test 
public void agregarMascotaRepetida(){
    //Se imprime un mensaje indicando el inicio de la prueba
    System.out.println("Inicio de prueba agregar nueva mascota");

    //Creacion de una nueva veterinaria
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

    //Almacenar los datos de prueba 2|Pola|Perro|Jack Russell Terrier|4|femenino|Cafe y Blanco|10.2|
    
    //Creacion de una nueva mascota
    Mascota mascota = new Mascota("2", "Pola", "Perro", "Jack Russell Terrier", (byte)4, "femenino", "Cafe y Blanco", (float)10.2);

    //Registro de la misma mascota dos veces en la veterinaria
    veterinaria.registrarMascota(mascota);
    veterinaria.registrarMascota(mascota);

    //verificar que la mascota se haya agregado correctamente una sola vez
    assertTrue(veterinaria.getListaMascotas().contains(mascota));
    assertEquals(1, veterinaria.getListaMascotas().size());

    //Se imprime un mensaje indicando que la mascota ya existe
    System.out.println("Error, esta mascota ya existe");
    }
    
}
