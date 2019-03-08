public class Capitan extends Jugador{
    protected String order;
    protected static Capitan instance = null;
  
    private Capitan(String name, int number, String lastName, int numberScore){
        super(name, number, lastName, numberScore);
    }

   public static Capitan getInstance(String name, int number, String lastName, int numberScore){
        if(instance ==null){
            instance = new Capitan(name, number, lastName, numberScore);
            return instance;
        }
        return instance;
   }

   public void setOrder(String order){
        this.order=order;
}
   public void GiveOrder(Jugador jugador){
       System.out.println(this.getName()+" da orden: "+order+" -a jugador "+jugador.getName());
       jugador.followOrder(order);
   }
}