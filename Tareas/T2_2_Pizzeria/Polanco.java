package Tareas.T2_2_Pizzeria;
public class Polanco extends Sucursal{
    protected static Polanco instance;
    
    public static Polanco getInstance(){
        if(instance== null){
            instance= new Polanco();
            name= "Polanco";
            return instance;
        }
        return instance;
    }
    private Polanco(){
        super();
        typePizza[0]= new Hawaiiana();
        typePizza[1]= new Mexicana();
        int temporal = typePizza[1].countIngredient+super.contIngredients;
        for(int i=super.contIngredients; i<temporal; i++){
            addIngredients(typePizza[1].getIngredient(i));
        }
        temporal = typePizza[0].countIngredient+super.contIngredients;
        for(int i=super.contIngredients; i<temporal; i++){
            super.addIngredients(typePizza[0].getIngredient(i));
        }
        super.addIngredients("Nutella");
    }
}
