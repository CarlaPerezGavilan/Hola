public class Persona{

    private Cabeza myHead;
    private String name;
    private Persona personKiss;

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
    public void kiss(Persona p){
        System.out.println("soy "+name+" y ");
        if(p==personKiss){
            myHead.kiss(p);
        }else{
            System.out.println("soy "+name+" y "+p+" no se deja besuquear");
        }
    }

    public void allowKiss(Persona personKiss){
        System.out.println("soy "+name);
        this.personKiss= personKiss;
        myHead.allowKiss(this);
    }
    public void inhale(){
        System.out.println("soy "+name);
        myHead.inhale(this);
    }
    public void exhale(){
        System.out.println("soy "+name);
        myHead.exhale(this);
    }
    public void look(Persona p){
        System.out.println("soy "+name+" y ");
        myHead.look(p);

    }
    public void blink(){
        System.out.println("soy "+name);
        myHead.blink(this);
    }
    public void talk(String words){
        System.out.println(name+" : ");
        myHead.talk(words); 
    }
    public void listen(String words){
        System.out.println(" soy "+name+" ");
        myHead.listen(words);
    }
}