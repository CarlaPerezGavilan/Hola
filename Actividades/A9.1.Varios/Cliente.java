public class Cliente extends Person{
    public void retirar(double cantidad, Sucursal s){
        System.out.println("Cliente: request para retira $"+cantidad+" dinero sucursal");
        s.retirar(cantidad, this);
    }
    public Cliente(String cliente){
        super(cliente);
    }
    private Cliente(){
    }
    public static void main(String[] args){
    
       Sucursal s= new Sucursal("Benito Juárez");
       Cliente c= new Cliente("Pedro");
       c.retirar(100, s);
       c.retirar(5000, s);

    
}
}