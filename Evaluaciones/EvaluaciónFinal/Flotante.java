public class Flotante
{
    public Float flotante;
    public int size;

    // Constructuor
    public Flotante(String f){
            Float temp = Float.parseFloat(f);
            flotante = temp;
            size = flotante.SIZE;
    } 

    public void print(){
        System.out.print(flotante.toString());
    }

    public Float getFloat(){
        return flotante;
    }
}