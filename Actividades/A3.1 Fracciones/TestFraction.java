public class TestFraction
{
    public static void main (String[] args)
    {
        Fraction firstFraction = new Fraction();
        firstFraction.setFraction(78,4);
        firstFraction.simplifyFraction();
        System.out.println(firstFraction.getFraction());
        System.out.println("SUMA-->"+firstFraction.addFraction("2/4"));
        firstFraction.simplifyFraction(); 
        System.out.println("RESTA-->"+firstFraction.substractFraction("1/4"));
        firstFraction.simplifyFraction();
        System.out.println("MULTIPLICACIÓN-->"+firstFraction.multiplyFraction("2/3"));
        firstFraction.simplifyFraction();
        System.out.println("DIVISIÓN-->"+firstFraction.divideFraction("3/4"));
    } 
}