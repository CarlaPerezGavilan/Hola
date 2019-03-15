package Tareas.T2_2_Pizzeria;
public class SantaFe extends Sucursal{
    protected static SantaFe instance;
    
    public static SantaFe getInstance(Gerente gerente, Chef chef, Repartidor repartidor, Ayudante ayudante, Cajero cajero){
        if(instance== null){
            instance= new SantaFe(gerente, chef, repartidor, ayudante, cajero);
            name= "SantaFe";
            return instance;
        }
        return instance;
    }
    private SantaFe(Gerente gerente, Chef chef, Repartidor repartidor, Ayudante ayudante, Cajero cajero)
    {
        super(gerente, chef, repartidor, ayudante, cajero);
        typePizza[0]= new Vegetariana();

        int temporal = typePizza[0].countIngredient+super.contIngredients;
        for(int i=super.contIngredients; i<temporal; i++)
            super.addIngredients(typePizza[0].getIngredient(i));
        
        super.addIngredients("Nutella");
    }

}