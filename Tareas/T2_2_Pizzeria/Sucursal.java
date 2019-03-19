package Tareas.T2_2_Pizzeria;

public abstract class Sucursal{
    protected String[] ingredient;
    protected Pizza[] typePizza;
    protected int contTypePizza;
    protected int contIngredients;
    // Empleados
    protected Empleado[] empleados;

    protected static String name;

    public Sucursal(){
        ingredient = new String[20];
        typePizza = new Pizza[10];
        contIngredients=0;
        empleados = new Empleado[10];
        empleados[0]= new Cajero();
        empleados[1] = new Repartidor();
        empleados[2] = new Ayudante();
        empleados[3] = new Gerente();
        empleados[4] = new Chef();
    }

    public Sucursal(Gerente gerente, Chef chef, Repartidor repartidor, Ayudante ayudante, Cajero cajero){
        ingredient= new String[20];
        typePizza = new Pizza[10];
        contIngredients=0;
        empleados= new Empleado[10];
        empleados[0]= cajero;
        empleados[1] = repartidor;
        empleados[2] = ayudante;
        empleados[3] = gerente;
        empleados[4] = chef;
    }

    public Empleado getEmpleado(int i){
        return empleados[i];
    }

    public void addIngredients(String ingrediente){
        ingredient[contIngredients++] = ingrediente;
    }

    public void addTypePizza(Pizza p){
       typePizza[contTypePizza++] = p;
    }

    public void register(Pizza p){
        empleados[3].registerPizza(p.price);
    }

    public String getIngredient(int i){
        return ingredient[i];
    }



}