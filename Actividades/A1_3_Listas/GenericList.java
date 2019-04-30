 
public class GenericList<T> implements ListInterface<T>
    protected Object[] array;
    protected int cont;
    public GenericList(){
        array = new Object[10];
        cont=0;
    }
    public void add(Object element){
        if (cont>=10)
            return;
        array[cont++] = element;
    }
   public void remove(int index){
        for(int i=index; i<(cont-1); i++){
            array[i] = array[i+1];
        }
        array[cont] = null;
        cont--;
    }

    public int find(Object element){
        int i=0;
        for(Object ele: array){
            if(element.equals(ele)){
                return i;
            }
            i++;
        }
        return -1;   
    }
   public Object get(int i){
       if(i > cont || i < 0){
        System.out.println("No existe tal posición");
        return null;
       }
       else
        return array[i];
   }

public Object[] getList(){
    return array;
}
public void print(){
        for(int i=0; i<cont; i++){
            System.out.println("i "+ array[i]);
        }
        
}
}