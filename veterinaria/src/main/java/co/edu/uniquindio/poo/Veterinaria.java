package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> listaMascotas;

    //constructor de la clase Veterinaria
    public Veterinaria(String nombre){
        //Asegura que el nombre no sea nulo
        assert nombre != null : "debe llenar este espacio";

        //Inicializa el nombre y la lista de mascotas
        this.nombre = nombre;
        this.listaMascotas = new LinkedList<Mascota>();
    }

    //Metodo para obtener el nombre de la Veterinaria
    public String getNombre(){
        return nombre;
    }
    
    //Metodo para obtener una coleccion no modificable de mascotas, con unmodifiableCollection no se puede modificar el espacio de memorio pero si se pueden añadir objetos
    public Collection<Mascota> getListaMascotas(){
        return Collections.unmodifiableCollection(listaMascotas);
    }

    //metodo para registrar una nueva mascota
    public void registrarMascota (Mascota mascota){
        //Verifica que el ID de la mascota no exista ya en la lista
        assert verificarId(mascota.id()) == false : "El ID de la mascota ya existe" + mascota.id() + "No se pudo agregar la mascota";
        //Agrega la mascota a la lista
        listaMascotas.add(mascota);
    }

    //Metodo para verificar si un ID de una mascota ya existe en la lista
    public boolean verificarId(String id){
        boolean existeMascota = false;

        //Itera sobre la lista de mascotas
        for (Mascota mascota : listaMascotas){
            //Si encuentra una mascota con el mismo ID, establece existeMascota a verdadero
            if (mascota.id().equals(id)){
                existeMascota = true;
            }
        }
        return existeMascota;
    }

    //Metodo para obtener una coleccion de mascotas mayores de 10 años
    public Collection<Mascota> getMascotasMayores10(){
        Collection<Mascota> mascotasMayores10 = new LinkedList<>();

        //Itera sobre la lista mascotas 
        for (Mascota mascota : listaMascotas){

            //Si la edad de la mascota es mayor que 10, la agrega a la lista
            if (mascota.edad() > 10){
                mascotasMayores10.add(mascota);
            }
        }
        return mascotasMayores10;
    }
    
}

