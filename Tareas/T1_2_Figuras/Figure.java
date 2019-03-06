public class Figure{
    protected int NumberOfSides;
    protected double[] arraySides;
    protected double base; 
    protected double height; 

    public Figure(){
        NumberOfSides=0;
        arraySides = new double[4];
    }
    public Figure(int NumberOfSides){
        this.NumberOfSides= NumberOfSides;
        arraySides = new double[NumberOfSides];
    }

    
}