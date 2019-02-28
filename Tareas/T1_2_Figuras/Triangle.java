public class Triangle extends Figure implements Figures{
    protected double sideA;
    protected double sideB;

public Triangle(){
        super.arraySides = new double[3];
    }
public Triangle(double sideA, double sideB, double sideC, double height){
        super.NumberOfSides =3;
        super.base=sideC;
        super.height=height;
        this.sideA = sideA;
        this.sideB= sideB;
        super.arraySides[0]=sideA;
        super.arraySides[1]=sideB;
        super.arraySides[2]=sideC;
    }
    
public double getPerimeter(){
        System.out.println("los lados son: "+sideA);
        return (sideA+sideB+super.base);
    }

public double getArea(){
        return (super.base*super.height/2);
    }
}