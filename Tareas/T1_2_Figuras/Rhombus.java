public class Rhombus extends Figure implements Figures{
    protected double sideA;
    protected double sideB;
    protected double Diagonal;
    protected double diagonal;

    public Rhombus(double sideA, double sideB, double Diagonal, double diagonal){
        super.NumberOfSides=4;
        this.sideA = sideA;
        this.sideB = sideB;
        this.diagonal=diagonal;
        this.Diagonal=Diagonal;
        arraySides[0]= sideA;
        arraySides[1]= sideB;
        arraySides[2]= sideA;
        arraySides[3]= sideB;

    }
    public Rhombus(){
        super.NumberOfSides=4;
        sideA=0;
        sideB=0;
    }

    public double getPerimeter(){
        return (sideA*2)+(sideB*2);
    }
    public double getArea(){
        return (diagonal*Diagonal)/2;
    }
    
}