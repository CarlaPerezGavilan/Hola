public class Main{
    public static void main(String[] args) {
        Cousin c = Cousin.getInstance();
        System.out.println(c.nPrime(4));
        try{
            System.out.println(c.isPrime(3,7));
        }catch(ExceptionNotPrime e){
            System.out.println(e.toString());
        }
        Palindromic p = Palindromic.getInstance();
        System.out.println(p.nPrime(10));
        try{
            System.out.println(p.isPrime(70));
        }catch(ExceptionNotPrime e){
            System.out.println(e.toString());
        }

        Twin t = Twin.getInstance();
        System.out.println(t.nPrime(4));
        try{
            System.out.println(t.isPrime(2,5));
        }catch(ExceptionNotPrime e){
            System.out.println(e.toString());
        }

    }
}