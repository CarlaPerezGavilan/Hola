public class Com extends Dominio
{
    // Atributos
    private static Com instance; 

    // Constructor
    private Com()
    {
        super.sitio[0] = new Tuple<String, String>("www.tec.com", "193.233.1.0");
        super.sitio[1] = new Tuple<String, String>("www.semarnat.com", "123.231.0.1");
        super.sitio[2] = new Tuple<String, String>("www.google.com", "127.54.1.0");
        super.sitio[3] = new Tuple<String, String>("www.facebook.com", "127.54.1.0");
        super.sitio[4] = new Tuple<String, String>("www.twitter.com", "157.56.10.2");
    }

    // Singleton
    public static Com getInstance()
    {
        if(instance== null)
            instance = new Com();
        return instance;
    }
}