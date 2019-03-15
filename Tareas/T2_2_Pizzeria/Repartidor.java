package Tareas.T2_2_Pizzeria;
import java.util.Random;

public class Repartidor extends Empleado{
    public Repartidor(){}
    public Repartidor(String name){
        super(name);
    }
    public void deliverPizza(String location, Pizza p){
        if(p.state.equals("lista para entrega")){
            p.state= "en proceso de entrega";
            System.out.println("REPARTIDOR: entregando pizza "+location);
            super.sucursal.register(p);
            Random r= new Random();
            int time = r.nextInt(3-2)+2;
            long start = System.currentTimeMillis();
            System.out.println("LOADING... ");
            while(true){
                long current = System.currentTimeMillis();
                if(start+time*1000 < current)
                break;
            }   
        }
       
    }    
}