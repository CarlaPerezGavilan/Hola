public abstract class Dominio{
    protected Tuple[] sitio = new Tuple[5]; 
    protected DNS servidor = new DNS();
    protected boolean found; 
    
    final public void searchDom(String input) 
    {
        for(int i=0; i < sitio.length; i++)
        {
            if(input.equals(sitio[i].getDireccion()))
            {
                System.out.println("La dirección IP es: "+sitio[i].getIP());
                found = true;
            }
        }
    }
}
           