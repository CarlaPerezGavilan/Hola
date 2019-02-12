public class Persona{
    private String name; 
    public void getName(){
        return name; 
    }
    public Persona(String name){
        this.name=name;
        System.out.println("PERSONA: name set");
    }
    public Persona(){
        System.out.println("PERSONA created");
    }
}