public class Test{
    public static void main(String[] args){
        Car carro1 = new Car("advanced");
        Car carro2 = new Car("standard");
        System.out.println(carro1.isMoreExpensive(carro2));
        System.out.println(carro2.isMoreExpensive(carro1));

        // Comprara casas
        House casa1 = new House(2);
        System.out.println(casa1.isMoreExpensive(carro1));
        System.out.println(carro1.isMoreExpensive(casa1));
    }
}