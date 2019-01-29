public class TestFraction
{
    public static void main (String[] args)
    {
        Fractions A = new Fractions(4,6);
        Fractions B = new Fractions(4,5);
        A.simplifyFraction();
        B.simplifyFraction();
        System.out.println("FRACCIÓN  1="+A.getFraction());
        System.out.println("FRACCIÓN  2="+B.getFraction());
        System.out.println("SUMA-->"+A.addFraction(B));
        A.simplifyFraction();
        System.out.println("RESTA-->"+A.substractFraction(B));
        A.simplifyFraction();
        System.out.println("MULTIPLICACIÓN-->"+A.multiplyFraction(B));
        A.simplifyFraction();
        System.out.println("DIVISIÓN-->"+A.divideFraction(B));
    } 
}