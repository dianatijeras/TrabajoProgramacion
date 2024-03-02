package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> listaMascotas;

    public Veterinaria(String nombre){
        assert nombre != null : "debe llenar este espacio";

        this.nombre = nombre;
        this.listaMascotas = new LinkedList<Mascota>();
    }

    public String getNombre(){
        return nombre;
    }
    
    public Collection<Mascota> getListaMascotas(){
        return Collections.unmodifiableCollection(listaMascotas);
    }

    public void registrarMascota (Mascota mascota){
        assert verificarId(mascota.id()) == false : "El ID de la mascota ya existe" + mascota.id() + "No se pudo agregar la mascota";
        listaMascotas.add(mascota);
    }

    public boolean verificarId(String id){
        boolean existeMascota = false;

        for (Mascota mascota : listaMascotas){
            if (mascota.id().equals(id)){
                existeMascota = true;
            }
        }
        return existeMascota;
    }

    public Collection<Mascota> getMascotasMayores10(){
        Collection<Mascota> mascotasMayores10 = new LinkedList<>();

        for (Mascota mascota : listaMascotas){
            if (mascota.edad() > 10){
                mascotasMayores10.add(mascota);
            }
        }
        return mascotasMayores10;
    }
    
}
