/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * verificar que la clase Estuduante almacene los datos
     */
    @Test
    public void datoscompletos() {
        LOG.info("Inicio de prueba datos completos");
        //Almacenar los datos de prueba Juan|Gomez Garcia|102748220|jgomez@gmail.com|3228053387|20
        Estudiante estudiante = new Estudiante("Juan", "Gomez Garcia", "102748220", "jgomez@gmail.com", "3228053387", (byte)20);

        //Verificacion de datos
        assertEquals("Juan",estudiante.nombre());
        assertEquals("Gomez Garcia", estudiante.apellido());
        assertEquals("102748220", estudiante.numeroIdentificacion());
        assertEquals("jgomez@gmail.com", estudiante.correo());
        assertEquals("3228053387", estudiante.telefono());
        assertEquals((byte)20, estudiante.edad());

        LOG.info("Estudiante creado con exito:"+estudiante.toString());
    }

     /**
     * verificar que la clase Estuduante valide el ingreso de datos nulos
     */
    @Test
    public void datosnulos() {
        LOG.info("Inicio de prueba datos nulos");
        //Almacenar los datos de prueba null|null|null|null|null|0

        //Expresión que crea un nuevo objeto Estudiante con parámetros nulos.
        //expresión que crea un nuevo objeto Estudiante con parámetros nulos. 
        //assertThrows se utiliza para verificar que una operación arroje una excepción esperada durante las pruebas unitarias en Java.

        assertThrows(Throwable.class, ()-> new Estudiante (null,null,null,null,null,(byte)0));

        LOG.info("Error, falta de datos para la creacion del estudiante.");
    }

    /**
     * verificar que la clase Estudiante valide el ingreso de datos vacios
     */
    @Test
    public void datosVacios(){
        LOG.info("Inicio de prueba datos vacios");
        //Almacenar los datos de prueba ""|""|""|""|""|0

        assertThrows(Throwable.class, ()-> new Estudiante ("","","","","",(byte)0));

        LOG.info("Error, falta de datos para la creacion del estudiante.");
    }

    /**
     * verificar que la clase Estudiante valide el ingreso de edades negativas
     */
    @Test
    public void edadNegativa(){
        LOG.info("Inicio de prueba edad negativa");
        //Almacenar los datos de prueba Juan|Gomez Garcia|102748220|jgomez@gmail.com|3228053387|-20

        assertThrows(Throwable.class, ()-> new Estudiante("Juan","Gomez Garcia","102748220","jgomez@gmail.com","3228053387",(byte)-20));

        LOG.info("Error, falta de datos para la creacion del estudiante.");
    }

    /**
     * verificar que la clase Estudiante valide el ingreso de correo invalido
     */
    @Test
    public void correoInvalido(){
        LOG.info("Inicio de prueba correo invalido");
        //Almacenar los datos de prueba Juan|Gomez Garcia|102748220|jgomez|3228053387|20

        assertThrows(Throwable.class, ()-> new Estudiante ("Juan","Gomez Garcia","102748220","jgomez","3228053387",(byte)20));

        LOG.info("Error, falta de datos para la creacion del estudiante.");
    }

}
