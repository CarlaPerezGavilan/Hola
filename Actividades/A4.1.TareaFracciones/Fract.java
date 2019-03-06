//FECHA: 29 de enero de 2018
//Carla Pérez Gavilán Del Castillo 
public class Fract
{

/*REGLAS/OPCIONES:
1. No hay constructores.
2. Constructor por default.
3. Constructor con parámetros. SIEMPRE DEBE HABER UN CONSTRUCTOR POR DEFAULT 
*/
    private int numerator;
    private int denominator; 

    //Get numerator and denominator
    public int getNumerator(){
        return numerator;
    }
     public int getDenominator(){
        return denominator;
    }

    //Constructores
    public Fract(int numerator, int denominator){
        this.numerator = numerator; 
        if(denominator==0){
            System.out.println("ERROR");
            denominator =1;
        }
        this.denominator  = denominator;
    }
    //Default lo que no es válido en el constructor con parámetros
     public Fract(){
        numerator=1; 
        denominator=1;
    }

    //La fracción resultante se guarda en un nuevo objeto  
    public Fract multiply(Fract f2)
    {
        int numRes= numerator*f2.getNumerator();
        int denRes= denominator*f2.getDenominator();

        Fract result = new Fract(numRes, denRes);
        return result;
    }

    public void Print(){
        if (denominator==1)
            System.out.println(numerator);
        else
        System.out.println(numerator+"/"+denominator);    
        
    }

    public void Simplify(){
        int cont=denominator;
        while(cont<=denominator){
            if(numerator%cont ==0 && denominator%cont==0){
                numerator/= cont;
                denominator/=cont;
            }else{
             cont--;
            }
        }
    }

    //Constructor copia
    public Fract(Fract)
}