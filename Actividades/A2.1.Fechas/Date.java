//Carla Pérez Gavilán, 22/01/2019

public class Date
{

    //ATTRIBUTES
    //Modificador de acceso, buena práctica que sea privado. 
    private int month, day, year;

public void setDate(String date)
    {
        if(date.length() !=10)
        {
        System.out.println("formato incorrecto"); 
        return;
        }
        String[] stringDate;
        stringDate = date.split("/");
        day =Integer.parseInt(stringDate[0]);
        month= Integer.parseInt(stringDate[1]);
        year= Integer.parseInt(stringDate[2]);
    }   

public int getDay()
    {
        return day;
    }  
public int getMonth()
    {
        return month;
    }  
public int getYear()
    {
        return year;
    }  
    
public String getDateString()
    {
       String tempDate=Integer.toString(day)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
        return tempDate;
    }  
public void setDay(int day)
    {
    this.day=day;
    }   
public void setYear(int year)
    {
    //this=misma clase
    this.year=year;
    }   
public void setMonth(int month)
    {
    this.month=month;
    }   
}