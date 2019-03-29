package Actividades.A9_2_DomainServer;

public class Tuple<IP, Direccion>
{
    // Atributos genéricos
    public Direccion direccion;
    public IP IP;

    // Constructor Tupla
    public Tuple(Direccion direccion, IP  IP)
    {
        this.direccion = direccion;
        this.IP = IP;
    }

    // Getter y Setter
    public Direccion getDireccion()
    {
        return direccion;
    }
    public IP getIP()
    {
        return IP;
    }

    // Imprimir tupla
    public String toString()
    {
        return "("+direccion+", "+IP+")";
    }
    

}