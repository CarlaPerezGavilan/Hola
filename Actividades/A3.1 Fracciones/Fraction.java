public class Fraction{
    //ATTRIBUTES
    private int num, den;

    public void setFraction(int num, int den){
        this.num=num;
        this.den=den;
    }
    public String getFraction(){
        return num+"/"+den;
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

    public String addFraction(String fractionA)
    {
        String[] stringFractionA = fractionA.split("/");
        int numA= Integer.parseInt(stringFractionA[0]);
        int denA= Integer.parseInt(stringFractionA[1]);

        if(den==denA)
        {
            num=num+numA;
        }
        else
        {
            num = (den*numA)+(denA*num);
            den=den*denA;
            
        }
        return num+"/"+den;
    }

     public String substractFraction(String fractionA)
    {
        String[] stringFractionA = fractionA.split("/");
        int numA= Integer.parseInt(stringFractionA[0]);
        int denA= Integer.parseInt(stringFractionA[1]);

        if(den==denA)
        {
            num = num-numA;
        }
        else
        {
            num = -(den*numA)+(denA*num);
            den=den*denA;
        }
    return num+"/"+den;
    }
    public String multiplyFraction(String fractionA)
    {
        String[] stringFractionA = fractionA.split("/");
        int numA= Integer.parseInt(stringFractionA[0]);
        int denA= Integer.parseInt(stringFractionA[1]);

        num = numA*num;
        den=den*denA;
        return num+"/"+den;
    }
    public String divideFraction(String fractionA)
    {
        String[] stringFractionA = fractionA.split("/");
        int numA= Integer.parseInt(stringFractionA[0]);
        int denA= Integer.parseInt(stringFractionA[1]);
        num = num*denA;
        den=den*numA;
        return num+"/"+den;
    }
}