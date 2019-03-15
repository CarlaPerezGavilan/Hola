package Tareas.T2_2_Pizzeria;
public class Personalizada extends Pizza{
    public Personalizada(String Ingredient1, String Ingredient2){
        addIngredient(Ingredient1);
        addIngredient(Ingredient2);
        super.typePizza="Personalizada";
    }
}