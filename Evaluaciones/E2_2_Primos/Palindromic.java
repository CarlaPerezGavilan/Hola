public class Palindromic extends Primos{

    protected static Palindromic instance=null;

    private Palindromic(){ }

    public static Palindromic getInstance(){
        if(instance== null)
    {
        instance= new Palindromic();
    }    
    return instance;
    }
    public boolean isPrimePalidrome(int n){
        String[] digitos;
        String SideB ="";
        if(isNumberPrime(n)){
            String SideA = Integer.toString(n);
            digitos = SideA.split("");
            for(int i=digitos.length-1; i>-1; i--){
                SideB+=digitos[i];
            }
            if(SideB.equals(SideA)){
                return true;
            }
        }
       return false;
    }

    public String nPrime(int n)
    {
        int a=0;
        int i=0;
        int temporal=0;
        for(i=2; i<1000; i++){
                    if(isPrimePalidrome(i)){
                        a++;
                        temporal=i;
                        if(a==n){
                            break;
                        }
                    }
                }
            
                String tempString=Integer.toString(temporal);
                return tempString; 
        } 

    public boolean isPrime(int n) throws ExceptionNotPrime{
            if(isPrimePalidrome(n)){
                return true;
            }else{
                throw new ExceptionNotPrime();
            }
    }

public String getType(){
        return "palindromic";
    }
}