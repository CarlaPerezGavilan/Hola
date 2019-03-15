package Tareas.T2_2_Pizzeria;
public class Gerente extends Empleado{
    public double totalSold;
    public int amountSold;
    public Gerente(){}
    public Gerente(String nombre){
        super(nombre);
    }

    protected static Gerente instance=null;

    public static Gerente getInstance(){
        if(instance== null){
            instance= new Gerente();
            return instance;
        }
        return instance;
    }

    public double getSoldPizzas(){
        return totalSold;
    }
    public int getAmountSold(){
        return amountSold;
    }
    public void registerPizza(double price){
        totalSold+=price;
        amountSold++;
    }
}