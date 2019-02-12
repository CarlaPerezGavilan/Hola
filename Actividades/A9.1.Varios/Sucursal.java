public class Sucursal{
    private String name;
    public void retirar(double cantidad, Cliente c){
        System.out.println("Sucursal: deposita $"+ cantidad+" a "+c.getName());
    }
    public Sucursal(String name){
        this.name=name;
    }
    public Sucursal(){
    }
}