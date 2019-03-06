//25 de enero de 2019
public class Point{
  
    private double x,y;

    //SET VARIABLES
      //Constructor sin parámetros
      public Point(){
          System.out.println("Constructor sin parámetros");
       }
    //Constructor con parámetros
    //Siempre públicos
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    //GET VARIABLES
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double getDistance(Point p){
      
        double distance = 0.0;
        distance= Math.sqrt(Math.pow(p.getX()-x, 2)+Math.pow(p.getY()-y, 2));
        return distance;
    }
}