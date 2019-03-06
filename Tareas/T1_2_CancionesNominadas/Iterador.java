public interface Iterador{
    int getPosicionActual();
    void setPosicionActual(int i);
    String[] getArrayCanciones();

    default boolean hasNext(){
            if(getPosicionActual()<10){
              return true;  
            }
            return false;  
        }

    default String next(){
        int temporal = getPosicionActual();
        if(temporal ==10)
            return getArrayCanciones()[getPosicionActual()]; 
        temporal= temporal+1;
        setPosicionActual(temporal);
            return getArrayCanciones()[getPosicionActual()-1]; 

        }

    default void restablecerPosicionActual(){
        setPosicionActual(0);
    } 

    default void remove(){
            getArrayCanciones()[getPosicionActual()]="null";
    } 

}