package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {
    private static final Logger LOG = Logger.getLogger(CursoTest.class.getName());


    @Test
    public void datoscompletos() {
        LOG.info("Inicio de prueba datos completos");
        //Almacenar los datos de prueba programacion 1
        Curso curso = new Curso("programacion 1");

        //Verificacion de datos
        assertEquals("programacion 1", curso.getNombre());

        LOG.info("Curso creado con exito:"+curso.toString());
    }

    @Test
    public void registrarEstudiante() {
        LOG.info("Inicio de prueba datos completos");
        //Almacenar los datos de prueba programacion 1
        Curso curso = new Curso("programacion 1");
        Estudiante estudiante = new Estudiante("Juan", "Gomez Garcia", "102748220", "jgomez@gmail.com", "3228053387", (byte)20);

        curso.registrarEstudiante(estudiante);

        LOG.info("Curso creado con exito:"+curso.toString());
    }

    
}
