import java.util.Scanner;
import java.util.Arrays;
public class CancionesNominadas implements Iterador{
    
    protected String[] arrayCanciones;
    protected int posicionActual;
    
    public int getPosicionActual(){
        return posicionActual;
    }
    public void setPosicionActual(int posicionActual){
        this.posicionActual=posicionActual;
    }
    
    // Constructores
    public CancionesNominadas(int numeroDeNominadas){
        arrayCanciones= new String[numeroDeNominadas];
    }

    public CancionesNominadas(){
        arrayCanciones= new String[10];
    } 

    //Getters
    public String getCancion(int i){
            return arrayCanciones[i];
    }

    public String[] getArrayCanciones(){
        return arrayCanciones;
    }

    //Setters
    public void setArrayCanciones(){
         Scanner kb = new Scanner(System.in);
       for(int i=0; i<arrayCanciones.length; i++){
          System.out.println("Ingresa la canción"+(i+1));
            String temporal = kb.nextLine();
            arrayCanciones[i]= temporal;
            setPosicionActual(i);
       }
    }

    public void setCancion(String Cancion){
        for(int i=0; i<arrayCanciones.length; i++){
            if(arrayCanciones[i].equals(null)){
                arrayCanciones[i]= Cancion;
            }
              
         }
    }

    public void printArray(){
        System.out.println("Lista de canciones nominadas:"+Arrays.toString(arrayCanciones));
    }

    public void print(){
        while(hasNext()){
            System.out.println("final: "+next());;
        }
    }

}