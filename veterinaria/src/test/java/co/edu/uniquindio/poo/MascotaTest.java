/**
 * clase para probar el funcionamiento de veterinaria
 * @author Diana Garcia
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

//importaciones
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;


//conjunto de pruebas unitarias escritas con el framework JUnit para la clase Mascota


public class MascotaTest {
    //Definicion de un loggerpara la clase MascotaTest
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());


//cada metodo de prueba incluye assertion utilizando los metodos de asercion proporcionados por JUnit, como assertEquals y assertThrows, para verificar el comportamiento esperado de la clase Mascota


/**
*Prueba que la clase Mascota almacene y recupere los datos correctamente
*/

    @Test 
    public void datosCompletos(){
        //Se imprime un mensaje indicando el inicio de la prueba
        System.out.println("Inicio de prueba de datos completos");
        //Almacenar los datos de prueba 1|Duna|perro|border collie|1|femenino|Cafe y blanco|12.5

        //se crean datos de prueba para una mascota
        Mascota mascota = new Mascota("1","Duna","Perro","Border Collie",(byte)1,"Femenino","Cafe y Blanco",(float)12.5);

        //Recuperacion y verificacion de datos
        
        //Se realizan aserciones para verificar que los datos almacenados sean correctos
        assertEquals("1", mascota.id());
        assertEquals("Duna",mascota.nombre());
        assertEquals("Perro",mascota.especie());
        assertEquals("Border Collie",mascota.raza());
        assertEquals((byte)1,mascota.edad());
        assertEquals("Femenino",mascota.genero());
        assertEquals("Cafe y Blanco",mascota.color());
        assertEquals((float)12.5,mascota.peso());

        //Se imprime un mensaje indicando que la mascota se ha creado con exito
        System.out.println("Mascota creada con exito:\nID: " + mascota.id() + "\nNombre: " + mascota.nombre() + "\nEspecie:" + mascota.especie() + "\nRaza: " + mascota.raza() + "\nEdad: " + mascota.edad() + "\nGenero: " + mascota.genero() + "\nColor: " + mascota.color() + "\nPeso: " + mascota.peso());

    }

    /*
    * Prueba que la clase Mascota valide que se ingresen los datos nulos
    */
    @Test
    public void datosNulos(){
        //Se imprime un mensaje indicando el inicio de la prueba
        System.out.println("Inicio de prueba de datos nulos");
        //Almacenar los datos de prueba null|null|null|null|0|null|null|0

        //Se realiza una asercion para verificar que se lance una excepcion cuando se intenta crear una mascota con datos nulos
        assertThrows(Throwable.class, ()-> new Mascota (null,null,null,null,(byte)0, null,null,(float)0));

        //Se imprime un mensaje indicando que se ha producido un error porque faltan datos para la creacion de la mascota
        System.out.println("Error, faltan datos para la creacion de la Mascota");
    }
        
    /*
    *Prueba que la clase Mascota valide que se ingresen datos vacios
    */
    @Test
    public void datosVacios(){
        //Se imprime un mensaje indicando el inicio de la prueba
        System.out.println("Inicio de prueba datos vacios");
        //Almacenar los datos de prueba ""|""|""|""|0|""|""|0

        //Se realiza una asercion para verificar que se lance una excepcion cuando se intenta crear una mascota con datos vacios
        assertThrows(Throwable.class, ()-> new Mascota ("","","","",(byte)0,"","",(float)0));

        //Se imprime un mensaje indicando que se ha producido un error porque faltan datos para la creacion de la mascota
        System.out.println("Error, falta de datos para la creacion de la Mascota");
    }
    /*
    *Prueba que la clase Mascota valide el ingreso de peso negativo
    */
    @Test
    public void pesoNegativo(){
        //Se imprime un mensaje indicando el inicio de la prueba
        System.out.println("Inicio  de prueba peso negativo");
        //Almacenar los datos de prueba 1|Duna|perro|border collie|1|femenino|Cafe y blanco|-2.3

        //Se realiza una asercion para verificar que se lance una excepcion cuando se intenta crear una mascotacon peso negativo
        assertThrows(Throwable.class, ()-> new Mascota ("1","Duna","Perro","Border Collie",(byte)1,"Femenino","Cafe y Blanco",(float)-2.3 ));

        //Se imprime un mensaje indicando que se ha producido un error porque faltan datos para la creacion de la mascota
        System.out.println("Error, falta de datos para la creacion de la Mascota");
    }

    /*
    *Prueba que la clase Mascota valide el ingreso de genero invalido
    */
    @Test
    public void generoInvalido(){
        //Se imprime un mensaje indicando el inicio de la prueba
        System.out.println("Inicio de prueva de genero invalido");
        //Almacenar los datos de prueba  1|Duna|perro|border collie|1|mujer|Cafe Y blanco|12.5

        //Se realiza una asercion para verificar que se lance una excepcion cuando se intenta crear una mascota con un genero invalido
        assertThrows(Throwable.class, ()-> new Mascota ("1","Duna","Perro","Border Collie",(byte)1,"Mujer","Cafe y Blanco",(float)12.5));

        //Se imprime un mensaje indicando que se ha producido un error porque faltan datos para la creacion de la mascota
        System.out.println("Error, falta de datos para la creacion de la Mascota");
    }
    
}
