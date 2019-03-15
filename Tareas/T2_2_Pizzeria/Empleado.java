package Tareas.T2_2_Pizzeria;

public class Empleado{
    protected String name; 
    protected Sucursal sucursal;

    public Empleado(){

    }
    public Empleado(String name){
        this.name=name;
    }

    public void Hired(Sucursal sucursal){
        this.sucursal=sucursal;
    }
}