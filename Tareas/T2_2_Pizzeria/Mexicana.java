package Tareas.T2_2_Pizzeria;

public class Mexicana extends Pizza{
    public Mexicana(){
        addIngredient("Frijoles");
        addIngredient("Queso");
        addIngredient("Chorizo");
        super.typePizza="Mexicana";
    }
}