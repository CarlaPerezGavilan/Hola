public class Persona{

    private Cabeza myHead;
    private String name;

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
        System.out.print("soy "+name);
        myHead.kiss(p);
        System.out.println("");
    }

    public void allowKiss(Persona personKiss){
        System.out.println(myHead);
        myHead.allowKiss(personKiss);
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
    }
    public void listen(String words){
        System.out.print(" soy "+name+" ");
        myHead.listen(words);
        System.out.println("");
    }
}