public class Test{
    public static void main(String[] args){
        Auto a = new Auto(4);
        Concesionaria c= new Concesionaria ("San Juan");
        Conductor cond = new Conductor("Ariel");
        Mecanico mec= new Mecanico("Cris");
        c.contratarMecanico(mec);
    }
}