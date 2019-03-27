import java.util.Scanner;

public class Test
{
    public static void main(String[] args) 
    {

        DNS servidor = new DNS();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Dominio:");
        String dire = leer.nextLine();
        
        try
        {
            servidor.search(dire);
        }
        catch(ExceptionIPNotFound exception)
        {
            System.out.println(exception.toString());
        }           
    }        
}