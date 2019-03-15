public class InsufficientFundsException extends Exception{
    protected double missing;
    public InsufficientFundsException(double missing){
        this.missing = missing;
    }

    public String toString(){
        // instancias anónimas
        return new String("Te faltan "+missing+" pesos");
    }
}