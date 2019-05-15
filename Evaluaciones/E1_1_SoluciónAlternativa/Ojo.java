public class Ojo{
    private String color;
    private int lengthEyelashes;

    // Constructores
    public Ojo(){
        color = "Cafe";
        lengthEyelashes = 5;
    }
    public Ojo(String color, int lengthEyelashes){
        this.color = color;
        this.lengthEyelashes = lengthEyelashes;
    }

    // Metodos
    public void look(Persona p){
        System.out.println("estoy viendo a " + p.getName());
        System.out.println("");
    }

    public void blink(Persona p){
        System.out.println(p.getName() + " parpadeó.");
        System.out.println("");
    }

    // Getters Setters
    public String getColor(){
        return color;
    }
    public int getLengthEyelashes(){
        return lengthEyelashes;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setLengthEyelashes(int lengthEyelashes){
        this.lengthEyelashes = lengthEyelashes;
    }
}
