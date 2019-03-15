
public class Banco{

    protected double balance;

    public Banco(double balance){
        this.balance = balance;
    }

    private Banco(){}
    public void retirar(double cantidad) throws InsufficientFundsException{
        if(cantidad> balance){
            throw new InsufficientFundsException(cantidad-balance);
        }else{
            balance-=cantidad;
            System.out.println("Retiro de "+cantidad+" de cuenta");
        } 
        
    }

    public void deposit(double cantidad){
        balance+=cantidad;
    }
}