public class Motor{
   private int gear; 
   private String typeGas;
   private double potencia;

   public Motor(){
       gear=0;
   }
   public Motor(double potencia, String typeGas){
    gear=0;
    this.potencia=potencia;
    this.typeGas= typeGas;
}
   public int getGear()
    {
        return gear;
    }
    public void setGear(int gear)
    {
        this.gear=gear;
        
    }
}