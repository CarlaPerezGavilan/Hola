public class Jugador{
    protected String name;
    protected int number;
    protected String lastName;
    protected int numberScore;


    // CONSTRUCTORES
    public Jugador(){}
    public Jugador(String name, int number, String lastName, int numberScore){
        this.name= name;
        this.lastName= lastName;
        this.number= number;
        this.numberScore= numberScore;
    }
    // GETTERS
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getNumber(){
        return number;
    }
    public int getNumberScore(){
        return numberScore;
    }

    // SETTERS
    public void setName(String name){
     this.name= name;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public void setNumber(int number){
        this.number= number;
    }

    public void setNumberScore(int numberScore){
        this.numberScore= numberScore;
    }

    public void followOrder(String order){
        if(!this.getClass().toString().equals("Capitan")){
            System.out.println("soy "+getName()+" y sigo la orden: "+order);
        }else{
            System.out.println("soy"+getName()+"y soy el capitán");
        }
    }
}