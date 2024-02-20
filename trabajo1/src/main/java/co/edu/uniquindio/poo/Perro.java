package co.edu.uniquindio.poo;

public record Perro(String nombre, String raza) {

    public Perro{
        
    }
    
    public void caminar(int metros){
        System.out.println("el perro camino" + metros + metros + metros + "metros");
    }


    
}
