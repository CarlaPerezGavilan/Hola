package Tareas.T2_2_Pizzeria;

public class Ayudante extends Empleado{

    // Constructor por default
    public Ayudante(){}

    // Constructor con parametro
    public Ayudante(String nombre)
    {
        super(nombre);
    }

    // Método para ayuda a empacar
    public boolean pack(Pizza p)
    {
        p.state= "Empacando";
        return true;
    }

    // Método para ayudar a amasar
    public boolean Amasar(Pizza p){
        p.state= "Amasando";
        return true;
    }
    
}//Fin de clase