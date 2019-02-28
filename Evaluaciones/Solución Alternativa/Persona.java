public class Persona{

    private Cabeza myHead;
    private String name;
    private String toKiss;

    // Constructores
    public Persona(){
        name = "John Doe";
        myHead = new Cabeza(2, "rojo", "arco", "alto", "respingada", 4, 5, "tiene aretes");
        toKiss = "No one";
    }
    public Persona(String name){
        this.name = name;
        myHead = new Cabeza();
        toKiss = "No one";
    }

    // Metodos
    public void pInhale(){
        myHead.hInhale(this);
    }

    public void pExhale(){
        myHead.hExhale(this);
    }

    public void pLook(Persona p){
        System.out.print("Soy " + name + " y ");
        myHead.hLook(p);
    }

    public void pBlink(){
        myHead.hBlink(this);
    }

    public void pTalk(String words){
        System.out.print(name);
        myHead.hTalk(words);
        System.out.println("");
    }

    public void pListen(String words){
        System.out.print(name);
        myHead.hListen(words);
    }

    public void pKiss(Persona pToKiss){
        System.out.print("Soy " + name + " y ");

        if (ptoKiss.equals(pToKiss.toKiss))
            myHead.hKiss(pToKiss);
        else
            System.out.println(pToKiss.name + " no se deja besuquear.");

        System.out.println("");
    }

    public void pAllowKiss(Persona wantsToKiss){
        toKiss = wantsToKiss.getName();
    }

    // Getters y Setters
    public String getName(){
        return name;
    }
    public String getToKiss(){
        return toKiss;
    }
    public void setName(String name){
        this.name = name;
    }
}
