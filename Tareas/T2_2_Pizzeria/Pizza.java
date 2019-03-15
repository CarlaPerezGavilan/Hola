package Tareas.T2_2_Pizzeria;
public abstract class Pizza{
    protected String state;
    protected String[] AllIngredients;
    protected String[] myIngredients;
    protected double[] priceIngredients;
    public int countIngredient;
    protected String typePizza;
    protected double price;
    protected Sucursal sucursalName; 

    public Pizza(){
        myIngredients= new String[5];
        countIngredient=0;
        AllIngredients = new String[]{"Queso bajo en grasa", "Queso", "Chorizo", "Frijoles", "Vegetales", "Piña", "Nutella"};
        priceIngredients = new double[]{40.50, 30.0, 25.50, 23.0, 20.0, 19.5, 18};
    }
    public final void addIngredient(String Ingredient){ 
        myIngredients[countIngredient++]=Ingredient;
    }
    public final String getIngredient(int i){
        return myIngredients[i];
    }

    public final String[] getIngredients(){
        return myIngredients;
    }

    public final double calculatePrice(){
        for(int a=0; a<countIngredient; a++){
        for(int i=0; i<AllIngredients.length; i++){
            if(myIngredients[a].equals(AllIngredients[i])){
                price+=priceIngredients[i]; 
        }
        }
        }
            return price;
        }
        
}


