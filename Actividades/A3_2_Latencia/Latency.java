package Actividades.A3_2_Latencia;
import java.util.Random;

public class Latency{
    public static void simulateLarency(int initialValue, int finalValue){
        // formas de obtener la fecha: Calendar, Date o System
        // Date puede estar deprecated
        // System es estático, no hay que hacer instancia 
        Random r= new Random();
        int time = r.nextInt(finalValue-initialValue)+initialValue;
        long start = System.currentTimeMillis();
        while(true){
            System.out.print(".");
            long current = System.currentTimeMillis();
            if(start+time*1000 < current)
                break;
        }
    }
    public static void main(String[] args){
        Latency.simulateLarency(2, 15);
    }
}