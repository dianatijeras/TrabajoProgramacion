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


//"LOG" registra informacion de las pruebas
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());


//cada metodo de prueba incluye assertion utilizando los metodos de asercion proporcionados por JUnit, como assertEquals y assertThrows, para verificar el comportamiento esperado de la clase Mascota


    /**
     *Prueba que la clase Mascota almacene y recupere los datos correctamente
     */

    @Test
    public void datosCompletos(){
        System.out.println("Inicio de prueba de datos completos");
        //Almacenar los datos de prueba 1|Duna|perro|border collie|1|femenino|Cafe y blanco|12.5
        Mascota mascota = new Mascota("1","Duna","Perro","Border Collie",(byte)1,"Femenino","Cafe y Blanco",(float)12.5);

        //Recuperacion y verificacion de datos
        assertEquals("1", mascota.id());
        assertEquals("Duna",mascota.nombre());
        assertEquals("Perro",mascota.especie());
        assertEquals("Border Collie",mascota.raza());
        assertEquals((byte)1,mascota.edad());
        assertEquals("Femenino",mascota.genero());
        assertEquals("Cafe y Blanco",mascota.color());
        assertEquals((float)12.5,mascota.peso());

        System.out.println("Mascota creada con exito:\nID: " + mascota.id() + "\nNombre: " + mascota.nombre() + "\nEspecie:" + mascota.especie() + "\nRaza: " + mascota.raza() + "\nEdad: " + mascota.edad() + "\nGenero: " + mascota.genero() + "\nColor: " + mascota.color() + "\nPeso: " + mascota.peso());
    
    }

    /*
    * Prueba que la clase Mascota valide que se ingresen los datos nulos
    */
    @Test
    public void datosNulos(){
        System.out.println("Inicio de prueba de datos nulos");
        //Almacenar los datos de prueba null|null|null|null|0|null|null|0
        assertThrows(Throwable.class, ()-> new Mascota (null,null,null,null,(byte)0, null,null,(float)0));

        System.out.println("Error, faltan datos para la creacion de la Mascota");
    }
        
    /*
    *Prueba que la clase Mascota valide que se ingresen datos vacios
    */
    @Test
    public void datosVacios(){
        System.out.println("Inicio de prueba datos vacios");
        //Almacenar los datos de prueba ""|""|""|""|0|""|""|0
        assertThrows(Throwable.class, ()-> new Mascota ("","","","",(byte)0,"","",(float)0));

        System.out.println("Error, falta de datos para la creacion de la Mascota");
    }
    /*
    *Prueba que la clase Mascota valide el ingreso de peso negativo
    */
    @Test
    public void pesoNegativo(){
        System.out.println("Inicio  de prueba peso negativo");
        //Almacenar los datos de prueba 1|Duna|perro|border collie|1|femenino|Cafe y blanco|-2.3
        assertThrows(Throwable.class, ()-> new Mascota ("1","Duna","Perro","Border Collie",(byte)1,"Femenino","Cafe y Blanco",(float)-2.3 ));

        System.out.println("Error, falta de datos para la creacion de la Mascota");
    }

    /*
    *Prueba que la clase Mascota valide el ingreso de genero invalido
    */
    @Test
    public void generoInvalido(){
        System.out.println("Inicio de prueva de genero invalido");
        //Almacenar los datos de prueba  1|Duna|perro|border collie|1|mujer|Cafe Y blanco|12.5
        assertThrows(Throwable.class, ()-> new Mascota ("1","Duna","Perro","Border Collie",(byte)1,"Mujer","Cafe y Blanco",(float)12.5));

        System.out.println("Error, falta de datos para la creacion de la Mascota");
    }



}
