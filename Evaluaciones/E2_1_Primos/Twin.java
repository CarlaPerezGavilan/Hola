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
        return "( "+temporalA+" , "+temporalB+" )";  
    }
 
    public boolean isPrime(int a, int b) throws ExceptionNotPrime{
        if(isNumberPrime(a) && isNumberPrime(b)){
         if((a-b)==-2  || (b-a)==2){
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
