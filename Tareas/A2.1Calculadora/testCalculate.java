/*
Carla Pérez Gavilán, A01023033
01/02/2019
Calculadora Test
*/
import java.util.Scanner;
public class testCalculate {
    public static void main(String[] args) {
        //Creación de Instancia
        Number numero = new Number();

        //Prueba Sumas
        System.out.println("SUMAS:");
        numero.sum(2,3);
        numero.Print();
        numero.sum(2.4,3.6);
        numero.Print();
        numero.sum(2.4,5);
        numero.Print();
        numero.sum(6,3.6);
        numero.Print();

        // Prueba Restas
        System.out.println("RESTAS:");
        numero.substract(3,4);
        numero.Print();
        numero.substract(6,4.2);
        numero.Print();
        numero.substract(8.4,4.2);
        numero.Print();
        numero.substract(8.4,4);
        numero.Print();
        
        
        // Prueba Multiplicación
        System.out.println("MULTIPLICACIONES:");
        numero.multiply(3,4);
        numero.Print();
        numero.multiply(6,4.2);
        numero.Print();
        numero.multiply(8.4,4.2);
        numero.Print();
        numero.multiply(8.4,4);
        numero.Print();

        // Prueba División
        System.out.println("DIVISIONES:");
        numero.divide(3,2);
        numero.Print();
        numero.divide(3,5);
        numero.Print();
        numero.divide(6,4.3);
        numero.Print();
        numero.divide(8.4,2.3);
        numero.Print();
        numero.divide(8.4,3);
        numero.Print();

        // Prueba Raíz Cuadrada
       System.out.println("RAÍZ");
        numero.sqrt(3.2);
        numero.Print();
        numero.sqrt(6);
        numero.Print();

        //Prueba Potencia
        System.out.println("POTENCIA");
        numero.power(2,3);
        numero.Print();
        numero.power(2.4,5);
        numero.Print();
    
    }//End main 
}//End class