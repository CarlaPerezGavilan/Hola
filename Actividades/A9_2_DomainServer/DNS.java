public class DNS
{
    // Atributos
    public boolean found;

    // Constructor
    public DNS()
    {
        found = false;
    }

    // Método para buscar
    public void search(String input) throws ExceptionIPNotFound 
    {
        int i;

        Dominio[] dominios = new Dominio[4];
        dominios[0] = Com.getInstance();
        dominios[1] = Gob.getInstance();
        dominios[2]= Mx.getInstance();
        dominios[3] = Net.getInstance();
        
        for(i = 0; i < dominios.length; i++)
                dominios[i].searchDom(input);

        for(i = 0; i < dominios.length; i++)
        {
            if(dominios[i].found)
                break;
        }
        // Lanza excepcion si buscó en todo el arreglo y no encontró igual
        if(i==dominios.length)
            throw new ExceptionIPNotFound();

    
    }


}
