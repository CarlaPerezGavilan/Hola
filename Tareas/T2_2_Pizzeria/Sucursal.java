package Tareas.T2_2_Pizzeria;
public abstract class Sucursal{
    protected String[] ingredient;
    protected Pizza[] typePizza;
    protected int contTypePizza;
    protected int contIngredients;
    // Empleados
    protected Chef chef;
    protected Repartidor repartidor;
    protected Cajero cajero;
    protected Ayudante ayudante; 
    protected Gerente gerente;

    protected static String name;

    public Sucursal(){
        ingredient = new String[20];
        typePizza = new Pizza[10];
        contIngredients=0;
    }

    public Sucursal(Gerente gerente, Chef chef, Repartidor repartidor, Ayudante ayudante, Cajero cajero){
        ingredient= new String[20];
        typePizza = new Pizza[10];
        contIngredients=0;
        this.gerente=gerente;
        this.chef=chef;
        this.repartidor=repartidor;
        this.ayudante= ayudante;
        this.cajero=cajero;
    }

    public void addIngredients(String ingrediente){
        ingredient[contIngredients++] = ingrediente;
    }

    public void addTypePizza(Pizza p){
       typePizza[contTypePizza++] = p;
    }

    public void register(Pizza p){
        gerente.registerPizza(p.price);
    }

    public String getIngredient(int i){
        return ingredient[i];
    }



}