public class Rectangle extends Figure implements Figures {
  
   
    public Rectangle(){
        super.base= 0.0;
        super.height=0.0;
    }

    public Rectangle(double base, double height){
        super.base= base;
        super.height = height;
        super.NumberOfSides=4;
        super.arraySides[0]=base;
        super.arraySides[1]=base;
        super.arraySides[2]=height;
        super.arraySides[3]=height;
    }
    
    public double getArea(){
       return (super.base*super.height);
    }

    public double getPerimeter(){
        return (super.base*2)+(super.height*2);
    }

}