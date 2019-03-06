package Actividades.A2_2_ClasesAbstractas;

public class Button extends GraphicComponent implements Clickeable {

    public Button(){

    }

    public void click(int y, int x){
        System.out.println("dando click en "+x+ " "+y);
    }
    public  void drawComponent(){
        System.out.println("estoy dibujando un botón en la posición "+position.x+" y "+position.y);
    }
    public void setLocation(Point p){
        position = p; 
    }
    public void setBackgroundColor(Color c){
        background = c;
    }
}