public class MatrizFlotantes 
{
    public Flotante[][] matriz; 
    public int size;
    public int posiciony;
    public int posicionx;

    public MatrizFlotantes(int i){
        matriz = new Flotante[i][i];
        size = i;
        posiciony=0;
        posicionx=0;
    }

    public void setValue(int x, int y, Flotante f){
        matriz[x][y] = f;
    }

    public Flotante getValue(int x, int y){
        return matriz[x][y];
    }

    public int getSize(){
        return size;
    }

    public void addValues(Flotante[] arregloFlotante){
        int length = arregloFlotante.length;
        int i;
        while(length>=0){
        for(i=0; i<size; i++){
            matriz[posicionx][posiciony++] = arregloFlotante[i];
            }
        if(i==size){
            i=0;
            posicionx++;
        }
        }
      
       
    }

    public void print()
    {
        System.out.println("Impresión matriz de "+size);
        for(int x=0; x<size; x++)
        {
            System.out.print("[");
            for(int y=0; y<size; y++)
            {
                if(matriz[x][y]!= null){
                    matriz[x][y].print();
                    
                }else{
                    System.out.print("0 ");
                }
                if(y<size-1){
                    System.out.print(",");
                }
               
            }
            System.out.print("] \n");
        }   
    }

}