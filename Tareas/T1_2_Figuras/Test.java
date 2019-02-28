import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
     // Crear Scanner
        Scanner sc = new Scanner(System.in);
    
    //Inicializar variables
    int option =0;
    double sideA=0, sideB=0, sideC=0,base=0, height=0;
 
    while(option!=7){
    // Pedir al usuario opción
    System.out.println("¿Qué figura desea seleccionar?\n1.Cuadrado\n2.Triángulo\n3.Paralelogramo\n4.Rombo\n5.Rectángulo\n6.Trapecio\n7. EXIT");
    option = sc.nextInt();

        switch(option){

            case 1:

        // Pedir datos al usuario
            System.out.println("Ingresa el lado del cuadrado:");
            double lado = sc.nextDouble();
        // Creación de cuadrado 
            Square cuadrado = new Square(lado);
            System.out.println("El área del cuadrado es: "+cuadrado.getArea()+"cm^2 \nEl perímetro del cuadrado es: "+cuadrado.getPerimeter()+"cm.");
            break;

            case 2: 
        // Pedir datos al usuario
                System.out.println("Ingresa la altura del triángulo");
                height = sc.nextDouble();
                System.out.println("Ingresa el lado que deseas que sea la base:");
                base = sc.nextDouble();
                System.out.println("Ingresa el lado A:");
                sideA = sc.nextDouble();
                System.out.println("Ingresa el lado B:");
                sideB= sc.nextDouble();
        // Creación de figura y realización de métodos de Área y Perímetro
                Triangle triangulo = new Triangle(sideA, sideB, base, height);
                System.out.println("El area del tríangulo es: "+triangulo.getArea()+"\n El perímetro del triángulo es: "+triangulo.getPerimeter());
                break;

            case 3: 
                System.out.println("Ingresa la altura del paralelogramo");
                height = sc.nextDouble();
                System.out.println("Ingresa la base:");
                sideA = sc.nextDouble();
                System.out.println("Ingresa el valor de los lados:");
                sideB= sc.nextDouble();

                Parallelogram paralelo= new Parallelogram(sideA, height, sideB);
                System.out.println("El área del paralelogramo es: "+paralelo.getArea()+" cm^2 \nEl perímetro del paralelogramo es: "+paralelo.getPerimeter()+" cm ");
                break;

            case 4:
                System.out.println("Ingresa la DIAGONAL MAYOR del rombo:");
                height = sc.nextDouble();
                System.out.println("Ingresa la diagonal menor del romnbo");
                sideA = sc.nextDouble();
                System.out.println("Ingresa el valor de el primer par de lados: ");
                sideB= sc.nextDouble();
                System.out.println("Ingresa el valor del segundo par de lados:");
                sideC= sc.nextDouble();

                Rhombus rombo = new Rhombus(sideC, sideB, height, sideA);
                System.out.println("El área del romobo es: "+rombo.getArea()+" cm^2 \nEl perímetro del rombo es: "+rombo.getPerimeter()+" cm");
                break;

            case 5: 
                System.out.println("Ingresa la altura del rectángulo");
                height = sc.nextDouble();
                System.out.println("Ingresa la base:");
                sideA = sc.nextDouble();

                Rectangle rectangulo = new Rectangle(sideA,height);
                System.out.println("El área del rectángulo es: "+rectangulo.getArea()+"cm^2 \n El perímetro del rectángulo es: "+rectangulo.getPerimeter()+" cm");
                break;

            case 6:
                System.out.println("Ingresa la altura del trapecio");
                height = sc.nextDouble();
                System.out.println("Ingresa la base MAYOR del trapecio");
                sideC = sc.nextDouble();
                System.out.println("Ingresa la base menor del trapecio");
                sideA = sc.nextDouble();
                System.out.println("Ingresa el valor de los dos lados:");
                sideB= sc.nextDouble();

                Trapezoid trapecio = new Trapezoid(sideC, sideA, sideB, height);
                System.out.println("El área del trapecio es: "+trapecio.getArea()+" cm^2 \nEl perímetro del trapecio es: "+trapecio.getPerimeter()+" cm");
                break;
        }//End switch
    }//End While  
       
    // Pruebas de diferencia de area
    Triangle trianguloA = new Triangle(4.5, 3.0, 4.8, 5.0);
    Square  cuadradoA = new Square(5.6);
    System.out.println(trianguloA.areaDifference(cuadradoA));
    }
}