public class Square extends Figure implements Figures{
   

    public Square(){
        super.NumberOfSides=4;
        super.base=0;
        for(int i=0; i<4; i++){
            super.arraySides[i]=0;
        }
    }

    public Square(double base){
        super.NumberOfSides=4;
        super.base = base;
        for(int i=0; i<4; i++){
            super.arraySides[i]=base;
        }
    }

    public double getArea(){
        return super.base*super.base;
    }

    public double getPerimeter(){
        return super.base*4;
    }

}