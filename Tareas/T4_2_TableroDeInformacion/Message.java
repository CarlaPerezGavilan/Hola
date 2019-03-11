import java.util.GregorianCalendar;
import java.util.Calendar;

public class Message{
    public String message;
    public static Calendar date;

    public Message(String message){
        date= Calendar.getInstance();
        this.message = message;
    }

    public Message(String message, int year, int month, int day, int hour, int min){
        date= new GregorianCalendar(year, month, day, hour, min, 0); 
         this.message = message;
     }
    public void print(){
        System.out.println("* "+date.getTime()+" ---> "+message);
    }

    public boolean equals(Message m){
       if(Message.date.equals(date)){
           if(m.message.equals(message)){
               return true;
           }
       }
       return false;
    }


}