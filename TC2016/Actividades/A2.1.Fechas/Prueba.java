public class Prueba
{
    public static void main(String[] args)
    {
        //Pruebas para fecha
        Date myDate = new Date();
        myDate.setDate("24/01/2019");
        System.out.println("El día es: "+myDate.getDay());
        System.out.println("El mes es: "+myDate.getMonth());
        System.out.println("El año es: "+myDate.getYear());

        Date otherDate= new Date();
        otherDate.setDay("20");
        otherDate.setDay("20");
        
        myTime.setTime("11:07:15.17");
        System.out.println(myTime.getTime());
        System.out.println("minutos: "+myTime.getMin());
        System.out.println("horas: "+myTime.getHours());
        System.out.println("segundos: "+myTime.getSeconds());
        System.out.println("milisegundos: "+myTime.getMilisec());

        //Creación de instancia Time
        Time myTime = new Time();
        myTime.setTime("11:07:15.17");
        System.out.println(myTime.getTime());
        System.out.println("minutos: "+myTime.getMin());
        System.out.println("horas: "+myTime.getHours());
        System.out.println("segundos: "+myTime.getSeconds());
        System.out.println("milisegundos: "+myTime.getMilisec());

        Time otherTime =new Time();
        //Camel case, snake case
        otherTime.setHours("17");
        otherTime.setMinutes("22");
        otherTime.setSeconds("32");
        otherTime.setMilisec("02");
        System.out.println(otherTime.getTime());
        
    }
}