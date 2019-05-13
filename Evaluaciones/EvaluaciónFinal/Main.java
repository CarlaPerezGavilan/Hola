public class Main
{
    public static void main(String[] args) 
    {
    MatrizFlotantes a = new MatrizFlotantes(3);

    a.setValue(0,0, new Flotante("1"));
    a.setValue(0,1, new Flotante("2"));
    a.setValue(0,2, new Flotante("3"));
    a.setValue(1,0, new Flotante("4"));
    a.setValue(1,1, new Flotante("5"));
    a.setValue(1,2, new Flotante("6"));
    a.setValue(2,0, new Flotante("7"));
    a.setValue(2,1, new Flotante("8"));
    a.setValue(2,2, new Flotante("9"));

    a.print();

    Operaciones o = new Operaciones();
    o.transpuesta(a);
    o.superior(a);
    o.inferior(a);



    // Prueba con matriz de 16
       MatrizFlotantes b = new MatrizFlotantes(4);

    b.setValue(0,0, new Flotante("1"));
    b.setValue(0,1, new Flotante("2"));
    b.setValue(0,2, new Flotante("3"));
    b.setValue(0,3, new Flotante("4"));
    b.setValue(1,0, new Flotante("5"));
    b.setValue(1,1, new Flotante("6"));
    b.setValue(1,2, new Flotante("7"));
    b.setValue(1,3, new Flotante("8"));
    b.setValue(2,0, new Flotante("9"));
    b.setValue(2,1, new Flotante("10"));
    b.setValue(2,2, new Flotante("11"));
    b.setValue(2,3, new Flotante("12"));
    b.setValue(3,0, new Flotante("13"));
    b.setValue(3,1, new Flotante("14"));
    b.setValue(3,2, new Flotante("15"));
    b.setValue(3,3, new Flotante("16"));

    
    b.print();

    o.transpuesta(b);
    o.superior(b);
    o.inferior(b);
    }
}