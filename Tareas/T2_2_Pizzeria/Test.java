package Tareas.T2_2_Pizzeria;

public class Test{

    public static void main(String[] args) {

        Polanco polanco = Polanco.getInstance();

        // Primera orden
        Hawaiiana hawaiiana = new Hawaiiana();
        polanco.getEmpleado(0)().getOrder(hawaiiana);
        polanco.getEmpleado(0).sendOrder(polanco.getChef(), polanco.getAyudante());
        polanco.getEmpleado(4).deliverPizza("Picacho 140", hawaiiana);

        // Segunda orden
        Personalizada personalizada = new Personalizada("Nutella", "Queso");
        polanco.getEmpleado(0).getOrder(personalizada);
        polanco.getEmpleado(0).sendOrder(polanco.getEmpleado(4), polanco.getEmpleado(2));
        polanco.getEmpleado(4).deliverPizza("Picacho 140", personalizada);
      


        // Gerente calcula total
        System.out.println("INGRESOS TOTALES EN PESOS:"+polanco.getEmpleado(3).getSoldPizzas());
        System.out.println("NÚMERO DE PIZZAS VENDIDAS:"+polanco.getEmpleado(3).getAmountSold());
        

        SantaFe santaFe = SantaFe.getInstance();

        Vegetariana vegetariana = new Vegetariana();
        (santaFe.getEmpleado(0)).getOrder(vegetariana);
        (santaFe.getEmpleado(0)).sendOrder(santaFe.getEmpleado(4), santaFe.getEmpleado(2));
        santaFe.getEmpleado(4).deliverPizza("Picacho 140", vegetariana);

        Mexicana mexicana = new Mexicana();
        santaFe.getEmpleado(0).getOrder(mexicana);
        santaFe.getEmpleado(0).sendOrder(santaFe.getEmpleado(4), santaFe.getEmpleado(2));
        santaFe.getEmpleado(4).deliverPizza("Av Los Poetas 140", mexicana);

        

        System.out.println("INGRESOS TOTALES EN PESOS:"+santaFe.getEmpleado(3).getSoldPizzas());
        System.out.println("NÚMERO DE PIZZAS VENDIDAS:"+santaFe.getEmpleado(3).getAmountSold());
        

    }
}