public class Test{
    public static void main(String[] args){
        Point a = new Point(5, 6);
        Point b = new Point(1, 3);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println("La distancia es "+a.getDistance(b));
        System.out.println("La distancia es "+b.getDistance(a));
    }
}