public class Main{
    public static void main(String[] args) {
        Capitan gerardo = Capitan.getInstance("Gerardo", 20, "Lopez", 234);
        Jugador Juan = new Jugador("Juan", 100, "Pérez", 30);
        Jugador Carla  = new Jugador("Carla", 30, "Hernández", 40);
        Jugador Sebastian = new Jugador("Manuel", 30, "Hernández", 40);
        Jugador Katia = new Jugador("Katia", 12, "Bellido", 15);

        //Capitan da ordenes
       gerardo.setOrder("Acaba el progama!");
        gerardo.GiveOrder(Juan);

        
        Capitan manuel = Capitan.getInstance("Manuel", 30, "Lopez", 204);

    }
}