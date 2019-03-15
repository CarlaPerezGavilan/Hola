package Tareas.T2_2_Pizzeria;

import java.util.Random;

public class Chef extends Empleado{

    // CONSTRUCTORES
    public Chef(){}
    public Chef(String name){
        super(name);
    }

    // AMASAR
    public boolean Amasar(Pizza p, Ayudante a)
    {
        System.out.println("CHEF: Pizza amazando");
       return a.Amasar(p);
    }

    // HORNEAR CON LATENCIA
    public boolean Bake(Pizza p)
    {
        p.state= "Horenando";
        System.out.println("CHEF: Pizza horneando");

        Random r= new Random();
        int time = r.nextInt(3-2)+2;
        long start = System.currentTimeMillis();
        System.out.println("LOADING... ");

            while(true)
            {
                long current = System.currentTimeMillis();
                if(start+time*1000 < current);
                break;
            }
        return true;
     
    }

    // AGREGAR INGREDIENTES
    public boolean addIngredients(Pizza p)
    {
        p.state= "Agregando Ingredientes";

        for(int i=0; i<p.countIngredient; i++)
            System.out.println("CHEF: Agregó Ingrediente: "+p.getIngredient(i));
        
        return true;
    }

    // EMPACAR PIZZA
    public boolean pack(Pizza p, Ayudante a)
    {
        System.out.println("CHEF: Pizza empacada");
        return a.pack(p);
    }

    //CREAR PIZZA
    public void createPizza(Pizza p, Ayudante a){
        if(this.Amasar(p, a))
        {
            if(this.Bake(p))
            {
                if(this.addIngredients(p))
                {
                    if(this.pack(p, a))
                    {
                        p.state= "lista para entrega";
                        System.out.println("CHEF: Pizza lista para entrega");
                    }
                }
            }
        }
    }

    
}//END CHEF