package Evaluaciones.E2_2_OtraOportunidad;
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
       TuplePrime<Integer, Integer> tupla = new TuplePrime<>(temporalA, temporalB);
       return tupla.toString();  
   }

   public boolean isPrime(TuplePrime<Integer,Integer> primos) throws ExceptionNotPrime{
       if(isNumberPrime(primos.getA()) && isNumberPrime(primos.getB())){
        if((primos.getA()-primos.getB())==-4  || (primos.getB()-primos.getA())==4){
            return true;
        
       }else{
           throw new ExceptionNotPrime();
       }
   }
   throw new ExceptionNotPrime();
 }


   public String getType(){
       return "cousin";
   }
}