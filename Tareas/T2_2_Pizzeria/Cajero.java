package Tareas.T2_2_Pizzeria;

public class Cajero extends Empleado{
    // ATRIBUTOS
    protected Pizza order;

    // Constructor con parámetros
    public Cajero(String nombre)
    {
        super(nombre);
    }

    // ORDENAR PIZZA
    public void getOrder(Pizza p){
        int a= 0;
        if(p.typePizza.equals("Personalizada"))
        {
            for(int i=0; i<p.countIngredient; i++)
            {
                for(int q=0; q<10; q++)
                {
                    String temporal = super.sucursal.getIngredient(q);
                        if(p.myIngredients[i].equals(temporal))
                            a++;
    
                }
            }
        }
        for(int i=0; i<=super.sucursal.contTypePizza; i++)
        {
            if(a==2)
            {
                System.out.println("CAJERO: Ha tomado su orden personalizada");
                p.calculatePrice();
                order=p;
                break;
            }

            if(super.sucursal.typePizza[i].typePizza.equals(p.typePizza))
            {
                System.out.println("CAJERO: Ha tomado su orden de "+p.typePizza);
                p.calculatePrice();
                order=p;
                break;
            }else
            {
                System.out.println("CAJERO: no tenemos disponible este tipo de pizza:"+p.typePizza+". en la sucursal "+super.sucursal.name);
            }
        } 
    }

    // MANDAR ORDEN AL CHEF
    public void sendOrder(Chef c, Ayudante ayudante){
        c.createPizza(order, ayudante);
    }
}//END CAJERO