package Actividades.A4_2_Singleton;

public class Singleton{
    public int value;
    private static Singleton instance = null;

    protected Singleton(){}

    public static Singleton getInstance(){
            if(instance == null)
            instance= new Singleton();
     return instance;
    }
}
