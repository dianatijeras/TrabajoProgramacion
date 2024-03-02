package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VeterinariaTest {

    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());


/*
 * prueba que la clase Mascota almacene y recupere los datos correctamente
 */

@Test
public void datosCompletosVeterinaria(){
    System.out.println("Inicio de prueba datos completos");

    //Almacenar los datos de prueba "Amigos Peludos"
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

    //Verificacion de datos
    assertEquals("Amigos Peludos", veterinaria.getNombre());

    System.out.println("Veterinaria creada con exito:" + veterinaria.getNombre());
}

/*
 * prueba que verifica que sea posible registrar a una nueva mascota
 */

@Test 
public void agregarNuevaMascota(){
    System.out.println("Inicio de prueba agregar nueva mascota");

    //Almacenar los datos de prueba 2|Pola|Perro|Jack Russell Terrier|4|femenino|Cafe y Blanco|10.2|
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
    Mascota mascota = new Mascota("2", "Pola", "Perro", "Jack Russell Terrier", (byte)4, "femenino", "Cafe y Blanco", (float)10.2);

    veterinaria.registrarMascota(mascota);

    //verificar que la mascota se agrego correctamente
    assertTrue(veterinaria.getListaMascotas().contains(mascota));
    assertEquals(1, veterinaria.getListaMascotas().size());

    System.out.println("Mascota registrada con exito:" + veterinaria.getListaMascotas());
    
    }
    
@Test
public void veterinariaNula(){
    System.out.println("Inicio de prueba de datos nulos");

    //Almacenar los datos de prueba null
    assertThrows(Throwable.class, ()-> new Veterinaria(null));

    System.out.println("Error, faltan datos para la creacion de la Veterinaria");
    }

@Test 
public void agregarMascotaRepetida(){
    System.out.println("Inicio de prueba agregar nueva mascota");

    //Almacenar los datos de prueba 2|Pola|Perro|Jack Russell Terrier|4|femenino|Cafe y Blanco|10.2|
    Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
    Mascota mascota = new Mascota("2", "Pola", "Perro", "Jack Russell Terrier", (byte)4, "femenino", "Cafe y Blanco", (float)10.2);

    veterinaria.registrarMascota(mascota);
    veterinaria.registrarMascota(mascota);

    //verificar que la mascota se agrego correctamente
    assertTrue(veterinaria.getListaMascotas().contains(mascota));
    assertEquals(1, veterinaria.getListaMascotas().size());

    System.out.println("Error, esta mascota ya existe");
    }

}
