
public class Pizarron{
    protected Message[] historial;
    protected User[] usuarios;
    protected Message displayed;
    protected int contMessage;
    protected int contUsers;
    protected static Pizarron instance;


    public Pizarron(){
        usuarios = new User[10];
        historial = new Message[10];
        displayed = null;
        contMessage = 0;
        contUsers= 0;
        instance = null;
    }

    public static Pizarron getInstance(){
        if(instance==null){
            instance = new Pizarron();
            return instance;
        }
        return instance;    

    }
    public void postMessage(String message){
        displayed = new Message(message);
        historial[contMessage++]=displayed;
        displayed.print();
    }

    public void postMessage(String message, int day, int month, int year, int hour, int min){
        displayed = new Message(message, year, month, day, hour, min);
        historial[contMessage++]=displayed;
        displayed.print();
    }

    public void getMessage(){
        displayed.print();
    }

    public void getHistory(){
        for(int i=0; i<contMessage; i++){
            historial[i].print();
        }
    }

    public void searchMessage(Message m){
        for(int i=0; i<contMessage; i++){
            if(historial[i].equals(m)){
                historial[i].print();
            }
        }
    }

    public void addUser(User theUser){
        usuarios[contUsers++]=theUser;
        System.out.println(theUser.name+" Ha sido agregado. ");
    }
}