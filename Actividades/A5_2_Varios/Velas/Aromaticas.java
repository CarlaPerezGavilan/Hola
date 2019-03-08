public class Aromaticas extends Velas{

    public Aromaticas(String color, double altura){
        super(color, altura);
    }


    public void calculatePrice(){
        Double mult = super.altura/10;
        int multiple = mult.intValue();
        super.precio = multiple*80;
        System.out.println("El precio es:"+precio);
    }
}