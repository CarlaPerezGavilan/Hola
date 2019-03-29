public class Cousin extends Primos{
    protected static Cousin instance=null;

    private Cousin(){ }

    public static Cousin getInstance(){
        if(instance== null)
    {
        instance= new Cousin();
}    
return instance;
}
   public String nPrime(int n){
       int inicioPrimos=2;
       int i=0;
       int temporalA=0, temporalB=0;
       while(i<n){
            if(isNumberPrime(inicioPrimos) && isNumberPrime(inicioPrimos+4)){
                temporalA=inicioPrimos;
                temporalB=inicioPrimos+4;
                i++;
            }
            inicioPrimos++;
       }
       return "( "+temporalA+" , "+temporalB+" )";  
   }

   public  boolean isPrime(int a, int b) throws ExceptionNotPrime{
       if(isNumberPrime(a) && isNumberPrime(b)){
        if((a-b)==-4  || (b-a)==4){
            return true;
        }
       }else{
           throw new ExceptionNotPrime();
       }
       throw new ExceptionNotPrime();
   }


   public String getType(){
       return "cousin";
   }
}