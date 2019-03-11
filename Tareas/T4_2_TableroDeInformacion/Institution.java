public class Institution{
    protected String name;
    protected Pizarron p;

    public Institution(String name, Pizarron p){
        this.name= name;
        this.p =p;
    }

    public void postMessage(String message){
        System.out.println(" MENSAJE HA SIDO PUBLICADO:");
        p.postMessage(message);
    }
    public void postMessage(String message, int day, int month, int year, int hour, int min){
        p.postMessage(message, day, month, year, hour, min);
    }

    public void getMessage(){
        p.getMessage();
    }

    public void getHistory(){
        p.getHistory();
    }

    public void searchMessage(Message m){
        p.searchMessage(m);
    }

    public void addUser(User theUser){
        p.addUser(theUser);
    }

}