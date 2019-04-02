package Evaluaciones.E2_2_OtraOportunidad;
public abstract class  Primos{
    final public boolean isNumberPrime(int n){
        int a;
            for(a=2; a<n; a++){
                if((n%a)==0){
                    return false;
                }
            }
            if(n==a){
                return true;
            }
        return false;
        }

    final int PrimeNumber(int n){
        int a=1;
        int count=2;
        while(n!=a){
            if(isNumberPrime(count)){
                a++;
                count++;
            }else{
                count++;
            }
        }
        return count;
    }
    public abstract String nPrime(int n);
    public abstract String getType();
}