public class Ojo{
    private String color; 
    private int lengthEyelashes;

    public Ojo(){
    }
    public Ojo(String color, int lengthEyelashes){
        this.color=color;
        this.lengthEyelashes= lengthEyelashes;
    }
    public void look(Persona p){
        System.out.println(" estoy viendo a "+p.getName());
    }
    public void blink(Persona p){
        System.out.println(p.getName()+"  parpadeo");
    }
}
