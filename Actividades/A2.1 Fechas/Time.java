//Carla Pérez Gavilán, 22/01/2019

public class Time
{

    //ATTRIBUTES. 
    private String hours, seconds, minutes, milisec;

//Ingresar hora, segundos y minutos por separado 
public void setHours(String hours){
    this.hours=hours;
}
public void setSeconds(String seconds){
    this.seconds=seconds;
}
public void setMinutes(String minutes){
    this.minutes=minutes;
}

public void setMilisec(String milisec){
    this.milisec=milisec;
}

//Ingresar una hora completa en formato (hh:mm:ss.ms)
public void setTime(String time)
    {
        if(time.length() !=11)
        {
        System.out.println("formato incorrecto"); 
        return;
        }
        String[] stringTime;
        stringTime = time.split(":");
        hours =stringTime[0];
        minutes= stringTime[1];
        String sec=stringTime[2];
        seconds=sec.charAt(0)+""+ sec.charAt(1);
        milisec=sec.charAt(3)+""+sec.charAt(4);

    }   

//Obtener los hora, minutos, segundos y milisegundos (cada valor por separado)
public String getHours()
    {
        return hours;
    }  
public String getSeconds()
    {
        return seconds;
    }  
public String getMin()
    {
        return minutes;
    }  
public String getMilisec()
    {
        return milisec;
    }    

//Obtener la hora completa
public String getTime()
    {
       String tempTime=hours+":"+minutes+":"+seconds+"."+milisec;
        return tempTime;
    }  
} 