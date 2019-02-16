public class Persona{

    private Cabeza myHead;
    private String name;
    private String kiss;

    //Constructor default
    public Persona(){
        myHead= new Cabeza(2, "rojo", "arco", "alto", "respingada", 4, 5, "tiene aretes");
    }
    public Persona(String name){
        this.name = name;
        myHead= new Cabeza();
    }
    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name= name; 
    }                   
    public void kiss(Persona p){
        System.out.print("soy "+name+" ");
        if (name.equals(p.kiss)){
            myHead.kiss(p);
        }else{
            System.out.println(p.getName()+" y no se deja besuquear ");
        }
        System.out.println("");
    }

    public void allowKiss(Persona personKiss){
        kiss = personKiss.getName();
        myHead.allowKiss(personKiss);
    }
    public String getKiss(){
        return kiss;
    }
    public void inhale(){
        System.out.println("soy "+name);
        myHead.inhale(this);
        System.out.println("");
    }
    public void exhale(){
        System.out.println("soy "+name);
        myHead.exhale(this);
    }
    public void look(Persona p){
        System.out.print("soy "+name+" y ");
        myHead.look(p);
        System.out.println("");
    }
    public void blink(){
        System.out.print("soy "+name);
        myHead.blink(this);
        System.out.println("");
    }
    public void talk(String words){
        System.out.print(name+"");
        myHead.talk(words); 
        System.out.println("");
    }
    public void listen(String words){
        System.out.print(" soy "+name+" ");
        myHead.listen(words);
        System.out.println("");
    }
}