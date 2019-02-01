/*
Carla Pérez Gavilán, A01023033
01/02/2019
Calculadora Métodos
*/
public class Number{

    private static double numero;
    private static String resultado ="";

    //CONSTRUCTOR
    public Number(){
        numero=0.0;
        }
//SUMA 
        //Suma int+int
        public void sum(int a, int b){
            resultado = Integer.toString(a+b);
        }
        //Suma double+double
        public void sum(double a, double b){
            resultado = Double.toString(a+b);
        }
         //Suma int+double
        public void sum(int a, double b){
            resultado = Double.toString(a+b);

        }
          //Suma double+int
        public void sum(double a, int b){
            resultado = Double.toString(a+b);
        }

//RESTA

        //Resta int-int
        public void substract(int a, int b){
            resultado = Integer.toString(a-b);
        }
         //Resta double-double
        public void substract(double a, double b){
            resultado = Double.toString(a-b);
        }
         //Resta int-double
        public void substract(int a, double b){
            resultado = Double.toString(a-b);
        }
        //Resta double-int
        public void substract(double a, int b){
            resultado = Double.toString(a-b);
        }
        
//MULTIPLLICACIÓN
        //multiplicación double*double
        public void multiply(double a, double b){
             resultado = Double.toString(a*b);
        }
         //multiplicación int*int
        public void multiply(int a, int b){
            resultado = Integer.toString(a*b);
        }
         //multiplicación double*int
        public void multiply(double a, int b){
            resultado = Double.toString(a*b);
        }
        //multiplicación int*double
        public void multiply(int a, double b){
            resultado = Double.toString(a*b);
        }


//DIVISIÓN
        //división double/double
       public void divide(double a, double b){
            if(b==0){
                resultado = "INDEFINIDO";
            }else{
                resultado=Double.toString(a/b);
            }
        }
        //división int/double
        public void divide(int a, double b){
            if(b==0){
                resultado = "INDEFINIDO";
            }else{
                resultado=Double.toString(a/b);
            }
        }
        //división double/int
        public void divide(double a, int b){
            if(b==0){
                resultado = "INDEFINIDO";
            }else{
                resultado=Double.toString(a/b);
            }
        }
        //división int/int
        public void divide(int a, int b){
            if(b==0){
                resultado = "INDEFINIDO";
            }else{
                Double temporalA =Double.valueOf(a);
                Double temporalB =Double.valueOf(b);
                resultado=Double.toString(temporalA/temporalB);
            }
        }
// POTENCIA
 public void power(double a, int b){
        numero=1;
            for(int i=0; i<b; i++){
                numero=a*numero;
            }
             resultado=Double.toString(numero);
        }
public void power(int a, int b){
        int num=1;
            for(int i=0; i<b; i++){
                num=a*num;
            }
             resultado=Integer.toString(num);
        }

// RAÍZ CUADRADA
//Raíz de double
public void sqrt(double a){
    resultado="";
    for(double i=0.0; i>=0; i=i+0.001){
        if((a-(i*i))<0.001){
            String temporal =Double.toString(i);
            for(int c=0; c<=temporal.indexOf(".")+3;c++){
                resultado= resultado+temporal.charAt(c);
            }
            i=-1;
        }
    }
}
//RAÍZ CUADRADO
public void sqrt(int a){
    resultado="";
    for(double i=0; i>=0; i=i+0.0001){
        if((a-(i*i))<0.0001){
            String temporal =Double.toString(i);
            for(int c=0; c<=temporal.indexOf(".")+4;c++){
                resultado= resultado+temporal.charAt(c);
            }
            i=-1;
        }
    }
}

//Imprimir resultado
        public void Print(){
            System.out.println(resultado);
         }

} //End class  