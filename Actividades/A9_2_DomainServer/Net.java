public class Net extends Dominio
{

    // Atributos
    private static Net instance;

    // Constructor
    private Net()
    {
        super.sitio[0]=new Tuple<>("www.azul.net", "46.213.1.0");
        super.sitio[1] = new Tuple<>("www.afuera.net", "23.112.0.1");
        super.sitio[2] = new Tuple<>("www.todos.net", "120.52.56.10");
        super.sitio[3] = new Tuple<>("www.gogle.net", "18.20.21.0");
        super.sitio[4] = new Tuple<>("www.itesm.net", "12.16.10.2");
    } 

    // Singleton
    public static Net getInstance()
    {
        if(instance== null)
            instance = new Net();
        return instance;
    }
}