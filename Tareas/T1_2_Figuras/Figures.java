
public interface Figures{
    double getArea();
    double getPerimeter();
    
default double areaDifference(Figures f){
        if(f.getArea()>this.getArea())
        return f.getArea()-this.getArea();
    return this.getArea()-f.getArea();
    }
}