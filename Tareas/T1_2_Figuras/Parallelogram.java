public class Parallelogram extends Figure implements Figures{
    protected double side;

    public Parallelogram(){
         super.base=0;
         super.height=0;
            side=0;
    }
    public Parallelogram(double base, double height, double side){

        super.base= base;
        super.height= height;
        this.side = side;
        this.NumberOfSides=4;

        super.arraySides[0]=base;
        super.arraySides[1]=height;
        super.arraySides[2]=side;
        super.arraySides[3]=side;
    }
    public double getArea()
    {
        return (super.height*super.base);
    }

    public double getPerimeter()
    {
        return (super.base*2)+(side*2);
    }
}