public class Gob extends Dominio
{
    // Atributos
    private static Gob instance; 

    // Constructor
    private Gob()
    {
        super.sitio[0]=new Tuple<>("www.sep.gob", "143.253.1.0");
        super.sitio[1] = new Tuple<>("www.sedeena.gob", "233.122.0.1");
        super.sitio[2] = new Tuple<>("www.conadis.gob", "132.54.56.10");
        super.sitio[3] = new Tuple<>("www.semar.gob", "117.50.21.0");
        super.sitio[4] = new Tuple<>("www.sedesol.gob", "222.36.10.2");
    }
    
    // Singleton
    public static Gob getInstance()
    {
        if(instance == null)
            instance = new Gob();
        return instance;
    }  
}