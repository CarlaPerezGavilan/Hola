package Actividades.A9_2_DomainServer;

public abstract class Dominio
{
    // Atributos
    protected Tuple[] sitio; 
    protected DNS servidor = new DNS();
    protected boolean found; 

    public Dominio(){
        sitio = new Tuple[5];
    }
    
    // Método final para buscar en cada dominio
    final public void searchDom(String input) 
    {
        for(int i=0; i < sitio.length; i++)
        {
            if(input.equals(sitio[i].getDireccion()))
            {
                System.out.println("whose IP address is: "+sitio[i].getIP());
                found = true;
            }
        }
    }
}         