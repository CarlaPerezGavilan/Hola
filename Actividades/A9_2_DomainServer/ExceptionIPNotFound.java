package Actividades.A9_2_DomainServer;

public class ExceptionIPNotFound extends Exception 
{ 
    public String toString() 
    {
        return new String("No se encontró la página que buscas");
    }
}