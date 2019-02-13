public class Test{
    public static void main(String[] args){
        //Crear conductor
        Conductor carla = new Conductor("Carla");
        Auto polo = new Auto("Polo", "Gris oscuro", 256900, 2010, 0, "Benito Juárez");
        //Comprar el coche
        carla.buyCar(polo);
        carla.drive(polo);


    //Test de gets
    System.out.println("--MAIN--");
    System.out.println("Modelo: "+polo.getModel());
    System.out.println("Año de Modelo: "+polo.getYear());
    System.out.println("Color: "+polo.getColor());
    System.out.println("Precio:"+polo.getPrice());
    System.out.println("Nombre de Manufacturera: "+polo.getNameFact());
    polo.setNumDoors(2);
    System.out.println("No de puertas: "+polo.getNumDoors());
    System.out.println("Kilometraje: "+polo.getKm());

    //REPARAR EL COCHE Y DAR SERVICIO
    Mecanico jorge = new Mecanico("Jorge");
    polo.repair(jorge);
    polo.service(jorge);
    polo.nextService();

    //RECOGER A UN PASAJERO
    Pasajero juncos = new Pasajero("Juncos");
    polo.pickupPasajero(juncos, "Av. Santa Fe #100");
    polo.dropPassenger(juncos, "Av. Los Poetas #200");

    //CALCULAR PRECIO
    polo.calculatePrice(2019);
    polo.getAge(2019);

    //COBCESIONARIA CONTRATACIÓN
    Concesionaria c = new Concesionaria("El conejo veloz");
    c.hiresMecanic(jorge);
    c.scheduleServicio(carla, 23, 05, 2019);

    //VENDER EL COCHE
    Vendedor carlos = new Vendedor("Carlos");
    c.hiresSeller(carlos);
    Conductor jimena = new Conductor("Jimena");
    carlos.sellCar(jimena, polo);

    //REPARA COCHE
    c.repararCar(polo, jorge);
    }
}