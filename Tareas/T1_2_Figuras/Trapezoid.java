public class Trapezoid extends Figure implements Figures{
    protected double base_M;
    protected double base_m;
    protected double sides;

    public Trapezoid(){
        
        arraySides = new double[4];
        super.arraySides[0]=base_M;
        super.arraySides[1]=base_m;
        super.arraySides[2]=sides;
        super.arraySides[3]=sides;
    }
    public Trapezoid(double base_M, double base_m, double sides, double height){

        this.base_M = base_M;
        this.base_m = base_m;
        this.sides = sides;
        super.height= height;

        super.NumberOfSides=4;
        super.arraySides[0]=base_M;
        super.arraySides[1]=base_m;
        super.arraySides[2]=sides;
        super.arraySides[3]=sides;
    }
    public double getArea()
    {
        return ((super.height)*(base_m+base_M))/2;
    }

    public double getPerimeter()
    {
        return base_M+base_m+(sides*2);
    }
}