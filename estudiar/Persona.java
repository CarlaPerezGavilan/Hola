public class Persona{
    private String nombre; 
    private int edad;
    private Corazon heart; 
    private Friend amigo; 
    
    
    public Persona(String nombre, int edad){
        Corazon = new Corazon();
        this.edad= edad;
        this.nombre=nombre;
    }

    public run(){
        System.out.println("Person is running");
    }
    
}