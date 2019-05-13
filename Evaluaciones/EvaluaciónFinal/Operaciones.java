public class Operaciones
{

    public void transpuesta(MatrizFlotantes matriz)
    {
        int size = matriz.size;
        int x,y;
        MatrizFlotantes nuevaMatriz = new MatrizFlotantes(size);
        for(x=0; x<size; x++)
        {
            for(y=0; y<size; y++)
            {
                nuevaMatriz.setValue(y, x, matriz.getValue(x,y));
            }

        }
        System.out.println("Matriz Transpuesta");
        nuevaMatriz.print();
    }

    public void superior(MatrizFlotantes  matriz)
    {
        MatrizFlotantes nuevaMatriz = new MatrizFlotantes(matriz.size);
        int sizeChange = matriz.size;
        for(int i=0; i<matriz.size; i++){
            for(int j=0; j<sizeChange; j++)
            {
                nuevaMatriz.setValue(i, j, matriz.getValue(i,j));
            }
            sizeChange--;
        }
        System.out.println("Matriz Superior");
        nuevaMatriz.print();
    }

     public void inferior(MatrizFlotantes  matriz)
    {
        MatrizFlotantes nuevaMatriz = new MatrizFlotantes(matriz.size);
        int sizeChange = matriz.size;
        int count=0;
        for(int j=matriz.size-1; j>=0; j--){
            for(int i=sizeChange-1; i>=0 & i>=count; i--)
            {
                nuevaMatriz.setValue(j, i, matriz.getValue(j,i));
            }
            count++;
        }
        System.out.println("Matriz Inferior");
        nuevaMatriz.print();
    }
    
}