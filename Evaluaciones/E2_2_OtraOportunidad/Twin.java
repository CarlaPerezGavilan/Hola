package Evaluaciones.E2_2_OtraOportunidad;
public class Twin extends Primos{
    protected static Twin instance=null;

    private Twin(){ }

    public static Twin  getInstance(){
        if(instance== null)
    {
        instance= new Twin();
    }    
    return instance;
    }

    public String nPrime(int n){
        int inicioPrimos=2;
        int i=0;
        int temporalA=0, temporalB=0;
        while(i<n){
             if(isNumberPrime(inicioPrimos) && isNumberPrime(inicioPrimos+2)){
                 temporalA=inicioPrimos;
                 temporalB=inicioPrimos+2;
                 i++;
             }
             inicioPrimos++;
        }
        TuplePrime<Integer, Integer> tupla = new TuplePrime<>(temporalA, temporalB);
       return tupla.toString();  
    }
 
    public boolean isPrime(TuplePrime<Integer,Integer> prime) throws ExceptionNotPrime{
        if(isNumberPrime(prime.getA()) && isNumberPrime(prime.getB())){
         if((prime.getA()-prime.getB())==-2  || (prime.getB()-prime.getA())==2){
             return true;
         }
        }else{
            throw new ExceptionNotPrime();
        }
        throw new ExceptionNotPrime();
    }

    public String getType(){
        return "twin";
    }
}
