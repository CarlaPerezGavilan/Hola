public class Nariz{
    private String type; 
    private int tamano; 

    public Nariz(){}
    public Nariz(String type, int tamano){
        this.type= type;
        this.tamano=tamano;
    }

    public void inhale(Persona p){
        System.out.println(p.getName()+" inhaló");
    }
    public void exhale(Persona p){
        System.out.println(p.getName()+" exhaló");
    }
}