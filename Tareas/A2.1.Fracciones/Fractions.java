public class Fractions{
    //ATTRIBUTES
    private int num, den;

//SET
    public Fractions(int num, int den){
        this.num=num;
        this.den=den;
    }
    public Fractions(){
    }

    public String getFraction(){
        return num+"/"+den;
    }
    public int getDen(){
        return den;
    }
      public int getNum(){
        return num;
    }

    public void simplifyFraction(){
        for(int i=1; i<num || i<den; i++)
        {
            if(num%i==0 && den%i==0){
                num=num/i;
                den=den/i;
            }
         
        }
    }

    public String addFraction(Fractions fraction)
    {
        
        if(den==fraction.getDen())
        {
            num=num+fraction.getNum();
        }
        else
        {
            num = (den*fraction.getNum())+(fraction.getDen()*num);
            den=den*fraction.getDen();
            
        }
        return num+"/"+den;
    }

     public String substractFraction(Fractions fraction)
    {

        if(den==fraction.getDen())
        {
            num = num-fraction.getNum();
        }
        else
        {
            num = -(den*fraction.getNum())+(fraction.getDen()*num);
            den=den*fraction.getDen();
        }
    return num+"/"+den;
    }
    public String multiplyFraction(Fractions fraction)
    {
        num = fraction.getNum()*num;
        den=den*fraction.getDen();
        return num+"/"+den;
    }
    public String divideFraction(Fractions fraction)
    {
        num = num*fraction.getDen();
        den=den*fraction.getNum();
        return num+"/"+den;
    }
}