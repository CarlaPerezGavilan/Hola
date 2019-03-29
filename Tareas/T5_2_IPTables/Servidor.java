package Tareas.T5_2_IPTables;

import Actividades.A9_2_DomainServer.*;

public class Servidor{
    protected IPTables ipTables;
    protected DNS serverDomain;

    public Servidor() {
        ipTables = new IPTables();
        serverDomain = new DNS();
    }

    public void simulateNavegation(String ipAdress, String Direccion) 
    {
        try
        {
       if(ipTables.simulateNavegation(ipAdress) && ipTables.getActivo())
       {
           try
           {
                serverDomain.search(Direccion);
                System.out.println(ipAdress+" ip navigating "+Direccion);
           }catch(ExceptionIPNotFound e)
           {
            System.out.println(e.toString());
           }
       }
       else{
        System.out.println("Servidor no está activo");
        }       
       }catch(IPAccessDenied e){
        System.out.println(e.toString());
        }
}

    public IPTables getIPTables() {
        return ipTables;
    }
}