package Actividades.A9_2_DomainServer;

public class Mx extends Dominio
{
    // Atributos
    private static Mx instance; 

    // Constructores
    private Mx()
    {
        sitio[0]=new Tuple<>("www.azul.mx", "45.213.1.0");
        super.sitio[1] = new Tuple<>("www.anahuac.mx", "213.112.0.1");
        super.sitio[2] = new Tuple<>("www.itam.mx", "100.52.56.10");
        super.sitio[3] = new Tuple<>("www.up.mx", "108.20.21.0");
        super.sitio[4] = new Tuple<>("www.itesm.mx", "122.16.10.2");
    }

    // Singleton
    public static Mx getInstance()
    {
        if(instance== null)
            instance = new Mx();

        return instance;
    }

}