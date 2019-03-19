import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        // solo se aceptan clases o objetos
        Tuple<Integer, String> intString= new Tuple<>(12, "Dave");

        Tuple<String, String> stringString= new Tuple<>("2", "Juan");

        Tuple<Scanner, Scanner> scannerScanner = new Tuple<>(new Scanner(System.in), new Scanner(System.in));

        // no es un arreglo polimórfico
        Tuple[] arr= new Tuple[3];
        arr[0] = intString;
        arr[1] = stringString;
        arr[2] = scannerScanner;

        for(int i=0; i<3; i++){
            System.out.println(arr[i].getValue());
        }

        Dog one = new Dog(18);
        Dog two = new Dog(8);
       System.out.println("Resultado:"+one.compare2(two)); 
    }
}