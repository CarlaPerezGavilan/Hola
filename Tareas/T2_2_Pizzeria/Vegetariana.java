package Tareas.T2_2_Pizzeria;

public class Vegetariana extends Pizza{
    public Vegetariana(){
        addIngredient("Vegetales");
        addIngredient("Queso bajo en grasa");
        super.typePizza="Vegetariana";
    }
}