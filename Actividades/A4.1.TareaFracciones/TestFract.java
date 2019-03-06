public class TestFract{
    public static void main (String[] args){
        Fract f1= new Fract(450,36);
        Fract f2= new Fract(15,2);
       

        Fract f3= f1.multiply(f2);
        f1.Simplify();
        f1.Print();
    }
}