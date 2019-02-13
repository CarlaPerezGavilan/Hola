public class Persona{
    private String name; 
    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name=name;
    }
    public Persona(String name){
        this.name=name;
        System.out.println("PERSONA: name set");
    }
    public Persona(){
        System.out.println("PERSONA created");
    }
}