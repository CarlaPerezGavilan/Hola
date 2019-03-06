package Actividades.A4_2_Singleton;

import Actividades.A3_2_Latencia.Latency;
public class Main{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.value=10;
        System.out.println(s);
        Singleton second = Singleton.getInstance();
        second.value=12;
        System.out.println(second.value);
        Latency.simulateLarency(2, 10);
        
    }
}