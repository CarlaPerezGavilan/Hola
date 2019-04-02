package Evaluaciones.E2_2_OtraOportunidad;
public class Main {
    public static void main(String[] args) {
        Cousin c = Cousin.getInstance();
        System.out.println(c.nPrime(5));
        try{
            System.out.println(c.isPrime(new TuplePrime<>(3,7)));
        }catch(ExceptionNotPrime e){
            System.out.println(e.print(c));
        }
        Palindromic p = Palindromic.getInstance();
        System.out.println(p.nPrime(5));
        try{
            System.out.println(p.isPrime(70));
        }catch(ExceptionNotPrime e){
            System.out.println(e.print(p));
        }

        Twin t = Twin.getInstance();
        System.out.println(t.nPrime(5));
        try{ 
            System.out.println(t.isPrime(new TuplePrime<>(2,5)));
        }catch(ExceptionNotPrime e){
            System.out.println(e.print(t));
        }

    }
}