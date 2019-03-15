package Tareas.T2_2_Pizzeria;

public class Test{

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jorge");
        Chef chef = new Chef("Carlos");
        Repartidor repartidor = new Repartidor("Sebastián");
        Ayudante ayudante = new Ayudante("Carla");
        Cajero cajero = new Cajero("Emilio");

        Polanco polanco = Polanco.getInstance(gerente, chef, repartidor, ayudante, cajero);
        gerente.Hired(polanco);
        chef.Hired(polanco);
        repartidor.Hired(polanco);
        ayudante.Hired(polanco);
        cajero.Hired(polanco);

        // Primera orden
        Hawaiiana hawaiiana = new Hawaiiana();
        cajero.getOrder(hawaiiana);
        cajero.sendOrder(chef, ayudante);
        repartidor.deliverPizza("Picacho 140", hawaiiana);

        // Segunda orden
        Personalizada personalizada = new Personalizada("Nutella", "Queso");
        cajero.getOrder(personalizada);
        cajero.sendOrder(chef, ayudante);
        repartidor.deliverPizza("Picacho 140", personalizada);
      


        // Gerente calcula total
        System.out.println("INGRESOS TOTALES EN PESOS:"+gerente.getSoldPizzas());
        System.out.println("NÚMERO DE PIZZAS VENDIDAS:"+gerente.getAmountSold());
        

        Gerente gerente2 = new Gerente("Luis");
        Chef chef2 = new Chef("Martha");
        Repartidor repartidor2 = new Repartidor("Mariana");
        Ayudante ayudante2 = new Ayudante("Katia");
        Cajero cajero2 = new Cajero("Chris");

        SantaFe santaFe = SantaFe.getInstance(gerente2, chef2, repartidor2, ayudante2, cajero2);
        gerente2.Hired(santaFe);
        chef2.Hired(santaFe);
        repartidor2.Hired(santaFe);
        ayudante2.Hired(santaFe);
        cajero2.Hired(santaFe);

        Vegetariana vegetariana = new Vegetariana();
        cajero2.getOrder(vegetariana);
        cajero2.sendOrder(chef2, ayudante2);
        repartidor2.deliverPizza("av. Los Poetas 100", vegetariana);

        Mexicana mexicana = new Mexicana();
        cajero2.getOrder(mexicana);
        

        System.out.println("INGRESOS TOTALES EN PESOS:"+gerente2.getSoldPizzas());
        System.out.println("NÚMERO DE PIZZAS VENDIDAS:"+gerente2.getAmountSold());
        

    }
}