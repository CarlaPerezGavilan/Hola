import java.time.LocalDateTime;
import java.util.Date;
public class Caballo{
    protected String nombre;
    protected String color;
    protected Date dateBirth;

    public Caballo(String nombre, String color, int year, int month, int day){
        this.nombre=nombre;
        this.color=color;
        dateBirth= new Date(year, month, day);
        
    }

}