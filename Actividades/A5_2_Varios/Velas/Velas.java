public class Velas{
   protected String color;
   protected double altura;
   protected double precio;

   public Velas(String color, double altura){
        this.color= color;
        this.altura= altura;
        precio =0.0;
   }
   public void calculatePrice(){
       Double mult = altura/5;
       int multiple =mult.intValue();
       precio = multiple*50;
       System.out.println("El precio es "+precio);
   }
}