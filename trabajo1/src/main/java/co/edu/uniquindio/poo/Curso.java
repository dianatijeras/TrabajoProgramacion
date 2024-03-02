package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

//Almacenar la información de VARIOS estudiantes, incluyendo su número de identificación (sin repetir), nombres, apellidos, correo, teléfono y edad. Desea listar los estudiantes en orden alfabético y en orden descendente según la edad. También desea obtener la lista de los estudiantes menores de edad.

public class Curso  {
    private final String nombre;
    private final Collection<Estudiante> listaEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiante>(); //LinkedList es una lista enlazada
    }

    // set para modificar y get para obtener

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {  // el set funciona para modificar el valor de un atributo y el void no devuelve nada, en este caso no sirve porque el atributo es de tipo final
        this.nombre = nombre;
    }
    public Collection<Estudiante> getListaEstudiantes() {
        return Collections.unmodifiableCollection(listaEstudiantes);
    }

    //falta terminar metodo
    public Collection<Estudiante> estudiantesOrdenAlfabetico() {
        return null;

    }

    //agregar estudiante con diferente numero de identificacion
    public void registrarEstudiante (Estudiante estudiante){
        assert verificarNumeroIdentificacion(estudiante.numeroIdentificacion()) == false : "ya existe un estudiante con ese numero de identificacion" + estudiante.numeroIdentificacion();
        listaEstudiantes.add(estudiante);
    }

    //este metodo tiene que verificar que el numero de identificacion del estudiante que se vaya a registrar no sea igual al numero de identificacion de otro estudiante
   
   /**
    * 
    * @param numeroIdentificacion
    * @return
    */
    public boolean verificarNumeroIdentificacion(String numeroIdentificacion){
        boolean existeEstudiante = false;

        for (Estudiante estudiante : listaEstudiantes){
            if (estudiante.numeroIdentificacion().equals(numeroIdentificacion)){
                existeEstudiante = true;
            }
        }
        return existeEstudiante;

    }
    


}
